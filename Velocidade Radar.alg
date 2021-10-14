algoritmo "Radar"
// Função : Aferir infrações de trânsito
// Autor : Gustavo F. Vetter
// Data : 10/10/2021
// Seção de Declarações 
var
velocidade, infracaoLeve, infracaoMedia, infracaoGrave, infracaoGravissima: real
inicio
// Seção de Comandos 
infracaoLeve <- 50 * 1,1
infracaoMedia <- 70
infracaoGrave <- 90
infracaoGravissima <- 110

Escreval("Qual sua velocidade no radar?")
leia (velocidade)

se velocidade <= 54 entao
   Escreval ("Boa viagem e respeite os limites de velocidade da via.")

senao
     se velocidade < infracaoMedia entao
     Escreval ("Infração Leve: 3 pontos na sua CNH")
senao
     se velocidade < infracaoGrave entao
     Escreval ("Infração Média: 4 pontos na sua CNH")
senao
     se velocidade < infracaoGravissima entao
     Escreval ("Infração Grave: 5 pontos na sua CNH")
senao
     Escreval ("Infração Gravíssima: 7 pontos na sua CNH. Volte para a Auto-Escola")
fimse
fimse
fimse
fimse
fimalgoritmo
