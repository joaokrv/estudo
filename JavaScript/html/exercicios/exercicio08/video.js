function iniciar() {
  playVideo();
  pauseVideo();
  progresso();
}

function playVideo() {
  const botaoPlay = document.querySelector('[wm-play="meuVideo"]');
  const video = document.getElementById("meuVideo");

  botaoPlay.addEventListener("click", () => {
    video.play();
  });
}

function pauseVideo() {
  const botaoPause = document.querySelector('[wm-pause="meuVideo"]');
  const video = document.getElementById("meuVideo");

  botaoPause.addEventListener("click", () => {
    video.pause();
  });
}

function progresso() {
  const barraProgressoInterna = document.querySelector(".progresso > div");
  const video = document.getElementById("meuVideo");
  const duracaoSpan = document.getElementById("duracao-video");

  video.addEventListener("timeupdate", () => {
    const porcentagem = (video.currentTime / video.duration) * 100;
    barraProgressoInterna.style.width = `${porcentagem}%`;
    duracaoSpan.innerText = porcentagem.toFixed(1) + " %";
  });
}

iniciar();
