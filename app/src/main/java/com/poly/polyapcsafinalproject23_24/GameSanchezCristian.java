package com.poly.polyapcsafinalproject23_24;

import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;



public class GameSanchezCristian extends GameActivity {


    //instance variables
    //   variables you plan to use throughout the adventure

    private int numLives;

    //private Player player; (optional)


    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }



    public void run()
    {
     setContentView(R.layout.activity_game_3_button);
     tvTitle = findViewById(R.id.tv_title_txt);
     tvSubtitle = findViewById(R.id.tv_subtitle);
     tvstoryText = findViewById(R.id.tv_story);
     iv = findViewById(R.id.iv_story);
     btn1 = findViewById(R.id.btn_1);
     btn2 = findViewById(R.id.btn_2);
     btn3 = findViewById(R.id.btn_3);







        tvTitle.setText("Will you survive");
        tvSubtitle("The Not so seemly Dangerous places but they are.");

        numLives = 3;
        start();
    }

    private void start()
    {
        isWon = false;



        tvStoryText.setText("\nIts finally summer,lets get it ");


        setAllBtnsVisible();
       btn1.setText("Go to the park");
       btn2.setText("Go to School");
       btn3.setText("Go to Church");


       btn1.setOnClickListener(new view.OnClickListner() {

           @Override
           public void onClick(view v) {
               goToPark();
           }
       });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                goToSchool();
            }
        });



        btn3.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                goToChurch();
            }
        });

    }

    private void goToPark()
    {

        tvStoryText.setText("\nHow do you want to go to the Park?");

        setAllBtnsVisible();
        btn1.setText("Go Walking");
        btn2.setText("Go in the uber");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                goWalking();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                uber();
            }
        });

    }

    private void goWalking()
    {
        tvStoryText.setText("1.Do you want to take the shortcut 2. Do you want to take the longway");

      setAllBtnsVisible();
        btn1.setText("Take shortcut");
        btn2.setText("Take longway");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                shortCut();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                longWay();
            }
        });

    }

    private void shortCut()
    {

        tvStoryText.setText(" Sense you chose the shortcut this is the consequence There was gangmembers in and Ali and they got you");

        defeat();
    }

    private void longWay()
    {
        tvStoryText.setText(" Sense you chose the longway this is the consequence You made it to the park but you lost because some thugs saw you and shot at you ");

        defeat();
    }
    private void uber()
    {

        tvStoryText.setText(" Sense you chose an uber what uber would you like to take to the park?");

        setAllBtnsVisible();
        btn1.setText("Take nice car");
        btn2.setText("Take regular car");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                niceCar();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                regularCar();
            }
        });


    }

    private void niceCar()
    {

        tvStoryText.setText("The nice luxurious car owner is a kidnapper and he takes you");

        defeat();
    }

    private void regularCar()
    {

        tvStoryText.setText("The regular average person was a serial killer and murder you.");

        defeat();
    }

    private void goToSchool()
    {

        tvStoryText.setText("How do you want to go to school?");


        setAllBtnsVisible();
        btn1.setText("Take a bike ride");
        btn2.setText("Take the car");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                bikeRide();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                take();
            }
        });
    }


    private void bikeRide()
    {

        tvStoryText.setText("How do you want to go to school?");

        setAllBtnsVisible();
        btn1.setText("Take the side walk");
        btn2.setText("Take the road");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                sideWalk();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                road();
            }
        });
    }

    private void sideWalk()
    {

        tvStoryText.setText("People in the sidewalk stop you and steal your bike and beat you up");

        defeat();
    }

    private void road()
    {

        tvStoryText.setText("You get ran over at the corner of the school");

        defeat();
    }
    private void take()
    {

        tvStoryText.setText("What type of car do you want to take?");

        setAllBtnsVisible();
        btn1.setText("Take the sports Car");
        btn2.setText("Take the old Car");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                sportCar();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                oldCar();
            }
        });
    }
    private void  sportCar()
    {
        tvStoryText.setText("You go so fast and the breaks werent working that caused you to crash into a tree");

        defeat();
    }

    private void  oldCar()
    {

        tvStoryText.setText("That car has been there for years that your own parents don’t even know where the keys are.");

        defeat();
    }

    private void goToChurch()
    {

        tvStoryText.setText("What church do you want to go too ");

        etAllBtnsVisible();
        btn1.setText("Old Looking church");
        btn2.setText("Nice fancy looking church");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                old();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                fancy();
            }
        });
    }
    private void old()
    {

        tvStoryText.setText("\nWhat color do you want to wear to Church?");

        etAllBtnsVisible();
        btn1.setText("Wear red");
        btn2.setText("Wear blue");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                red();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                blue();
            }
        });
    }
    private void  red()
    {

        tvStoryText.setText("The pastor is fake and doesn't like the color red");

        defeat();
    }

    private void blue()
    {
        tvStoryText.setText("You are the winner nice your a champ.");
    }

    private void fancy()
    {

        tvStoryText.setText("Where do you want to sit at the Church?");

        etAllBtnsVisible();
        btn1.setText("Sit in the Front were it is empty.");
        btn2.setText("Sit in the Back were it is empty.");
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                front();
            }
        });

        btn2.setOnClickListener(new view.OnClickListner() {

            @Override
            public void onClick(view v) {
                back();
            }
        });

    }


    private void  front()
    {

        tvStoryText.setText("\nYou die she is weird she dosnt like people siting in the front ");

        defeat();
    }


    private void  back()
    {

        tvStoryText.setText("\nYou die she is weird she dosnt like people siting in the back ");

        defeat();
    }




    private void defeat()
    {
        numLives--;

        tvStoryText.setText("...");

        if (numLives > 0)
        {
            start();
        }
        else
        {
            tvStoryText.setText("GAME OVER TRY AGAIN");
        }
    }
}