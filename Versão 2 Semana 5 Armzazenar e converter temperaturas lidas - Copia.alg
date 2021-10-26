algoritmo "Missão Sem. 5 - Conv. Temperaturas"
// Função : Armazenar e converter dados de temperaturas lidas ao longo do dia.
// Autor : Gustavo F. vetter
// Data : 25/10/2021
// Seção de Declarações 
var
temperatura, hora: vetor [1..2] de inteiro


//----------------------------------------------------------
procedimento lerdados ()
var
temperatura, hora: vetor [1..2] de inteiro
i, j, aux: inteiro
menu1: literal
inicio
aux <- 0
para aux de 1 ate 2 faca
     escreval("Informe o valor da temperatura a ser convertida:")
     leia (temperatura[aux+i])
     escreval("Informe a hora que a temperatura foi lida:")
     leia (hora[aux+j])
     escreval ("")
fimpara
fimprocedimento
//----------------------------------------------------------
procedimento consultartemperaturas ()
var
menu2: literal
hora, temperatura: vetor [1..2] de inteiro
//i: inteiro
inicio
repita
escreval ("")
escreval ("Deseja consultar as temperaturas lidas ao longo do dia?")
escreval ("Digite 1 para SIM")
escreval ("DIgite 2 para NÃO e Sair do Menu")
escreval ("")
leia (menu2)
     escolha menu2
            caso = "1"
                 para (hora[i]) de 1 ate 2 faca
                 escreval (hora[i])
                 fimpara
     fimescolha
ate menu2 = "2"
    escreval ("")
    escreval ("Até a próxima. Obrigado por usar nosso app.")
    escreval ("")
fimprocedimento
//----------------------------------------------------------
inicio

lerdados()

consultartemperaturas ()


fimalgoritmo
