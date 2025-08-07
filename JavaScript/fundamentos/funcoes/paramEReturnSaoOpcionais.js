function area(largura, altura) {
    const area = largura * area;
    if (area > 20) {
        console.log(`Área acima da permitida: ${area}m2`);
    } else {
        return area;
    }
}

console.log(area(2, 2));
console.log(area(2));
console.log(area());
console.log(area(2, 2, 3, 4, 5, 6, 7));
console.log(area(5, 5));