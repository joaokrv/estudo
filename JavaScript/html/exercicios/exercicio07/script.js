function slider() {
  const elementos = document.querySelectorAll("[wm-slider] > p");
  const slides = Array.from(elementos);
  printSlides(slides, slides[0]);
}

function printSlides(slides, slide) {
  slide.style.display = "block";

  const inicio = innerWidth;
  const fim = -slide.clientWidth;
  slide.style.left = `${inicio}px`;

  moverSlides(slide, slides, inicio, fim, 10);
}

function moverSlides(slide, slides, inicio, final, passo) {
  const novoInicio = inicio - passo;

  if (novoInicio > final) {
    slide.style.left = `${novoInicio}px`;
    setTimeout(() => moverSlides(slide, slides, novoInicio, final, passo), 30);
  } else {
    slide.style.display = "none";
    printSlides(slides, getProximo(slides, slide));
  }
}

function getProximo(slides, slideAtual) {
  let index = 0;
  index = slides.indexOf(slideAtual) + 1;

  return index < slides.length ? slides[index] : slides[0];

  // if (index >= slides.length) {
  //   return slides[0];
  // } else {
  //   return slides[index];
  // }
}

slider();
