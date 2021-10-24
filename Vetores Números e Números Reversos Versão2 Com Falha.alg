algoritmo "Vetores nùmeros e Números Reversos Versão 2"
// Função : Atribuir valores em posições opostas nos vetores
// Autor : Gustavo F. Vetter
// Data : 22/10/2021
// Seção de Declarações 
var
numeros, numerosreversos : vetor[1..5] de inteiro
atividade, aux : inteiro
opcao : literal

inicio

para atividade de 1 ate 5 faca
     escreval ("Número ",atividade)
     leia (numeros[atividade])
     escreval ("Você digitou ", numeros[atividade])
fimpara

//aux <- 6

para atividade de 5 ate 1 passo -1 faca
     //numerosreversos[aux-atividade] <- numeros[atividade]
     numerosreversos[atividade] <- numeros[atividade]
     //escreval ("Números Reversos = ", numerosreversos[atividade])
     escreval ("Números Reversos = ", numeros[atividade])
fimpara

fimalgoritmo
