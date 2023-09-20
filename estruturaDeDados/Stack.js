/*pilhas é uma coleção ordenada e items que obedece um princípio de LIFO o último a entrar e o primeiro
a sair.O final é o  topo e o inicio é a base. também é usada para armazemar variáveis e métodos. */


class Stack{ // Para iniciar na própria classe
    constructor(){
        this.items = [];
    }
    //Métodos 
    
    push(element) { // adiciona elementos no topo da pilha.
        this.items.push(element);
    }

    pop() { //remove items do topo da lista 
        return this.items.pop();
    }

    peek(){ //Para saber qual o último elemento adicionado em nossa pilha. Devolvéra o item que está no topo
        return this.items[this.items.length -1 ];
    }
    isEmpty(){
        return this.items.lengh === 0;
        /* este método devolve true se a pilha estiver vazia e False caso contrário */
    }
    clear(){ // remove todos os elementos 
        this.items = [];
    }

    toString(){
        if(this.isEmpty()){
            return ' ';
        }

        let objString = `${this.items[0]}`;
        for(let i = 1; i< this.count; i++){
            objString = `${objString}, ${this.items[i]}`;
        }
        return objString;
    }   
    
    
}

