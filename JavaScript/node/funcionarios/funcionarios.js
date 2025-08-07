const url = "http://files.cod3r.com.br/curso-js/funcionarios.json";
const axios = require("axios");

axios.get(url).then((response) => {
  const funcionarios = response.data;

  // for (let funcionario in funcionarios) {
  //     if (funcionario.genero === 'F') {
  //         funcionariasMulheres.push(funcionario);
  //     }
  // }

  const mulher = (funcionaria) => funcionaria.genero === "F";
  const chinesa = (chinesa) => chinesa.pais === "China";
  const menorSalario = (func, funcAtual) =>
    func.salario > funcAtual.salario ? funcAtual : func;
  // se o salario do func for maior que a do funcAtual(que esta percorrendo o array)
  // retorna o funcAtual(menor salario), senao retorna o func que é a que tem menor salario ate o momento

  const funcionariaChinesa = funcionarios
    .filter(mulher)
    .filter(chinesa)
    .reduce(menorSalario);

  console.log(funcionariaChinesa);
});
