//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
//- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
//- "print": imprime um texto de saída (output), pulando linha.

const saldoAtual = 1000
const valorDeposito = 500
const valorRetirada = 200

//TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio


function deposito(){
  saldoAtual+ valorDeposito;
  console.log("Saldo atualizado na conta", valorDeposito.toFixed(1))
}

function saque(){
  if(valorRetirada  <= saldoAtual){
    console.log("Saldo atualizado na conta", valorRetirada.toFixed(1))
    saldoAtual - valorRetirada;
  }else{
    console.log("Não a saldo suficiente")
  }
}


//TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).


deposito();
saque();
console.log("Saldo atualizado na conta: ", saldoAtual);