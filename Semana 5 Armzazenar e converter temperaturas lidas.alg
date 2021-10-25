algoritmo "Missão Sem. 5 - Conv. Temperaturas"
// Função : Armazenar e converter dados de temperaturas lidas ao longo do dia.
// Autor : Gustavo F. vetter
// Data : 25/10/2021
// Seção de Declarações 
var
dadoslidos, hora, temperatura: vetor [1..2] de inteiro

procedimento lerdados (): inteiro
var
hora, temperatura: vetor [1..2] de inteiro
//dadoslidos: inteiro
i, j, aux: inteiro
menu1: literal
inicio
para aux de 1 ate 2 faca
     escreval("Informe a hora que a temperatura foi lida:")
     leia (hora[i])
     escreval("Informe o valor da temperatura a ser convertida:")
     leia (temperatura[j])
fimpara
fimpara
fimprocedimento


procedimento consultartemperaturas (): literal
var
menu2: literal
inicio
escreval ("Deseja consultar as temperaturas lidas ao longo do dia?")
escreval ("Digite 1 para SIM")
escreval ("DIgite 2 para NÃO")
leia (menu2)
     escolha menu2
            caso "1"
                 escreval dadoslidos[hora,temperatura]
            caso "2"
                 escreval ("Até mais")
     fimescolha

fimprocedimento

inicio

lerdados()

consultartemperaturas ()


fimalgoritmo
