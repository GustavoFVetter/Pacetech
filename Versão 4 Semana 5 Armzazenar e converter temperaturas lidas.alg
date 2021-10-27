algoritmo "Missão Sem. 5 - Conv. Temperaturas"
// Função : Armazenar e converter dados de temperaturas lidas ao longo do dia.
// Autor : Gustavo F. vetter
// Data : 25/10/2021
// Seção de Declarações 
var
temperatura, hora: vetor [1..4] de real
i, j: inteiro
menu: literal


//----------------------------------------------------------
procedimento lermenu1 () //Apresenta o menu geral de opções
var
menu1: literal
inicio
repita
      escreval ("")
      escreval ("Digite:")
      escreval ("1 para informar dados de temperaturas")
      escreval ("2 para conferir os dados informados")
      escreval ("3 para converter temperaturas")
      escreval ("4 para ler os dados em ordem crescente de temperatura")
      escreval ("5 para sair do menu e encerrar este programa")
      escreval ("")
      leia (menu1)
      
      escolha (menu1)
             caso "1" //Aqui quero registrar os dados (temperatura + hora)
                  escreval("")
                  informardados()
                  escreval("")
             caso "2" //Aqui quero conferir os dados registrados
                  escreval("")
                  escreval("Abaixo os dados registrados, na sequencia em que foram inseridos")
                  conferirdados
                  escreval("")
             Caso "3" //Aqui quero chamar o procedimento para converter temperaturas
                  escreval("")
                  convertertemperaturas
                  escreval("")
             Caso "4"
                  escreval("") //aqui quero chamar o procedimento para ler os dados em ordem crescente de temperatura
                  ordenarimpressao
                  escreval("")
      fimescolha

ate menu1 = "5"
    escreval ("")
    escreval ("------------------------------")
    escreval ("Fim de execução deste programa")
    escreval ("------------------------------")
    escreval ("")

fimprocedimento

//----------------------------------------------------------

procedimento informardados()
// Este procedimento serve apenas para registrar os dados nos vetores
var
i, aux: inteiro
inicio
i <- 1

para i de 1 ate 4 faca
     escreval ("")
     escreval("Informe o valor da temperatura a ser registrada:")
     leia (temperatura[i])
     escreval("Informe a hora que esta temperatura foi lida, no formato hhmm:")
     leia (hora[i])
     escreval ("")
fimpara

fimprocedimento

//----------------------------------------------------------

Procedimento conferirdados
// Este procedimento serve apenas para conferir os dados registrados
var
i : inteiro

inicio
i <- 1
para i de 1 ate 4 faca
     escreval (temperatura[i]," graus às", hora[i]," horas")
     fimpara

fimprocedimento

//----------------------------------------------------------

procedimento convertertemperaturas
//Este procedimento serve para converter os registros, cfe. menu de opções
var
menu3: literal
i : inteiro
inicio

      escreval ("")
      escreval ("Digite a opção desejada:")
      escreval ("1 para converter o registro de C para F")
      escreval ("2 para converter o registro de F para C")
      escreval ("3 para retornar ao menu principal")
      escreval ("")
      leia (menu3)

      escolha (menu3)

              caso "1" //converter de C para F
                   escreval ("")
                   escreval ("O valor original de registro de temperaturas em Celsius foi convertido para:")
                   para i de 1 ate 4 faca
                        temperatura[i] <- (temperatura[i] * 1.8) + 32
                        escreval (temperatura[i], " graus Farenheit às", hora[i], " horas")
                   fimpara

              caso "2" //converter de F para C
                   escreval ("")
                   escreval ("O valor original de registro de temperaturas em Farenheit foi convertido para:")
                   para i de 1 ate 4 faca
                        temperatura[i] <- (temperatura[i] - 32) * 0.5555
                        escreval (temperatura[i], " graus Celsius às", hora[i], " horas")
                   fimpara
              caso "3"
                   escreval ("")
                   escreval ("Retornando ao menu principal")
      fimescolha

fimprocedimento

//----------------------------------------------------------

procedimento ordenarimpressao
// Ordenação do vetor pelo metodo bolha
// Ordenação Crescente usando temperatura como referência
var
aux, aux2: real
i, j: inteiro

inicio
i <- 1
j <- 1

para i de 1 ate 4 faca
   para j de 1 ate 4 faca
      se temperatura[j] > temperatura[i] entao
         aux <- temperatura[i]
         aux2 <- hora[i]
         temperatura[i] <- temperatura[j]
         hora[i] <- hora[j]
         temperatura[j] <- aux
         hora[j] <- aux2
      fimse
   fimpara
fimpara
Escreval()
Escreval("TEMPERATURAS e HORAS ordenados de forma CRESCENTE,")
escreval("usando as temperaturas como referência de ordenamento:")
para i de 1 ate 4 faca
     Escreval(temperatura[i], " graus às ",hora[i], " horas")
fimpara


fimprocedimento

//----------------------------------------------------------

inicio

lermenu1()

fimalgoritmo
