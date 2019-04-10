package ru.sgti.gamestore;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MK_1Activity extends AppCompatActivity {

    _MainActivity _M = new _MainActivity();

    ArrayList<Integer> imgsMK = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mk_1);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        final ImageButton imBtn1 = findViewById(R.id.imBtn1);
        final ImageButton imBtn2 = findViewById(R.id.imBtn2);
        final ImageButton imBtn3 = findViewById(R.id.imBtn3);
        final ImageButton imBtn4 = findViewById(R.id.imBtn4);
        final ImageButton imBtn5 = findViewById(R.id.imBtn5);
        final ImageButton imBtn6 = findViewById(R.id.imBtn6);
        final ImageButton imBtn7 = findViewById(R.id.imBtn7);
        final ImageButton imBtn8 = findViewById(R.id.imBtn8);
        final ImageButton imBtn9 = findViewById(R.id.imBtn9);
        final ImageButton imBtn10 = findViewById(R.id.imBtn10);
        final ImageButton imBtn11 = findViewById(R.id.imBtn11);
        final ImageButton imBtn12 = findViewById(R.id.imBtn12);

        final ImageButton imBtnR1 = findViewById(R.id.imBtnR1);
        final ImageButton imBtnR2 = findViewById(R.id.imBtnR2);

        final ImageView imageView1 = findViewById(R.id.imageView1);

        Button Btn1 = findViewById(R.id.Btn1);
        Button Btn2 = findViewById(R.id.Btn2);

        for(int i=1;i<=12;i++){
            imgsMK.add(getResources().getIdentifier("mk_fentezy_"+i, "drawable", getPackageName()));
        }

        for(int i=1;i<=15;i++){
            imgsMK.add(getResources().getIdentifier("mk_skazka_"+i, "drawable", getPackageName()));
        }

        final int[] current_img = new int[1];

        imBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs1[1]-1));
                current_img[0] = imgs1[1];
                imBtn1.getLayoutParams().height = 0;
                imBtn1.requestLayout();
            }
        });

        imBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs1[2]-1));
                current_img[0] = imgs1[2];
                imBtn2.getLayoutParams().height = 0;
                imBtn2.requestLayout();
            }
        });

        imBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs1[3]-1));
                current_img[0] = imgs1[3];
                imBtn3.getLayoutParams().height = 0;
                imBtn3.requestLayout();
            }
        });

        imBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs1[4]-1));
                current_img[0] = imgs1[4];
                imBtn4.getLayoutParams().height = 0;
                imBtn4.requestLayout();
            }
        });

        imBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs1[5]-1));
                current_img[0] = imgs1[5];
                imBtn5.getLayoutParams().height = 0;
                imBtn5.requestLayout();
            }
        });

        imBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs1[6]-1));
                current_img[0] = imgs1[6];
                imBtn6.getLayoutParams().height = 0;
                imBtn6.requestLayout();
            }
        });

        imBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs2[1]-1));
                current_img[0] = imgs2[1];
                imBtn7.getLayoutParams().height = 0;
                imBtn7.requestLayout();
            }
        });

        imBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs2[2]-1));
                current_img[0] = imgs2[2];
                imBtn8.getLayoutParams().height = 0;
                imBtn8.requestLayout();
            }
        });

        imBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs2[3]-1));
                current_img[0] = imgs2[3];
                imBtn9.getLayoutParams().height = 0;
                imBtn9.requestLayout();
            }
        });

        imBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs2[4]-1));
                current_img[0] = imgs2[4];
                imBtn10.getLayoutParams().height = 0;
                imBtn10.requestLayout();
            }
        });

        imBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs2[5]-1));
                current_img[0] = imgs2[5];
                imBtn11.getLayoutParams().height = 0;
                imBtn11.requestLayout();
            }
        });

        imBtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView1.setImageResource(imgsMK.get(imgs2[6]-1));
                current_img[0] = imgs2[6];
                imBtn12.getLayoutParams().height = 0;
                imBtn12.requestLayout();
            }
        });

        imBtnR1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs1();
                if (!hide) {show_cards();}
                imBtn1.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn1.requestLayout();
                imBtn2.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn2.requestLayout();
                imBtn3.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn3.requestLayout();
                imBtn4.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn4.requestLayout();
                imBtn5.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn5.requestLayout();
                imBtn6.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn6.requestLayout();
                _M.Toast(MK_1Activity.this,"Верхний ряд обновлен");
            }
        });

        imBtnR2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rnd_imgs2();
                if (!hide) {show_cards();}
                imBtn7.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn7.requestLayout();
                imBtn8.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn8.requestLayout();
                imBtn9.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn9.requestLayout();
                imBtn10.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn10.requestLayout();
                imBtn11.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn11.requestLayout();
                imBtn12.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
                imBtn12.requestLayout();
                _M.Toast(MK_1Activity.this,"Нижний ряд обновлен");
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (current_img != null) {
                    String text = "";

                    if (current_img[0] == 1) {
                        text = "Огнескок (Fire-spring) – обитатель горячей планеты Сан, добрый, немного рассеянный и очень беспокойный, шебутной. " +
                                "Всегда торопится помочь окружающим, но редко доводит дело до конца. " +
                                "Только то, что можно уладить быстро, ему по плечу. Говорит быстро, постоянно подпрыгивая.";
                    }
                    if (current_img[0] == 2) {
                        text = "Хобокрыл (Trunkwings) – житель Саны, страдает близорукостью и оттого опасен даже для друзей." +
                                " Может присосаться хоботками, приняв за врага или просто за незнакомца. " +
                                "Считает, что всё неизвестное – опасно и лучше напасть первым. Однако не злой, а скорее пугливый. Немного мечтателен. " +
                                "Говорит медленно, любимые слова – жаль, здесь.";
                    }
                    if (current_img[0] == 3) {
                        text = "ОНО (IT), для друзей – Пентик. Житель планеты Сток. Характер расплывчатый, своего мнения не имеет. Легко знакомится, легко расстается. " +
                                "Говорить, как люди или звери, не умеет. Булькает и меняет форму тела, если согласен или не согласен с чем-то. " +
                                "Чем быстрее булькает и больше сжимается, тем более взволнован, не согласен.";
                    }
                    if (current_img[0] == 4) {
                        text = "Шелкохвост (Silk-tail) – один из прекраснейших обитателей планеты Фэнта, поэт, художник, мыслитель. Наблюдателен, не любит быстрых действий. " +
                                "Внимателен к окружающему миру, но не спешит на помощь каждому: сначала обдумывает варианты и последствия. Говорит протяжно, певуче.";
                    }
                    if (current_img[0] == 5) {
                        text = "Шерстогрыз (Wool-sting) – не самый приятный житель планеты Сток. Чаще всего в плохом настроении, бурчит себе что-то под нос. " +
                                "Готов ужалить каждого, кто с ним не согласен. Когда особенно зол – зеленеет. Под мягкой шерстью спрятаны колючки. " +
                                "Разговаривая, свистит и шипит, никогда не говорит громко.";
                    }
                    if (current_img[0] == 6) {
                        text = "Солнцекрыл из породы солнечных коней (Solar-skate) с планеты Сан. Добрый, как и большинство ее обитателей. Трудяга, очень ответственный и внимательный. " +
                                "Девять локаторов позволяют ему принимать сразу много информации. Но решает сердцем, а не умом. Говорит легко, звонко, немного в нос.";
                    }
                    if (current_img[0] == 7) {
                        text = "Рободан (Robodan) – любитель и ценитель прекрасного с планеты Лав. Робот-художник, робот-поэт, робот-композитор. Очень чуток ко всему окружающему. " +
                                "Стремится к гармонии и пытается помочь всем услышать друг друга. Голос певучий и в то же время механический.";
                    }
                    if (current_img[0] == 8) {
                        text = "Смешинка (Тwinkle) – всегда радостная жительница планеты Лав. Умеет видеть во всем позитив, любит наблюдать и помогать, но редко доводит начатое до конца." +
                                " Говорит краткими фразами. Смеется, но не высмеивает. Доброе чувство юмора. Знает всегда все последние новости.";
                    }
                    if (current_img[0] == 9) {
                        text = "Бергозавр (Bergosaurier) – животное безобидное, несмотря на огромный рост (до 5 метров), вес (до двух тонн) и страшные клыки и когти. " +
                                "Тонкий высокий голос. Спит, свернувшись в клубок на земле. Чувствует страх другого существа и всегда пытается успокоить, согреть, помочь. " +
                                "Говорит быстро, но не очень уверенно.";
                    }
                    if (current_img[0] == 10) {
                        text = "Драйвер (Driver) – один из мудрейших жителей планеты Боа. Его тело состоит из двух полушарий огромного мозга и лапок-контактов. " +
                                "Драйвер родился для поддержки связей между миром природы и живыми существами. Он – переводчик с языков трав, деревьев, воды и земли на языки птиц, людей, зверей. " +
                                "Способен понять и объяснить всё.";
                    }
                    if (current_img[0] == 11) {
                        text = "Ксорс (Ksors) – обитатель планеты Эрде из породы коордов. Имеет 6 мозговых центров, принадлежащих разным по своей природе существам. " +
                                "Известен плохим характером. Не готов к контактам. Развивается внутри себя и для себя. " +
                                "Хочет стать правителем народов Эрде, но не готов к тяжелой работе и ответственности." +
                                " Жесток. Часто обманывает.";
                    }
                    if (current_img[0] == 12) {
                        text = "Птицерыб (Birdfish) – житель планеты Эрде. У него короткая память, невнимательность, рассеянность. " +
                                "Птицерыбы с радостью идут на контакт, но не стоит рассчитывать на реальную помощь от них. " +
                                "Могут жить в воде и на земле. Приспосабливаются ко всему. Болтливы. Постоянно заняты чем-то. Никогда не доводят дело до конца.";
                    }
                    if (current_img[0] == 13) {
                        text = "Домовой - хозяин и охрана дома. Если правильно себя вести, дает плодородие, бережет здоровье людей и животных. " +
                                "Сторожит дом, ухаживает за всем, что есть в доме. Если люди забывают о нем, ленятся, не берегут дом, может навредить. " +
                                "Любит шутить. Шумит, бродит ночами по дому, вздыхает и бормочет. Может плакать, если дому грозит беда. " +
                                "Не любит зеркал. Предвидит будущее.";
                    }
                    if (current_img[0] == 14) {
                        text = "Финист-Ясный сокол – молодой красавец. В одних сказках – простой пахарь, богатырь, защитник русской земли. " +
                                "В других сказках – заколдованный царевич. " +
                                "Может превращаться в сокола. По вине злых людей попадает в неприятности, оказывается далеко от дома, в чужом замке или крепости. " +
                                "Освобождает его всегда любящая и трудолюбивая девушка.";
                    }
                    if (current_img[0] == 15) {
                        text = "Баба-Яга – старая, страшная внешне колдунья. Длинный нос, костяная нога, седые длинные волосы, огромные ногти. " +
                                "Живет в избушке на курьих ножках на опушке леса. Летает в ступе. Все видит, все знает. Может помочь герою, может его съесть. " +
                                "Героиням помогает, детей не любит. Требует, чтобы все шло по ее правилам: от разговора до еды и бани. " +
                                "Иногда вспоминает, что у нее есть еще сестры, тоже Бабы Яги.";
                    }
                    if (current_img[0] == 16) {
                        text = "Царевна-лягушка (она же Василиса Премудрая) – заколдованная красавица. Мудрая, умеет колдовать. " +
                                "Ей помогают выполнять работу по дому: Солнце и Луна, насекомые, животные, птицы. Ее враг – Кощей Бессмертный. " +
                                "Ее освободитель и муж – Иван-царевич.";
                    }
                    if (current_img[0] == 17) {
                        text = "Серый волк – очень большой волк. Сильный, справедливый, мудрый. Умеет говорить как человек. Бежит или скачет на огромное расстояние. " +
                                "Может превращаться в птицу, коня, женщину. Верно служит тому, кого сам выбрал. Знает – что у кого есть из волшебных вещей." +
                                " Живет у перекрестка дорог. Ест коней.";
                    }
                    if (current_img[0] == 18) {
                        text = "Змей Горыныч - огнедышащий дракон, имеющий несколько голов (от 3х до 12ти). Горыныч живёт обычно за тридевять земель, в горах, иногда у огненной реки. " +
                                "Он стережёт Калинов мост, по которому попадают в царство мёртвых. Убить его можно не каждым мечом. Есть у него и братья с разным количеством голов. " +
                                "Похищает красивых девушек. Ест коров и богатырей. Иногда летает.";
                    }
                    if (current_img[0] == 19) {
                        text = "Жар-Птица – огненная прекрасная птица. Ее глаза светятся как кристалл. Ростом и криком напоминает павлина. Живёт в райском саду, в золотой клетке." +
                                " По ночам летает по чужим садам. Ест (иногда ворует) золотые яблоки, дающие молодость, красоту и бессмертие." +
                                " Пение жар-птицы лечит больных и возвращает зрение слепым. Осенью она умирает, а весной снова оживает.";
                    }
                    if (current_img[0] == 20) {
                        text = "Конек-Горбунок – маленький конек, ростом ниже ослика. На спине – два горба, как у верблюда. Брат прекрасных коней. " +
                                "Умеет летать выше облаков, немного колдует, может предвидеть будущее. Мудрый и находчивый." +
                                " Служит тому, кто его поймал. Герой сказки Петра Ершова.";
                    }
                    if (current_img[0] == 21) {
                        text = "Кот Баюн - огромный кот с волшебным голосом. Он навсегда усыпляет своими сказками слабых. Но тот, кто победит Кота, найдет спасение от всех болезней. " +
                                "Сказки Баюна целебны. Баюн сидит на высоком железном столбе. Живет кот за тридевять земель в тридесятом царстве или в безжизненном мёртвом лесу, где нет ни птиц, ни зверей. " +
                                "Однажды Кот Баюн жил даже у Бабы-Яги.";
                    }
                    if (current_img[0] == 22) {
                        text = "Русалка – женщина или девушка с длинными светлыми волосами, в белой длинной одежде или без одежды. Чаще всего, красивая. " +
                                "Появляется одна или с подругами летом в поле, в лесу, у воды. Может защекотать человека или взять с собой в воду. Живет в воде. " +
                                "Любит причесывать волосы и плести венки из цветов. Водит хороводы.";
                    }
                    if (current_img[0] == 23) {
                        text = "Кикимора – смешная неряшливая старушка или девочка, маленькая, худая. Живет в доме человека, за печкой, на чердаке; или на болоте." +
                                " Приносит мелкие неприятности хозяйству и людям. Жена домового или лешего. Любит прясть пряжу и ткать. Шьет плохо. Может быть невидимой." +
                                " Быстро бегает и далеко видит. Активна ночью.";
                    }
                    if (current_img[0] == 24) {
                        text = "Водяной – хозяин вод и всего, что живет в воде. Толстый старик с рыбьими глазами и хвостом, с зелеными усами и бородой. " +
                                "Умеет превращаться в рыбу, зверя, птицу, бревно, лошадь. Живет в омутах, водоворотах, на старых водяных мельницах, на дне реки." +
                                " У него есть дворец. Водяной любит выглядывать из воды, хлопать, хохотать, кричать выпью, блеять бараном. " +
                                "Любимое время водяного — полдень, на вечерней заре, полночь, а также при луне. Опасен для человека.";
                    }
                    if (current_img[0] == 25) {
                        text = "Кощей Бессмертный – злой колдун. Его смерть спрятана в яйце, в утке, в зайце, в медведе, в сундуке, на дубе, на острове в океане. " +
                                "Силу ему дает вода. Очень скупой и древний. Охраняет свои богатства. Ворует девушек и запирает их в башне. " +
                                "Внешне – высокий или низкий, худой как скелет. Хозяин подземного царства. Может превращаться в ворона.";
                    }
                    if (current_img[0] == 26) {
                        text = "Леший - хозяин леса. Помощник и защитник зверей и птиц. Хорошим людям помогает найти ягоды и грибы, выйти из леса. " +
                                "Плохих пугает, путает, заставляет ходить кругами. Леший поет голосом ветра, бьёт в ладоши, свищет, аукает, хохочет, плачет." +
                                "Может быть невидимым. Обычно одинок.";
                    }
                    if (current_img[0] == 27) {
                        text = "Лихо одноглазое - огромный злой одноглазый великан или высокая худая лохматая женщина с одним глазом. " +
                                "Если Лихо рядом, героя преследуют разные несчастья. " +
                                "Может привязаться к одному человеку и вредить ему. Победить его можно только хитростью и смелостью. " +
                                "Живет в избушке в лесу или бродит по дорогам.";
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(MK_1Activity.this);
                    builder.setMessage(text);
                    builder.setPositiveButton("OK", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
            }
        });

        rnd_imgs1();
        rnd_imgs2();
    }

    int [] imgs1 = new int[7];
    int [] imgs2 = new int[7];

    public void rnd_imgs1() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs1[1] = 1 + rnd.nextInt(2 - 1 + 1);
        imgs1[2] = 3 + rnd.nextInt(4 - 3 + 1);
        imgs1[3] = 5 + rnd.nextInt(6 - 5 + 1);
        imgs1[4] = 7 + rnd.nextInt(8 - 7 + 1);
        imgs1[5] = 9 + rnd.nextInt(11 - 9 + 1);
        imgs1[6] = 11 + rnd.nextInt(12 - 11 + 1);
    }

    public void rnd_imgs2() {
        Random rnd = new Random(System.currentTimeMillis());

        imgs2[1] = 13 + rnd.nextInt(14 - 13 + 1);
        imgs2[2] = 15 + rnd.nextInt(16 - 15 + 1);
        imgs2[3] = 17 + rnd.nextInt(19 - 17 + 1);
        imgs2[4] = 20 + rnd.nextInt(22 - 20 + 1);
        imgs2[5] = 23 + rnd.nextInt(25 - 23 + 1);
        imgs2[6] = 26 + rnd.nextInt(27 - 26 + 1);
    }

    boolean hide = true;

    public void show_cards() {
        ImageButton imBtn1 = findViewById(R.id.imBtn1);
        ImageButton imBtn2 = findViewById(R.id.imBtn2);
        ImageButton imBtn3 = findViewById(R.id.imBtn3);
        ImageButton imBtn4 = findViewById(R.id.imBtn4);
        ImageButton imBtn5 = findViewById(R.id.imBtn5);
        ImageButton imBtn6 = findViewById(R.id.imBtn6);
        ImageButton imBtn7 = findViewById(R.id.imBtn7);
        ImageButton imBtn8 = findViewById(R.id.imBtn8);
        ImageButton imBtn9 = findViewById(R.id.imBtn9);
        ImageButton imBtn10 = findViewById(R.id.imBtn10);
        ImageButton imBtn11 = findViewById(R.id.imBtn11);
        ImageButton imBtn12 = findViewById(R.id.imBtn12);

        imBtn1.setImageResource(imgsMK.get(imgs1[1]-1));
        imBtn2.setImageResource(imgsMK.get(imgs1[2]-1));
        imBtn3.setImageResource(imgsMK.get(imgs1[3]-1));
        imBtn4.setImageResource(imgsMK.get(imgs1[4]-1));
        imBtn5.setImageResource(imgsMK.get(imgs1[5]-1));
        imBtn6.setImageResource(imgsMK.get(imgs1[6]-1));
        imBtn7.setImageResource(imgsMK.get(imgs2[1]-1));
        imBtn8.setImageResource(imgsMK.get(imgs2[2]-1));
        imBtn9.setImageResource(imgsMK.get(imgs2[3]-1));
        imBtn10.setImageResource(imgsMK.get(imgs2[4]-1));
        imBtn11.setImageResource(imgsMK.get(imgs2[5]-1));
        imBtn12.setImageResource(imgsMK.get(imgs2[6]-1));

        hide = false;
    }

    public void hide_cards() {
        ImageButton imBtn1 = findViewById(R.id.imBtn1);
        ImageButton imBtn2 = findViewById(R.id.imBtn2);
        ImageButton imBtn3 = findViewById(R.id.imBtn3);
        ImageButton imBtn4 = findViewById(R.id.imBtn4);
        ImageButton imBtn5 = findViewById(R.id.imBtn5);
        ImageButton imBtn6 = findViewById(R.id.imBtn6);
        ImageButton imBtn7 = findViewById(R.id.imBtn7);
        ImageButton imBtn8 = findViewById(R.id.imBtn8);
        ImageButton imBtn9 = findViewById(R.id.imBtn9);
        ImageButton imBtn10 = findViewById(R.id.imBtn10);
        ImageButton imBtn11 = findViewById(R.id.imBtn11);
        ImageButton imBtn12 = findViewById(R.id.imBtn12);

        imBtn1.setImageResource(R.drawable.rubb);
        imBtn2.setImageResource(R.drawable.rubb);
        imBtn3.setImageResource(R.drawable.rubb);
        imBtn4.setImageResource(R.drawable.rubb);
        imBtn5.setImageResource(R.drawable.rubb);
        imBtn6.setImageResource(R.drawable.rubb);
        imBtn7.setImageResource(R.drawable.rub);
        imBtn8.setImageResource(R.drawable.rub);
        imBtn9.setImageResource(R.drawable.rub);
        imBtn10.setImageResource(R.drawable.rub);
        imBtn11.setImageResource(R.drawable.rub);
        imBtn12.setImageResource(R.drawable.rub);

        hide = true;
    }

    private Menu menu=null;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_game_menu, menu);
        this.menu=menu;
        MenuItem item = menu.findItem(R.id.action_hide);
        item.setVisible(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                _finish();
                return true;

            case R.id.action_new:
                Intent tt = new Intent(MK_1Activity.this, MK_1Activity.class);
                startActivity(tt);
                finish();
                return true;

            case R.id.action_show:
                show_cards();
                _M.Toast(this,"Картинки открыты");
                item.setVisible(false);
                menu.findItem(R.id.action_hide).setVisible(true);
                return true;

            case R.id.action_hide:
                hide_cards();
                _M.Toast(this,"Картинки скрыты");
                item.setVisible(false);
                menu.findItem(R.id.action_show).setVisible(true);
                return true;

            case R.id.action_about:
                Intent intent = new Intent(MK_1Activity.this, AboutGameActivity.class);
                intent.putExtra("game", "mk");
                startActivity(intent);
                return true;

            case R.id.action_exit:
                _finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void _finish() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Вы действительно хотите выйти из игры?");
        builder.setPositiveButton("Нет", null);
        builder.setNegativeButton("Да", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
