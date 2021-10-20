algoritmo "Votação para até 4 candidatos"
// Função : Ferramenta para votar e apurar a votação para até 4 candidatos.
// Autor :  Gustavo F. Vetter
// Data : 18/10/2021
// Seção de Declarações
var
cand1, cand2, cand3, cand4, senha, contrasenha, opcaomenu: literal
totaldevotosregistrados, totalvotantes: inteiro
votocand1, votocand2, votocand3, votocand4, votonulo: inteiro


inicio

totalvotantes <- 0
totaldevotosregistrados <- 0
votocand1 <- 0
votocand2 <- 0
votocand3 <- 0
votocand4 <- 0

escreval (" ")
escreval ("* * * *   INICIO DA ELEIÇÃO   * * * *")
escreval (" ")
timer(1000)
timer(0)
escreval ("Escreva o nome do candidato nr 1:")
leia (cand1)
escreval (" ")
escreval ("Escreva o nome do candidato nr 2:")
leia (cand2)
escreval (" ")
escreval ("Escreva o nome do candidato nr 3. Digite SEM NOME caso só haja dois candidatos:")
leia (cand3)
escreval (" ")
escreval ("Escreva o nome do candidato nr 4. Digite SEM NOME caso só haja três candidatos:")
leia (cand4)
escreval (" ")

escreval ("O nome dos canditatos é: ")
timer(500)
escreval ("Candidato nr 1 --> ", cand1)
escreval ("Candidato nr 2 --> ", cand2)
escreval ("Candidato nr 3 --> ", cand3)
escreval ("Candidato nr 4 --> ", cand4)
timer(0)

escreval (" ")
escreval (" ")
escreval ("-----------------")
escreval ("Início da votação")
escreval ("-----------------")
escreval (" ")
escreval (" ")
timer(500)
escreval ("Até agora existem", totaldevotosregistrados, " votos registrados")
escreval (" ")
escreval ("Cada voto será registrado num arquivo chamado totaldevotosregristrados .")
escreval (" ")
escreval ("O nr ZERO indica que este arquivo ainda não contém registros.")
escreval (" ")
timer(0)
escreval ("Digite uma senha para iniciar a votação.")
escreval ("Esta senha será necessária para fazer a apuração da votação.")
escreval (" ")
leia (senha)
escreval ("A senha digitada é: ",senha)
escreval (" ")
escreval (" ")
escreval ("Em 5 segundos esta tela será apagada. Guarde esta senha.")
escreval (" ")
escreval (" ")
timer (5000)
timer (0)
limpatela
escreval (" ")
escreval ("Informe o nr total de votantes desta eleição:")
leia(totalvotantes)
escreval (" ")
escreval ("Nesta eleição teremos o total de",totalvotantes," votos")
escreval (" ")

repita
   escreval ("Digite o nr do seu candidato, cfe. abaixo:")
   escreval ("1 --> para notar em ",cand1)
   escreval ("2 --> para votar em ",cand2)
   escreval ("3 --> para votar em ",cand3)
   escreval ("4 --> para votar em ",cand4)
   escreval ("Tecle qualquer caracter para Voto Nulo")
   leia (opcaomenu)
   escreval (" ")

   escolha (opcaomenu)
   caso "1"
      votocand1 <- votocand1 + 1
      totaldevotosregistrados <- totaldevotosregistrados + 1
      escreval ("Você votou em ", cand1)
      escreval ("Em 2 segundos esta tela será apagada.")
      timer (2000)
      timer (0)
      limpatela
      escreval (" ")
   caso "2"
      votocand2 <- votocand2 + 1
      totaldevotosregistrados <- totaldevotosregistrados + 1
      escreval ("Você votou em ", cand2)
      escreval ("Em 2 segundos esta tela será apagada.")
      timer (2000)
      timer (0)
      limpatela
      escreval (" ")
   caso "3"
      votocand3 <- votocand3 + 1
      totaldevotosregistrados <- totaldevotosregistrados + 1
      escreval ("Você votou em ", cand3)
      escreval ("Em 2 segundos esta tela será apagada.")
      timer (2000)
      timer (0)
      limpatela
      escreval (" ")
   caso "4"
      votocand4 <- votocand4 + 1
      totaldevotosregistrados <- totaldevotosregistrados + 1
      escreval ("Você votou em ", cand4)
      escreval ("Em 2 segundos esta tela será apagada.")
      timer (2000)
      timer (0)
      limpatela
      escreval (" ")
   outrocaso
      votonulo <- votonulo + 1
      totaldevotosregistrados <- totaldevotosregistrados + 1
      escreval ("Você votou em Voto Nulo")
      escreval ("Em 2 segundos esta tela será apagada.")
      timer (2000)
      timer (0)
      limpatela
      escreval (" ")
   fimescolha

ate (totaldevotosregistrados = totalvotantes)

escreval (" ")
escreval (" ")
escreval ("-------------------------------------")
escreval ("O nr total de votantes foi alcançado.")
escreval ("Esta votação está encerrada.")
escreval ("-------------------------------------")
escreval (" ")
escreval (" ")

repita
   escreval ("Digite a senha para fazer a apuração da votação:")
   escreval (" ")
   leia (contrasenha)
   escreval (" ")

   se (contrasenha) = (senha) entao
      escreval ("A senha está correta.")
      interrompa
   senao
      escreval ("Senha incorreta. Digite a senha correta:")
      leia (contrasenha)
      se (contrasenha) = (senha) entao
         interrompa
      fimse
      repita
         escreval ("Senha incorreta. Digite a senha correta:")
         leia (contrasenha)
         se (contrasenha) = (senha) entao
            escreval ("A senha está correta.")
         fimse
      ate (contrasenha) = (senha)
   fimse

ate (senha) = (contrasenha)



escreval (" ")

escreval ("Abaixo o resultado da apuração dos votos:")
escreval (" ")
timer(500)
escreval ("Total de votos registrados:",totalvotantes, " votos.")
escreval (" ")
escreval ("Voto(s) em ",cand1, ":", votocand1, (" -->"), (votocand1 / totalvotantes) * 100, "% dos votos registrados.")
escreval (" ")
escreval ("Voto(s) em ",cand2, ":", votocand2, (" -->"), (votocand2 / totalvotantes) * 100, "% dos votos registrados.")
escreval (" ")
escreval ("Voto(s) em ",cand3, ":", votocand3, (" -->"), (votocand3 / totalvotantes) * 100, "% dos votos registrados.")
escreval (" ")
escreval ("Voto(s) em ",cand4, ":", votocand4, (" -->"), (votocand4 / totalvotantes) * 100, "% dos votos registrados.")
escreval (" ")
escreval ("Voto(s) nulo(s): ", votonulo, (" -->"), (votonulo / totalvotantes) * 100, "% dos votos registrados.")
escreval (" ")
escreval ("* * * *   FIM DESTA ELEIÇÃO   * * * *")
timer(0)


fimalgoritmo
