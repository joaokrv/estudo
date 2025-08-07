function tratarErro(error) {
    throw new Error("Erro!");
    
    // throw {
    //     nome: error.name,
    //     msg: error.message,
    //     date: new Date
    // }
}

function printName(obj) {
    try {
        console.log(obj.name.toUpperCase() + '!!!');
    } catch (error) {
        tratarErro(error);
    } finally {
        console.log("Final!");
    }
}

const obj = { nome: 'Roberto' }