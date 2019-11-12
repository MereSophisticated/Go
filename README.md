# Go
## Dinamika igre
<img align="right" width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/1.jpg">

Na koncu igre oba igralca dobita po eno točko za vsako prosto točko znotraj svojega teritorija in točko za vsak zajet kamen.
Igralec z večjim skupnim številom teritorija in ujetnikov je zmagovalec.

V zgornjem primeru ima črni igralec 15 točk za teritorij ter eno dodatno točko, teritorij črnega igralca vključuje točko **a** kjer je bil prej beli kamen. Skupno s tem zapornikom, ima črni igralec 16 točk

Teritorij belega igralca je vreden 17 točk, zato je beli zmagovalec.
## Mehanika igre
Igra se začne s prazno igralno ploščo velikosti 19 x 19.
Vsak igralec ima neomejeno število kamnov, en igralec črne, drug bele.
### Ujemanje zapornikov
<p align="center">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/2.jpg">
</p>

Vsak kamen ima okoli sebe točke svobode, ti so na zgornji sliki označeni s križci.
Večina pozicij ima 4 take točke, kamen ki je postavljen na robu 3, če pa je postavljen v kotu pa le 2.


<p align="center">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/3.jpg">
</p>

Enaka pozicija kamnov kot na prejšni sliki, le da imajo tu vsi le eno prosto točko svobode, kar pomeni da jih z naslednjo potezo lahko črni igralec ujame

<p align="center">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/4.jpg">
</p>

Stanje po tem, ko črni igralec odloži kamen na pozicijo B. Ujame belega.

### Skupine in nizi
<p align="center">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/5.jpg">
</p>

Kamna, ki sta na sosednjih točkah se povežeta v niz. Ker se gleda le horizontalno in vertikalno sosednjost, kamna označena s trikotnikom nista skupina.
Več kamnov povezanih v niz, ki pripadajo istemu igralcu se imenujejo skupina. V primeru sta dve skupini.

### Ujemanje nizov
<p>
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/6.jpg">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/7.jpg">
</p>

V zgornji levi sliki so skupine iz prejšnjega primera spremenjene tako, da imajo le še eno točko svobode, skupina desno zgoraj še ni ujeta, zaradi točke svobode **f**. Posamična črna kamn sta lahko ujeta, če beli igra na **g** oz **h**.

Desna slika prikazuje stanje po tem, ko črni ujame na **e**, beli pa na **f** in **g**.

#### Prepoved samoujemanja
<p>
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/8.jpg">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/9.jpg">
</p>
Igralec ne sme odložiti kamna na poziciji, kjer bi bil ta takoj ujet (nikoli nima prostih točk svobode), tako kot bi to bilo na pozicijah **i** ali **j** za belega igralca na zgornji levi sliki

Razen, če so vse zunanje točke svobode že zasedene, kot je prikazano na zgornji desni sliki, saj sta to zadnji točki svobode za skupini črnih kamnov. Če beli igralec odloži kamen na enem od teh mest, zajame celo črno skupino, kateri je odvzel točko.

### Živ niz, mrtev niz in koncept oči
#### Koncept oči
<p align="center">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/10.jpg">
</p>
V prejšnjem primeru je lahko beli igralec igral na **i** ali **j**, s tem pa ujel sosednje črne kamne.
Tu pa bi lahko črni niz bil zajet le, če bi beli igralec lahko igral na **m** in **n**. Ker bi bila prva ta poteza samoujemanje, beli ne more zajeti takega niza.
Taka dva prostora v skupini sta znana kot oči
#### Živ niz
Kakršenkoli niz ali skupina kamnov, ki ma dve ali več oči je za vedno varen pred ujemanjem, zato se mu reče živ niz oziroma živa skupina.
#### Mrtva skupina
Skupina, ki ne more narediti oči, je odrezana in obdana z nasprotnikovimi kamni, je znana kot mrtva skupina, ker je neizogibno, da bo enkrat ujeta.

##### Brezupna skupina
<p align="center">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/11.jpg">
</p>

Med igro igralcema ni treba ujeti izolirane mrtve skupine, ko je enkrat obema igralcema jasno, da je mrtva.
Situacija v zgornji sliki, lahko ostane do konca igre, na koncu pa se odstrani in šteje med zapornike.

### Pravilo Ko
<p>
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/12.jpg">
  <img width="250" height="250" src="https://github.com/3-letnik-UN-2019-2020/namizna-igra-MereSophisticated/blob/5.1-Osnutek-načrta/readmePhotos/13.jpg">
</p>

Črni lahko zajame kamen, če igra na poziciji **r**. Nastane situacija na zgornji desni sliki, a sedaj je kamen, ki ga je igral črni v nevarnosti ujetja. Če bi beli lahko takoj igral na poziciji **u**, bi se vrnili na prvotno stanje. To bi se lahko ponavljajo v neskončnost. Tak vzorec se imenuje Ko. Na sliki sta predstavljena še druga dva primera takega vzorca.

To je preprečeno s pravilom Ko, ta določa, da se ne smemo vrniti v stanje, ki je enako dvema potezama nazaj. V tem primeru to pomeni, da beli ne sme igrati na poziciji **u** dokler ne naredi vsaj ene drugačne poteze.

### Konec igre
Ko igralec misli, da so vsi njegovi teritoriji varni, ne more dobiti več teritorija, zmanjšati nasprotnikovega ali ujeti več nizov, namesto igranja kamna, preda en kamen nasprotniku kot ujetnika. Ko oba igralca to storita zaporedoma, se igra konča. Odstranijo se vze brezupne skupine, ki postanejo zaporniki.

### Elementi igre
#### Igralca
Igro igrata dva igralca, en dobi vlogo črnega, drug vlogo belega.
#### Poteza
Igralca si izmenjujeta potezi. V vsaki potezi lahko igralec odloži en kamen ali pa preda potezo nasprotniku.
Začne črni.
#### Kamni
Oba igralca imata neomejeno zalogo kamnov, črni igralec črne, beli bele.
#### Igralna plošča
Igralna plošča velikosti 19 x 19, kjer se kamni odlagajo na stičišča.
#### Točke svobode
So prazna stičišča okoli kamna, skupine ali niza kamnov.
#### Zaporniki
Kamni, ki jih je igralec dobil od nasprotnika prej ujemanja.
#### Teritorij 
Prazno stičišče je del teritorija igralca, če so vsi kamni, ki so mu sosednji od istega igralca ali so vsa prazna stičišča povezana s kamni istega igralca.
#### Točke
Vsak igralec dobi točke na koncu igre kot seštevek lastnega teritorija in števila zapornikov, ki jih je ujel nasprotniku.


