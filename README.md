![persona 5](https://cdn2.steamgriddb.com/hero_thumb/a45613e8740e38fe7d019d79fbf8712b.jpg)
# ProjectCurrencyConverterAPI-App


### Topics:
* [Description](#description)
* [Technologies](#technologies)
* [Functionalities](#functionalities)
* [Project Structure](#project-structure)
* [Authors](#authors)
* [References](#references)

## Description
<p>ProjectCurrencyConverterAPI it is an app whose function is the real time conversion of currencies.</p>
<p>This project has been made at Senac Londrina North , with the help of Professor <a href="https://github.com/leonardossrocha">Leonardo Rocha</a>.</p>
<p>We used some Git commands to develop the project. For example, we use <b>"git init"</b> to create an blank local repository, and <b>"git remote add origin"</b> to connect the local repository to the remote repository.</p>
<p>We also used some simple commands to push updates from the local repository to the remote repository, such as: 
  <li><b>"git add"</b> -> Was used for seleting a file to be sent;</li>
  <li><b>"git commit -m"</b> -> Is for adding a descriptive message to the selected files;</li>
  <li><b>"git push"</b> -> Send the files from the local repository to the remote repository;</li>
  <li><b>"git pull"</b> -> Retrieve the files from the remote repository and send them to the local repository.</li></p>

## Technologies
<li>ExchangeRate API</li>
<li>Android Studio</li>

## Functionalities
<li><b>Made the queries of the exchange rates</b>: Search for exchange rates in real time between different types of currencies.</li>
<li><b>Currency conversion</b>: Convert currency values using real time rates.</li>
<li><b>HTTP Integration</b>: Send HTTP requests to the ExchangeRate API.</li>

## Project Structure
<li><b>ExchangeRatesResponse.java</b>: Data model that represents the JSON reponse from the API.</li>
<li><b>RetrofitCliente.java</b> A class responsible for configuring and providing an instance of Retrofit.</li>
<li><b>MainActivity.java</b>: It is a class that represents the main activity of the Android application.</li>
<li><b>ExchangeRateService.java</b>: Responsible for the interface of the project.</li>
<li><b>activity_main.xml</b>: It is used to show the desing of the project.</li>

## Authors
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/180124583?v=4" width=115><br><sub>Letícia Feitoza</sub>](https://github.com/LmayuXD)|
| :---: |

## References 
<li><a href="https://www.alura.com.br/artigos/escrever-bom-readme?utm_term=&utm_campaign=topo-aon-search-gg-dsa-artigos_conteudos&utm_source=google&utm_medium=cpc&campaign_id=11384329873_164240702375_703829337057&utm_id=11384329873_164240702375_703829337057&hsa_acc=7964138385&hsa_cam=topo-aon-search-gg-dsa-artigos_conteudos&hsa_grp=164240702375&hsa_ad=703829337057&hsa_src=g&hsa_tgt=dsa-2276348409543&hsa_kw=&hsa_mt=&hsa_net=google&hsa_ver=3&gad_source=1&gad_campaignid=11384329873&gbraid=0AAAAADpqZICk0MzLro-t3DLjYjxFyjzVj&gclid=EAIaIQobChMIxpD8vsaejwMVlQ9ECB1L1x5IEAAYASAAEgLF9PD_BwE">Alura</a></li>
<li><a href="https://www.notion.com/">Notion</a></li>
<li>Retrofit library</li>
<li>ArrayAdapter</li>
