const schedule = require("node-schedule");

console.log("Iniciando o script de agendamento...");
console.log("A hora local do sistema é:", new Date().toLocaleTimeString());
console.log("Aguardando tarefas...");

const tarefa1 = schedule.scheduleJob("*/15 * * * * *", function () {
  console.log(
    `[Tarefa 1] Executando... O segundo atual é ${new Date().getSeconds()}`
  );
});

const regra = new schedule.RecurrenceRule();
// regra.dayOfWeek = [new schedule.Range(0, 6)];
// regra.hour = 13;
regra.second = 10;

const tarefa2 = schedule.scheduleJob(regra, function () {
  console.log("**********************************************");
  console.log(`[Tarefa 2] EXECUTOU! Hora: ${new Date().toLocaleTimeString()}`);
  console.log("**********************************************");
});

setTimeout(function () {
  tarefa1.cancel();
  console.log("Cancelando Tarefa 1!");
}, 65000);
