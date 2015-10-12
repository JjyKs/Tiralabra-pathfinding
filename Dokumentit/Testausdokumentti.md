Tällä hetkellä ohjelmaa on testattu lähinnä luokkatasolla varmistaakseni luokkien oikeanlaisen toiminnan, sekä ajamalla koodissa generoitua karttaa läpi, joka tuottaa seuraavanlaisen tuloksen:

S = Lähtö
T = Maali
░ = Tutkittu kartan osa
  = Tutkimaton kartan osa
▓ = Seinä

S ░ ░ ▓ ░ ░ ░ ▓ ░ ▓ ░ ░ ░ ░ ░ ░ 
░ x ░ ▓ ░ x ░ ▓ ░ ▓ ░ ░ ░ ░ ░ ░ 
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ ░ ░ ░ ░ 
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ ░ ░ ░ ░ 
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ ░ ░ ░ ░ 
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ ░ ░ ░ ░ 
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ x x ░ ░ 
░ ░ x ▓ x ▓ x ▓ ░ ▓ ▓ x ▓ ▓ x ░ 
░ ░ x ▓ x ▓ x ▓ ░ ▓ x ░ ░ ▓ x ░ 
░ ░ x ▓ x ▓ x ▓ ░ x ░ ░ ░ ▓ x ░ 
░ ░ x ▓ x ▓ x ▓ x ▓ ░ ░ ░ ▓ x ░ 
░ ░ x ▓ x ▓ x ▓ x ▓ ▓ ▓ ▓ ▓ x ░ 
░ ░ x ▓ x ▓ x ▓ x ▓ ░ ░ ░ ▓ x ░ 
░ ░ x ▓ x ▓ x ▓ x ▓ ░ ░ ░ ▓ x ░ 
░ ░ ░ x ░ ▓ ░ x ░ ░ ░ ░ ░ ▓ x ░ 
░ ░ ░ ░ ░ ▓ ░ ░ ░ ░ ░ ░ ░ ▓   T 


Sekä:

S ░ ░ ▓ ░ ░ ░ ▓   ▓             
░ x ░ ▓ ░ x ░ ▓   ▓             
░ ░ x ▓ x ▓ x ▓   ▓             
░ ░ x ▓ x ▓ x ▓   ▓             
░ ░ x ▓ x ▓ x ▓   ▓             
░ ░ x ▓ x ▓ x ▓   ▓             
░ ░ x ▓ x ▓ x ▓   ▓             
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ ▓ ▓     
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░         
░ ░ x ▓ x ▓ x ▓ ░ ░ ░ ░         
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░         
░ ░ x ▓ x ▓ x ▓ ░ ▓ ▓ ▓ ▓ ▓ ░   
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ ░ ░ ░   
░ ░ x ▓ x ▓ x ▓ ░ ▓ ░ ░ ░ ░ ░   
░ ░ ░ x ░ ▓ ░ x x x x x x x x ░ 
░ ░ ░ ░ ░ ▓ ░ ░ ░ ░ ░ ░ ░ ░ ░ T



Tulosten perusteella algoritmi vaikuttaisi toimivan oikein. 