package com.example.materialdesign;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


/*
Material design:la7 ne7ke 3an mawdo3 mohem kel l applications btehtam fe esmo material design la7 nshof sho howe l material desgn, keef este5demo,sho momken y7asen 3al application ta3ele mn ne7yet y5le tasmem bshakl ajmal y7abeb l 3alam bel application..etc

material design howe concept jdeed mn sherket goggle l concept be2ol eno tasmem l 5as feek ykoun ajmal w artab w a7la w ashal w l color bekoun mnas2a w l icon ykoun mosta7a mesh mo32ade w l views metl l edit text w l spiinener,button tkoun tafe3leye aktar ma3 l user manzara tbyen tafe3leye aktar lal user ya3ne howe ma bda2 3ashen y7sen tasmem ta3elak bel application y2de la tasmem sahl w 7elo lal user w more7 lal basar

hala2 ne7na taf2na eno l material design btest5dam lal mobile l version ta3elo 2a3la mn 21 ya3ne aye wa7ad mn l 21 w tlo3 bye2dar yet3emal ma3 l material design
tyeb ana bade 2a3ml application kamen yemshe 3ala l version le 2a2l mn 21 fa mnest5dem support library ne7na 2olna eno 3ana she esmo version l android w 3ande maktabet da3bm ya3ne support library le feha code testa5dam le tanfez majmo3a mn l 3amlyet l barmajeye le mawjoude b versions jdede bas maktobe b code 2adem 3ashen yesma7o eno l version l 2ademe mn l application te2dar tabe2 l 3mlyet l jdedee hay
fa fe 3ande 5 steps bade nafezoun 3ashen  2e2dar 5ale tatbe2e 7ata law ken l version ta3elo 2ademe ye2dar yet3emal ma3 l material design w law kenet l version jdede 5als howe heek heek bye2dar yet3emal ma3a l fekra mn l material design sawe2 kenet version 2ademe jdede bye2dar l app yet3emal ma3a
w enta ba3den feek tseer ta3mel shorot wala law kenet l version 2ademe rou7 sta3mel support library iza l version jdeede sta3mel l mawjoude bel version enta 7or


Steps to use material design:
1-este5dem librarys lezme:l material design mesh mawjoude by diffult bel version 21 w ma fo2 2aw b ma3na tene 3ashen te2dar test5dem l material design bel application ta3elak w t5le application ta3elak mote7 la kol l version lezm trou7 tet3emal ma3 support library fa 2awl 5otwe bade 2a3mela bade fout 3ala l buld gradle w deef library ta3et support library bas le sar eno mn l android studio mn version 3.2 w fo2 badel ma yest3mlo library support library saro yest3mlo library badela esma AndroidX artifacts ya3ne ra7o jame3a 3mlo she esmo androidX l androidx hay ra7o 7ato feha kel l eshay le mawjoude bel support library jama3oha w 7atoha b library wa7de esma androidx a badel ma kel shway t2olo support dot kaza kaza 2alak la2 ana jam3tlk kel l eshya bel support library w 7atytelak yehoun b library esma androidx
2-tarjamet l application b2e5er esdar mn android:eje 7ekelak enta bel buld.gradle fe she 3andak esmo compilesdkversion 34 heye telka2eyan bye5od e5er version nezle 3andak sho ya3ne compilesdk ya3ne nos5a le 5elel ma enta btktob code bado ytarjem 3lyha b ma3na tene mnensa7 eno l compile sdk ykoun e5er version nezel lesh l2no lama ta3mel codak w ta3mel tasmemak ytarjmo 3ala 27das esdar law fe 5ata2 y2olak fe 5ata2 b 2a7das esdar fa enta btetdman heek eno application t3elak  keen 3ala atem wejeh fe l versions l 7adese kolha w mn demna 2e5er version  tab3an 2a7das version byeshmel kel l version le 2ablo ne7na 3mlna hay l 7arake l2no iza 3am 2a3mel tasmeme ana 3am ektob xml w tele3 5ata2 mo3ayan bel tasmem y2ole eno bel version 34 fe 5ata2 compilesdk howe 5elel ma enta btktob code bya3mel commpilation b2olak ween fe 5ata2 houn bado y2ole ween fe 5ata2 bel tasmem b 2e5er version 3ashen 7asno
3-testa5dem mokwnet l monesebe la tamem:b2olak kamen yofdal bas testa5dem l material design l activity le badak teshte8l 3lyha tkoun appcomatactivity extend appcompatactivty l appcompatactivity heye nou3 mn anwa3 l activity l 5as le mawjoud bel support library yofdal test5dem l appcompatactivity ta7souban la ta3mel aye 3mlye barmajeye mn 5elele l code fa tkoun mad3ome fe library da3m mest5dem l activity le mawjoude b library l da3m ana 7ares eno mesh bas layout tkoun mosta5dam feha l   supportlibrary la2 wl activity nafsha le bada to3roud layout bade yeha test5dem l support library 3ashen edman afdal 2ade2 lal application ta3ele law me7tej nafez methodes jowa l activity tkoun l methods hay b2este5dem l activity l majoude  bel supoort library 3ashen ykoun fe taneso2 ma byenfa3 l activity tkoun mn l android w layout mn support library lezm ykouno metl ba3d
4-ta8yer theme l 5as bel mashro3 2aw l 3anser:hala2 lezm t8yer theme badel tehem l 5as bel android ykoun theme.materialcommponent dot no3 le badak yeh fa bhay tare2a bseer kel l views le badak test3meloun eno houne material design fa telk2eyan bseer yt3emal kel views eno houne 3ebra 3an material design ya3ne kel l views bseer mohaya2 eno yet3mela ma3 l material design feek tzeed 5asa2es ya3ne masln loun l error le bado yetla3 bel edit text sho lawno 2aw loun l button aye waa7d yes7ab button sho ykoun lawno
5-bad2 b2este5dem 3anaser tasmem l jdede le 3mel theme 3ashenoun:ya3ne law bade esta5dem edittext best3mel com.android.material.textfield..etc l views ta3wlet l material design bte5telef 3an l l android l 3adeye



exple edittext materialdesign:
<!--    masln bade est3ml l edit text le feha hint btertefe3 la fo2 ma bte5tefe bst3ml she esmo com.gooogle.material.textfield.textinputlayout hay bta3tek layout bt7ot l feture l badak yeha feha heye 3ebra 3an layout w joweta bt7ot l edit text le heye com.ggogle.input hala2 mnl7ez mesh kel l views mad3ome mn material design bas l button mad3ome w be2e l views keloun ta3wlet l com.goggle.material haw le fehoun material design ya3ne howe l 5asa2es le bt8ayera b theme bas bt8ayer l buttom be2e l views ma btewresha btest3mel com.ggogle -->
    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintTop_toTopOf="parent">
        <com.google.android.material.textfield.TextInputEditText
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="khaled"
            android:textColor="#C71A1A"/>
    </com.google.android.material.textfield.TextInputLayout>

hala2 3ande majmo3et sha8let asaseye 3ashen tet3emal ma3 l material design:
CoordinateLayout
AppBarLayout
ToolbarLayout
Tablayout
NestedScrollView
CollapsingScrollView
CollapsingToolbarLayout
FloatingActionButton


CoordinatorLayout:nou3 mn anwa3 layout le mawjoude bel support library w fekretha bteshbah l frame layout btrateb l 3anser fo2 ba3da ya3ne l 3onsour l 2awl howe button byeje faw2o tene 3onsour l textview byeje faw2o kaza fa btkoun l 3anser m8atye 3ala ba3da fa 2a5do l mabda2 ta3el l frame layout w 3mlo 3lee ta3del b7es ya3mlo coordiantor layout bshakl afdal w bshakl seles lal most5dem l2no heye mn afdal layout le mawjoude perforamance ta3ela momtez
fa hala2 7a nshof sho l fekra ta3et l coorndinator layout w keef mnest3mlo w sho l fekra mena

AppBarLayout:howe 3ebra 3an l manta2a le b2a3la l application momken tkoun toolbar w ma3a sha8le tenye momken soura ma3 action bar ya3ne tool bar fa l manta2a l 3olweye mn l aplication msameha Appbarlayout


ToolBarLayout:w hay 5asa bel toolbar l toolbar elo layout 5asa fe law enta badak defo jowa layout 7a nshof elo no3 m3ayan esmo collapsing toolbar
fa le badna na3rfo eno l appbarlayout howe l manta2a l 3olweye bel application w momken ykoun fe b2alba layout 5asa bel tool bar esma toolbarlayout w aye she tene kamen momkn t7ot feha 3atoul toolbar b7ota b layout 5asa feha esma toolbar layout 2aw no3 tene esmo collapsing toolbar layout ya3ne l appbar heye l manta2a l 3olweye bel application w toolbarlayout byeje b2lab heye 3ebra 3an layout le btkoun mawjoude b2alb l manta2a l 3olweye bel application le bado ykoun feha toolbar

TabLayout:shakla metl shakl l watsap ela tabs wa7de lal howe,status,setting b7es eno lama tekbous 3ala wa7de menon yet8ayar l mo7tawa le mawjoud bel nous hyde mneshra7a ba3d l fragment met3la2a bel fragment w she esmo viewpagger


NestedScrollView:howe nafs l scroll view l heye tetla3 w tenzal b shshe la mn fo2 la ta7t ya m yamen w shmeel ya3ne horizantal 2aw vertical feek te3tebara listviews jowet listview ya3ne exmple law 3andak listview jowet listview w badak ta3mel scroll bel listview de5leye mesh l 5erjeye  keef badak tfahmo eno wala hay nested motade5le fe aktar mn scroll bado ykoun joweta fe 3ana she esmo nestedscroll view bt7olele yeha  ya3ne law 3ande scrol view b2alab recycle view tnaynetoun bya3mlo scroll w ana bade 2a3mel scroll lal reycele view fa keef bado 2olo eno hay scroll jowet scroll mn 5elele l nested scroll view


CollapsingToolBarlayout:hay le 7a net3emal ma3a ma 7a net3emal ma3 toolbarlayout l2no collapsingtoolbarlayout bta3tene ma7yezet aktar  heye nafs toolbarlayout bas b 5asa2es tenye collapsing ma3neta dam ya3ne fe 3ana layout btshofoun bas na3mel scroll la ta7t besa8er le mo7tawa le keen fo2 w b2arjek bas tool bar w bas terja3 ta3mel scroll la fo2 bye5felak l tool bar w be2rej l mo7tawa fe soura w heek bekoun feek 3mla mn 5elel layout le esma collapsingtoolbarlayout ra7 3emel kamsh 2aw dam lal toolbarlayout b7es eno yezher mena bas toolbar w bas ya3mel expend 2aw tawse3 yezher toolbarlayout kola le feha toolbar w soura masln


floatingactionbutton:no3 5as mn l button bekoun 3atoul b 2e5er shshe 3al yamen bekoun shaklo dowyra bye2bar t7ot b2lbo icon w bas ta3mel da8ta tawele betshof ka2no fe may meshye 3ala l 3onsour ya3ne zel


bas note:l toolbarlayou heye nafsa zeta l collapsingtoolbarlayput bas ne7na 7a nest5dem  collapsingtoolbarlayput l2no ela mazeya a7la



note tene l appbarlayout:malsn momken ykoun l toolbarlayout w l tab layout ya3n toolbar w ma3o l tablayout le heye metl l watsap 2olna fe b2lab setting,home, statuss. enta bel 3ade bel app metl l watsap betl2ehoun b nagfs lounn masln 2a5dar w modmjen ma3 ba3d b manta2a wa7de lehye l appbarlayout fa 3mlohoun b layout esma tabbarlayout




hala2 bade 2a3ml tasmem nafs l le 2olne fe toolbar w bar w soura w bas nazel l soura bte5tefe w bedal l tool bar w bas tale3 la fo2 btbyen l toolbar w soura:

1-2awl sha8le lezm 5ale l parent coordinator layout l2no heek tasmem ma byet3emal 8eer ma3 coordinator layout l2no fe animation kamen w ma7ada bya3mela 8eer l coordinaor layout howe bte2dar ta3mela b 8eer layout bas l sa3eta l scroll animation mesh 7a tezbat
2-hala2 jowa l coordianator layout joweta appbarlayout le 7a n7ot fe toolbar w tablayout
3-jowa l appbar layout toolbarlayout,or collapsingtoolbarlayout 3ashen l animation  le fe toolbar ,w kamn tablayout le fe joweta l tabs setting,home,status





















 */
























public class
MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        fab=findViewById(R.id.fab);

        //best5dem method esma setsupport actionbar w ba3teha toolbar ta3ete ma3neto 5ale l action bar  l 2efterade ta3el shshe howe toolbar le ana 3mlto bel activity ma best5dem setactionbar la2 fe far2 hayde lal sdk l 3adeye wa7de lal support library n7na badna le bel support library l2no toolbar bel supportlibrary le ana 7ateta
        setSupportActionBar(toolbar);

        fab.setOnClickListener(v->{
            fab.animate().rotationBy(360f)
                    .setDuration(500)
                    .start();


        });



    }

    //7akytelo 5ale l menue tezhar bel application ta3ele
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menue,menu);
        return true;
    }
}