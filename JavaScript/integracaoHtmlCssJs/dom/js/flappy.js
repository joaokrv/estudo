const areaJogo = document.querySelector("[wm-flappy]");
const espaco = 200;
const alturaTela = areaJogo.offsetHeight;
const larguraTela = 850;

let intervaloCanos;

function iniciar() {
  let primeiraVez = true;

  window.addEventListener("keydown", (evento) => {
    if (
      primeiraVez &&
      (evento.key === " " ||
        evento.key === "ArrowUp" ||
        evento.key.toLowerCase() === "w")
    ) {
      executar();
      primeiraVez = false;
    }
  });

  window.addEventListener("mousedown", (evento) => {
    if (primeiraVez && evento.button === 0) {
      executar();
      primeiraVez = false;
    }
  });

  function executar() {
    passaro();
    intervaloCanos = setInterval(criarParDeCanos, 3000);
  }
}

function criarParDeCanos() {
  const alturaCanoSuperior = Math.random() * (alturaTela - espaco);

  const par = document.createElement("div");
  par.classList.add("par-de-canos");
  par.style.position = "absolute";
  par.style.left = larguraTela + "px";

  const canoSuperior = document.createElement("div");
  canoSuperior.classList.add("cano", "cano-superior");
  canoSuperior.style.height = alturaCanoSuperior + "px";

  const canoInferior = document.createElement("div");
  canoInferior.classList.add("cano", "cano-inferior");
  canoInferior.style.height = alturaTela - espaco - alturaCanoSuperior + "px";

  const topoSuperior = document.createElement("div");
  topoSuperior.classList.add("topo-cano-superior");

  const topoInferior = document.createElement("div");
  topoInferior.classList.add("topo-cano-inferior");

  par.appendChild(canoSuperior);
  canoSuperior.appendChild(topoSuperior);
  par.appendChild(canoInferior);
  canoInferior.appendChild(topoInferior);
  areaJogo.appendChild(par);

  let x = larguraTela;
  const intervalo = setInterval(() => {
    x -= 3;
    par.style.left = x + "px";

    if (x < -100) {
      par.remove();
      clearInterval(intervalo);
    }
  }, 20);
}

function passaro() {
  const passaro = document.createElement("div");
  passaro.classList.add("passaro");
  passaro.id = "passaro";
  passaro.style.position = "absolute";
  passaro.style.top = "400px";
  passaro.style.left = "250px";
  areaJogo.appendChild(passaro);
  gravidadeAnimada();
}

function gravidadeAnimada() {
  const passaro = document.getElementById("passaro");
  let y = parseFloat(passaro.style.top);
  let velocidade = 0;
  const gravidade = 0.5;
  const impulso = -10;

  console.log(passaro.style.top);

  window.addEventListener("keydown", (evento) => {
    if (
      evento.key === " " ||
      evento.key === "ArrowUp" ||
      evento.key.toLowerCase() === "w"
    ) {
      // let queda = passaro.style.top.replace("px", "");
      // queda = Number(queda) - 10;
      // passaro.style.top = queda + "px";
      // console.log("queda->", queda);

      // console.log("style.top->", passaro.style.top);
      velocidade = impulso;
    }
  });

  window.addEventListener("mousedown", (evento) => {
    if (evento.button === 0) {
      velocidade = impulso;
    }
  });

  function animar() {
    velocidade += gravidade;
    y += velocidade;

    const limiteChao = alturaTela - passaro.offsetHeight;
    if (y > limiteChao) {
      y = limiteChao;
      velocidade = 0;
    }

    if (y < 0) {
      y = 0;
      if (velocidade < 0) velocidade = 0;
    }

    passaro.style.top = y + "px";

    const paresDeCanos = document.querySelectorAll(".par-de-canos");
    for (let par of paresDeCanos) {
      if (checarColisaoPar(passaro, par)) {
        alert("Game Over!");
        resetarJogo();
        return;
      }
    }

    requestAnimationFrame(animar);
  }

  requestAnimationFrame(animar);

  const rect = passaro.getBoundingClientRect();
  console.log(rect.top);
}

function checarColisaoPar(passaro, parDeCanos) {
  const passaroRect = passaro.getBoundingClientRect();

  const canoSuperior = parDeCanos.querySelector(".cano-superior");
  const canoInferior = parDeCanos.querySelector(".cano-inferior");

  const supRect = canoSuperior.getBoundingClientRect();
  const infRect = canoInferior.getBoundingClientRect();

  const colisaoSup =
    passaroRect.left < supRect.right &&
    passaroRect.right > supRect.left &&
    passaroRect.top < supRect.bottom &&
    passaroRect.bottom > supRect.top;

  const colisaoInf =
    passaroRect.left < infRect.right &&
    passaroRect.right > infRect.left &&
    passaroRect.top < infRect.bottom &&
    passaroRect.bottom > infRect.top;

  return colisaoSup || colisaoInf;
}

function resetarJogo() {
  clearInterval(intervaloCanos);

  const passaro = document.getElementById("passaro");
  if (passaro) passaro.remove();

  const paresDeCanos = document.querySelectorAll(".par-de-canos");
  paresDeCanos.forEach((par) => par.remove());

  window.onkeydown = null;
  window.onmousedown = null;

  iniciar();
}

iniciar();
