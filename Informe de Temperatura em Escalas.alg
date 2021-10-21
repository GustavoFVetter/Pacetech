algoritmo "Menu com para e para-reverso"
// Função : Converter C para F crescente e descrescente
// Autor : Gustavo F. Vetter
// Data : 21/10/2021
// Seção de Declarações 
var
menu1, menu2, menu3, menu4, menu5: literal
tempCinicial, tempCfinal, tempFinicial, tempFfinal: inteiro
intervaloincremento, intervalodecremento: inteiro
tempC, tempF: inteiro

inicio


escreval (" ")
escreval ("Informe a opção desejada:")
escreval ("1 - Temperatura em graus Celsius")
escreval ("2 - Temperatura em graus Farenheit")
escreval ("3 - Encerrar o menu de opções:")
escreval (" ")
leia (menu1)
escreval (" ")

escolha menu1
       caso "1"
            escreval ("Informe a opção desejada:")
            escreval ("1 - Temperatura em graus Celsius em ordem crescente")
            escreval ("2 - Temperatura em graus Celsius em ordem descrescente")
            escreval ("3 - Encerrar o menu de opções:")
            leia (menu2)
            escreval (" ")
                     escolha (menu2)
                             caso "1"
                                  escreval ("Escrever algoritmo para Temp. C ordem crescente.")
                                  escreval (" ")
                                  escreval ("Informe a MENOR temperatura, em nrs inteiros")
                                  leia (tempCinicial)
                                  escreval (" ")
                                  escreval ("Informe a MAIOR temperatura, em nrs inteiros")
                                  leia (tempCfinal)
                                  escreval (" ")
                                  escreval ("Informe o intervalo entre as temperaturas, a ser mostrado na tela:")
                                  leia (intervaloincremento)
                                  escreval ("TCI:", tempCinicial, " TCF:", tempcfinal, " Incremento:", intervaloincremento)
                                  para tempC de tempCinicial ate tempCfinal passo intervaloincremento faca
                                       escreval (tempC, " graus C equivale a ", (tempC * 1.8 ) + 32, " graus F.")
                                  fimpara
                                  escreval (" ")
                             caso "2"
                                  escreval ("Escrever algoritmo para Temp. C ordem descrescnte")
                                  escreval (" ")
                                  escreval ("Informe a MAIOR temperatura, em nrs inteiros")
                                  leia (tempCinicial)
                                  escreval (" ")
                                  escreval ("Informe a MENOR temperatura em nrs inteiros")
                                  leia (tempCfinal)
                                  escreval (" ")
                                  escreval ("Informe o intervalo entre as temperaturas, a ser mostrado na tela:")
                                  escreval ("Lembre-se de usar o sinal negativo antes do valor")
                                  leia (intervalodecremento)
                                  escreval ("TCI:", tempCinicial, " TCF:", tempcfinal, " Decremento:", intervalodecremento)
                                  para tempC de tempCinicial ate tempCfinal passo intervalodecremento faca
                                       escreval (tempC, " graus C equivale a ", (tempC * 1.8 ) + 32, " graus F.")
                                  fimpara
                                  escreval (" ")
                             caso "3"
                                  escreval ("Obrigado por usar nosso programa tempC cres. e decresc.")
                             //outrocaso  //  // kaso o usuário digite um karacter qualquer
                                         // não está funcionando
                                      //repita
                                            //escreval ("Informe a opção desejada:")
                                            //escreval ("1 - Temperatura em graus Celsius em ordem crescente")
                                            //escreval ("2 - Temperatura em graus Celsius em ordem descrescente")
                                            //escreval ("3 - Encerrar o menu de opções:")
                                            //leia (menu3)
                                      //ate (menu3) = "1" ou "2" ou "3"
                     fimescolha
       caso "2"
            escreval ("Informe a opção desejada:")
            escreval ("1 - Temperatura em graus Farenheit em ordem crescente")
            escreval ("2 - Temperatura em graus Farenheit em ordem descrescente")
            escreval ("3 - Encerrar o menu de opções:")
            leia (menu4)
            escreval (" ")
                     escolha (menu4)
                             caso "1"
                                  escreval ("Escrever algoritmo para Temp. F ordem crescente")
                                  escreval (" ")
                                  escreval ("Informe a MENOR temperatura, em nrs inteiros")
                                  leia (tempFinicial)
                                  escreval (" ")
                                  escreval ("Informe a MAIOR temperatura, em nrs inteiros")
                                  leia (tempFfinal)
                                  escreval (" ")
                                  escreval ("Informe o intervalo entre as temperaturas, a ser mostrado na tela:")
                                  leia (intervaloincremento)
                                  escreval ("TFI:", tempFinicial, " TFF:", tempFfinal, " Incremento:", intervaloincremento)
                                  para tempF de tempFinicial ate tempFfinal passo intervaloincremento faca
                                       escreval (tempF, " graus F equivale a ", (tempF - 32 ) / 1.8, " graus C.")
                                  fimpara
                                  escreval (" ")
                             caso "2"
                                  escreval ("Escrever algoritmo para Temp. F ordem descrescnte")
                                  escreval (" ")
                                  escreval ("Informe a MAIOR temperatura, em nrs inteiros")
                                  leia (tempFinicial)
                                  escreval (" ")
                                  escreval ("Informe a MENOR temperatura, em nrs inteiros")
                                  leia (tempFfinal)
                                  escreval (" ")
                                  escreval ("Informe o intervalo entre as temperaturas, a ser mostrado na tela:")
                                  escreval ("Lembre-se de usar o sinal negativo antes do valor")
                                  leia (intervalodecremento)
                                  escreval ("TFI:", tempFinicial, " TFF:", tempFfinal, " Decremento:", intervalodecremento)
                                  para tempF de tempFinicial ate tempFfinal passo intervalodecremento faca
                                       escreval (tempF, " graus F equivale a ", (tempF - 32 ) / 1.8, " graus C.")
                                  fimpara
                                  escreval (" ")
                             caso "3"
                                  escreval ("Obrigado por usar nosso programa tempF cresc. e decresc.")
                     fimescolha
       caso "3"
            escreval ("Obrigado e bye-bue.")
            
       
fimescolha


fimalgoritmo
