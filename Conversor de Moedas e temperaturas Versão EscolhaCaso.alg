algoritmo "Conversor de Moedas e Temperaturas (Brasil x EUA)"
// Função : Converter moedas e Temperaturas (Brasil x EUA e vice-versa)
// Autor :  Gustavo F. vetter
// Data : 17/10/2021
// Seção de Declarações
var
opcaoMenu1, opcaoMenu2, opcaoMenu3: literal
cotacaododia, converterrealparadolar, converterdolarparareal: real
valoremreais, valoremdolar: real
tempC, tempF: real

inicio

repita
   escreval (" ")
   escreval ("Digite a opção desejada: ")
   escreval ("Opção 1: Converter Moeda")
   escreval ("Opção 2: Converter Temperatura")
   escreval ("Opção 3: Sair do menu")
   leia (opcaoMenu1)

   escolha opcaoMenu1
           caso "1"
                 escreval (" ")
                 escreval ("Digite a cotação de hoje do dólar em Reais:")
                 leia (cotacaododia)
                 escreval (" ")
                 escreval ("Hoje 1 dólar vale R$ ", cotacaododia)
                 escreval (" ")
                 escreval ("Digite a opção desejada: ")
                 escreval ("Opção 1: Converter Real para Dólar")
                 escreval ("Opção 2: Converter Dólar para Real")
                 escreval ("Opção 3: Sair do menu")
                 escreval (" ")
                 leia (opcaoMenu2)
                 escreval (" ")
                 
                 escolha(opcaoMenu2)
                    caso "1"
                         escreval (" ")
                         escreval ("Digite o valor em Reais")
                         leia (valoremreais)
                         converterrealparadolar <- valoremreais * cotacaododia
                         escreval (" ")
                         escreval ("R$", valoremreais, " Equivale a US$", converterrealparadolar)
                         escreval (" ")

                    caso "2"
                         escreval (" ")
                         escreval ("Digite o valor em Dólares")
                         leia (valoremdolar)
                         converterdolarparareal <- valoremdolar * cotacaododia
                         escreval (" ")
                         escreval ("US$ ", valoremdolar, " Equivale a R$ ", converterdolarparareal)
                         escreval (" ")

                    caso "3"
                         leia (opcaoMenu1)
                         escreval (" ")
                         
                    outrocaso
                             escreval (" ")
                             leia (opcaoMenu1)
                 fimescolha

           caso "2"
                escreval (" ")
                escreval ("Digite a opção desejada: ")
                escreval ("Opção 1: Converter Celsius para Farenheit")
                escreval ("Opção 2: Converter Farenheit para Celsius")
                escreval ("Opção 3: Sair do menu")
                leia (opcaoMenu3)
                escreval (" ")

                escolha (opcaoMenu3)
                        caso "1"
                             escreval ("Digite a temperatura em Celsius")
                             leia (tempC)
                             escreval (" ")
                             escreval ("A temp.informada foi de ", tempC, " graus Celsius")
                             tempF <- (tempC * 1.8 ) + 32
                             escreval (tempC," graus Celsius equivale a ", tempF," graus Farenheit")
                             escreval (" ")

                         caso "2"
                              escreval ("Digite a temperatura em Farenheit")
                              leia (tempF)
                              escreval (" ")
                              escreval ("A temp.informada foi de ", tempF, " graus Farenheit")
                              tempC <- (tempF - 32) / 1.8
                              escreval (tempF," graus Farenheit equivale a ", tempC," graus Celsius")
                              escreval (" ")

                         caso "3"
                              leia (opcaoMenu1)
                              escreval (" ")

                         outrocaso
                                  leia (opcaoMenu1)
                                  escreval (" ")

                fimescolha
   fimescolha

ate (opcaoMenu1) = "3"
escreval (" ")
escreval ("Obrigado por usufriur de nossos serviços. Até a próxima oportunidade.")
escreval (" ")

fimalgoritmo
