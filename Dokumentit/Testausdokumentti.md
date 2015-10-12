Suorituskyky:
Testasin algoritmia 256x256 maailmalla, ja tulokset olivat seuraavanlaiset:
Itsetehdyt tietorakenteet: 5136ms
Javan omat tietorakenteet: 873ms
Oma Minheap, Javan arraylist: 1215ms
Oma Arraylist, Javan minheap: 3709ms

96x96 maailmalla taas: 
Itsetehdyt tietorakenteet: 417
Javan omat tietorakenteet: 116
Oma Minheap, Javan arraylist: 101
Oma Arraylist, Javan minheap: 429

Sama trendi jatkui muissakin testeissä. Arraylist toteutukseni on selvästi pullonkaula, mutta en etsimisestä huolimatta keksinyt ongelman lähdettä. Karttojen kasvaessa Javan omat tietorakenteet skaalautuvat paremmin, joten optimoitavaa löytyisi vielä.


Tällä hetkellä ohjelmaa on testattu ohjelmallisesti lähinnä luokkatasolla varmistaakseni luokkien oikeanlaisen toiminnan, sekä ajamalla koodissa generoitua karttaa läpi, joka tuottaa seuraavanlaisia tuloksia:

S = Lähtö
T = Maali
░ = Tutkittu kartan osa
  = Tutkimaton kartan osa
x = Löydetty reitti
▓ = Seinä

░ T ▓ ▓ ▓   ▓ ▓ ▓ ▓ ▓   ▓ ▓ ░ ░ ▓ ▓ ░ ▓ ▓     ▓ ░ ▓ ▓ ░ ░ ░ ▓ ▓
x   ▓ ░ ▓ ▓ ▓ ▓ ▓ ░ ▓ ▓ ▓ ░ ▓ ░ ░ ░ ▓ ░ ▓     ▓ ▓ ░ ▓ ▓ ░ ▓ ▓ ▓
▓ x ▓ ▓ ░ ░ ▓ x x ▓ ░ ░ ░ ░ ▓ ▓ ▓ ░ ░ ░ ▓ ▓ ▓ ▓ ░ ░ ░ ░ ▓ ░ ▓ ░
▓ x ▓ ▓ ▓ ▓ x ▓ ▓ x ▓ ░ ░ ▓ ░ ░ ░ ░ ▓ ▓ ▓ ░ ░ ░ ▓ ▓ ▓ ▓ ░ ▓ ░ ░
▓ ▓ x x ▓ x ░ ▓ x ▓ ▓ ▓ ▓ ░ ▓ ░ ░ ░ ░ ░ ▓ ▓ ░ ░ ▓ ░ ▓ ▓ ▓ ░ ░ ▓
▓ ▓   ▓ x ░ ▓ ░ ▓ x ▓ ▓ ▓ ░ ░ ▓ ▓ ▓ ░ ░ ▓ ▓ ▓ ░ ▓ ▓ ░ ░ ░ ▓ ▓ ▓
▓ ▓       ▓ ▓ ░ ▓ ▓ x ▓ ▓ ▓ ▓ ░ ▓ ░ ░ ▓ ░ ▓ ▓ ░ ▓ ▓ ░ ▓ ▓ ▓ ▓
  ▓     ▓ ▓ ░ ░ ▓ ░ ▓ x ▓ ░ ░ ▓ ▓ ▓ ░ ▓ ▓ ░ ░ ░ ░ ▓ ░ ▓     ▓
▓   ▓ ▓ ▓ ▓ ▓ ▓ ░ ░ ░ ▓ x ▓ ░ ░ ░ ░ ░ ░ ░ ░ ▓ ▓ ░ ░ ░ ▓ ▓ ▓ ▓ ▓
▓           ▓ ▓ ▓ ▓ ░ ▓ ▓ x ░ ░ ░ ▓ ░ ░ ░ ░ ▓ ▓ ▓ ▓ ▓ ░ ░ ░ ░ ░
  ▓     ▓ ▓ ▓ ░ ░ ▓ ▓ ░ ░ ▓ x ▓ ░ ░ ▓ ▓ ░ ▓ ▓ ▓ ▓ ░ ▓ ▓ ▓ ░ ░ ░
  ▓ ▓ ▓       ▓ ▓ ░ ░ ░ ▓ ░ ▓ x ▓ ░ ▓ ▓ ░ ░ ░ ░ ▓ ░ ░ ░ ▓ ▓ ░ ▓
▓   ▓   ▓   ▓ ▓ ░ ▓ ▓ ▓ ░ ░ ░ ▓ x ░ ░ ░ ▓ ░ ░ ░ ▓ ▓ ▓ ░ ▓ ▓ ░ ▓
▓   ▓ ▓     ▓ ▓     ▓ ▓ ▓ ░ ░ ▓ ░ x ░ ░ ▓ ░ ▓ ░ ░ ░ ░ ░ ▓ ░ ░ ░
▓     ▓     ▓     ▓ ▓ ░ ░ ▓ ░ ░ ▓ ▓ x ░ ░ ▓ ░ ░ ░ ░ ▓ ░ ░ ▓ ░ ░
▓ ▓   ▓       ▓       ▓ ░ ▓ ░ ▓ ▓ ░ ░ x ░ ░ ░ ▓ ▓ ░ ▓ ▓ ░ ░ ░ ▓
▓     ▓ ▓     ▓ ▓ ▓     ▓ ▓ ▓ ░ ░ ▓ ▓ ▓ x ░ ▓ ░ ░ ▓ ░ ▓ ▓ ▓ ░
▓ ▓ ▓     ▓ ▓ ▓ ▓ ▓   ▓     ░ ░ ░ ░ ▓ x ▓ ░ ▓ ░ ░ ▓ ░ ▓   ▓ ▓ ▓
▓   ▓ ▓ ▓ ▓ ▓ ▓ ▓   ▓   ▓   ▓ ▓ ▓ ▓ ▓ ▓ x ░ ░ ▓ ░ ░ ░ ▓ ▓ ▓ ▓
▓         ▓ ▓ ▓ ▓       ▓   ▓ ▓ ░ ▓ ▓ ░ ░ S ░ ▓ ▓ ▓ ▓ ░ ░
  ▓       ▓   ▓   ▓   ▓   ▓   ░ ▓ ░ ░ ░ ▓ ▓ ▓ ░ ▓ ░ ░ ▓ ▓ ▓ ▓ ▓
  ▓ ▓ ▓   ▓     ▓     ▓         ░ ░ ▓ ░ ▓ ░ ▓ ░ ░ ▓ ░   ▓
              ▓       ▓ ▓     ▓   ▓ ░ ▓ ░   ░ ░ ▓ ░     ▓ ▓   ▓
  ▓ ▓     ▓ ▓ ▓ ▓           ▓ ▓ ▓     ▓       ▓     ▓   ▓ ▓ ▓
    ▓ ▓ ▓       ▓ ▓   ▓ ▓     ▓     ▓         ▓ ▓   ▓   ▓ ▓   ▓
      ▓   ▓   ▓ ▓   ▓       ▓ ▓ ▓   ▓   ▓     ▓       ▓ ▓   ▓
    ▓     ▓     ▓ ▓         ▓ ▓           ▓     ▓ ▓ ▓ ▓     ▓
▓ ▓ ▓   ▓ ▓ ▓ ▓ ▓   ▓     ▓ ▓       ▓   ▓   ▓ ▓   ▓ ▓ ▓ ▓ ▓ ▓ ▓
▓     ▓   ▓ ▓   ▓ ▓ ▓ ▓ ▓ ▓       ▓ ▓   ▓ ▓     ▓   ▓   ▓   ▓ ▓
  ▓     ▓     ▓ ▓       ▓   ▓ ▓ ▓         ▓         ▓     ▓ ▓ ▓
  ▓   ▓     ▓           ▓ ▓     ▓   ▓       ▓ ▓       ▓
▓ ▓   ▓     ▓   ▓           ▓       ▓     ▓     ▓   ▓       ▓


Tulosten perusteella algoritmi vaikuttaisi toimivan oikein. 