![persona 5](https://cdn2.steamgriddb.com/hero_thumb/a45613e8740e38fe7d019d79fbf8712b.jpg)
# ProjectCurrencyConverterAPI-App


### Topics:
* [Description](#description)
* [Tecnologias](#tecnologias)
* [Funcionalidades](#funcionalidades)
* [Estrutura do projeto](#estrutura-do-projeto)
* [Autores](#autores)
* [Referências](#referências)

## Description
<p>ProjectCurrencyConverterAPI it is an app whose function is the real time conversion of currencies.</p>
<p>This project has been made at Senac Londrina North , with the help of Professor <a href="https://github.com/leonardossrocha">Leonardo Rocha</a>.</p>
<p>We used some Git commands to develop the project. For example, we use <b>"git init"</b> to create an blank local repository, and <b>"git remote add origin"</b> to connect the local repository to the remote repository.</p>
<p>We also used some simple commands to push updates from the local repository to the remote repository, such as: 
  <li><b>"git add"</b> para selecionar o arquivo à ser enviado;</li>
  <li><b>"git commit -m"</b> para adicionar uma mensagem descritiva sobre o/s arquivo/s selecionado/s;</li>
  <li><b>"git push"</b> envia os arquivos do repositório local para o repositório remoto;</li>
  <li><b>"git pull"</b> resgata os arquivos do repositório remoto e envia para o repositório local.</li></p>

## Tecnologias
<li>ExchangeRate API</li>
<li>Android Studio</li>

## Funcionalidades
<li><b>Consulta de taxas de câmbio</b>: Busca taxas de câmbio em tempo real entre diferentes moedas.</li>
<li><b>Conversão de moedas</b>: Converte valores monetários com base nas taxas atuais.</li>
<li><b>Integração via HTTP</b>: Realiza requisições HTTP à API ExchangeRate.</li>

## Estrutura do projeto
<li><b>ExchangeRatesResponse.java</b>: Modelo de dados que representa a resposta JSON da API.</li>
<li><b>RetrofitCliente.java</b>: Classe responsável por configurar e fornecer uma instância Retrofit.</li>
<li><b>MainActivity.java</b>: É a classe que representa a atividade principal do aplicativo Android.</li>
<li><b>ExchangeRateService.java</b>: Responsável pela Interface do projeto.</li>

## Autores
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/180124583?v=4" width=115><br><sub>Letícia Feitoza</sub>](https://github.com/LmayuXD)|
| :---: |

## Referências 
<li><a href="https://www.alura.com.br/artigos/escrever-bom-readme?utm_term=&utm_campaign=topo-aon-search-gg-dsa-artigos_conteudos&utm_source=google&utm_medium=cpc&campaign_id=11384329873_164240702375_703829337057&utm_id=11384329873_164240702375_703829337057&hsa_acc=7964138385&hsa_cam=topo-aon-search-gg-dsa-artigos_conteudos&hsa_grp=164240702375&hsa_ad=703829337057&hsa_src=g&hsa_tgt=dsa-2276348409543&hsa_kw=&hsa_mt=&hsa_net=google&hsa_ver=3&gad_source=1&gad_campaignid=11384329873&gbraid=0AAAAADpqZICk0MzLro-t3DLjYjxFyjzVj&gclid=EAIaIQobChMIxpD8vsaejwMVlQ9ECB1L1x5IEAAYASAAEgLF9PD_BwE">Alura</a></li>
<li><a href="https://www.notion.com/">Notion</a></li>
<li>Biblioteca Retrofit</li>
