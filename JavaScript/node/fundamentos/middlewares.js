// padrao chain of responsabilty / middleware

const passo1 = (contexto, next) => {
  contexto.valor1 = "mid1";
  next();
};

const passo2 = (contexto, next) => {
  contexto.valor2 = "mid2";
  next();
};

const passo3 = (contexto) => (contexto.valor3 = "mid3");

const exec = (ctx, ...middlewares) => {
  const execPasso = (i) => {
    middlewares &&
      i < middlewares.length &&
      middlewares[i](ctx, () => execPasso(i + 1));
  };

  //   if (middlewares && i < middlewares.length) {
  //     middlewares[i](ctx, () => execPasso(i + 1));
  //   };

  execPasso(0);
};

const contexto = {};
exec(contexto, passo1, passo2, passo3);
console.log(contexto);
exec(contexto, passo2, passo1, passo3);
console.log(contexto);
