algoritmo "Vetores nùmeros e Números Reversos Versão 3"
// Função : Atribuir valores em posições opostas nos vetores
// Autor : Gustavo F. Vetter
// Data : 22/10/2021
// Seção de Declarações 
var
numeros, numerosreversos : vetor[1..5] de inteiro
i, aux : inteiro
opcao : literal

inicio

para i de 1 ate 5 faca
     escreval ("Número ",i)
     leia(numeros[i])
fimpara

aux <- 6

para i de 1 ate 5 faca
     numerosreversos[aux-i] <- numeros[i]
     //escreval ("Números Reversos = ", numerosreversos[i])
fimpara

aux <- 0

para i de 1 ate 5 faca
     escreval ("Números Reversos --> ", numerosreversos[i])
fimpara

fimalgoritmo
