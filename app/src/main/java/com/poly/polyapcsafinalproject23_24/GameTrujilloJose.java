package com.poly.polyapcsafinalproject23_24;


import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;


public class GameTrujilloJose extends GameActivity {

  //instance variables
  //   variables you plan to use throughout the adventure

  private boolean isWon;
  private int numLives;
  private Button btn1, btn2, btn3;
  private ImageView ivStory;
  private TextView tvTitle, tvSubTitle, tvStoryText;
  private void setAllBtnsVisible()
  {
    btn1.setVisibility(View.VISIBLE);
    btn2.setVisibility(View.VISIBLE);
    btn3.setVisibility(View.VISIBLE);
  }


  //private Player player; (optional)


  public void run()
  {
    setContentView(R.layout.activity_game_3_button);

    tvTitle = findViewById(R.id.tv_title_txt);
    tvSubTitle = findViewById(R.id.tv_subtitle);
    tvStoryText = findViewById(R.id.tv_story);
    ivStory = findViewById((R.id.iv_story);
    btn1 = findViewById(R.id.btn_1);
    btn2 = findViewById(R.id.btn_2);
    btn3 = findViewById((R.id.btn_3);

    tvTitle.setText("SPACE EXPLORATION");
    tvSubTitle.setText("Map out the endless void of space");
    start();

  }
    //initialize number of lives
    numLives = 5;
    //create a scanner object for user input
    //create a player object (optional)
    //player = new Player(...)
    //display project title and description
  }

  private void start()
  {
    //start adventure here
    tvStoryText.setText(" Your team's job is to map out the endless void of space. What do you want to do?");
    setAllBtnsVisible();
    btn1.setText("Explore unknown planets");
    btn2.setText("travel outside the galaxy");
    btn3.setText(" go inside a black hole");

    btn1.setOnClickListener();new View.OnClickListener() {

      @Override
      public void onClick(View v) { exploreUnknownPlanets(); }

       btn2.setOnClickListner(new View.OnClickListener() {
      @Override
      public void onClick(View v) { leaveGalaxy(); }

        btn3.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) { enterBlackHole(); }
            }
  }
      }
    }

  private void leaveGalaxy() {
    tvStoryText.setText(" After a longgggg time we finally left the galaxy\n" +
            "    while checking our communications we see a distress\n" +
            "    call being made what should\n" +
            "    we do");

    setAllBtnsVisible();
    btn1.setText("Ignore the call");
    btn2.setText("Respond to the call");
    btn3.setVisibility(View.INVISIBLE);


    btn1.setOnClickListner(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        (ignore);
      }
    });
    btn2.setOnClickListner(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        (respond);
      }
    });
  }

  private void respond() {

    tvStoryText.setText("You and your team fly into action thinking someone is in\n" +
            "    trouble,....little did you think it was all a trap by an\n" +
            "    alien civilization what should we do");

    setAllBtnsVisible();
    btn1.setText("Fight back");
    btn2.setText("RUNNNN");
    btn3.setVisibility(View.INVISIBLE);

    btn1.setOnClickListner(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        (fightBack);
      }
    });
    btn2.setOnClickListner(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        (runAway);
      }
    });
  }

  private void runAway()
    {
      tvStoryText.setText(" While making your best attemp to run your spaceship runs\n" +
              "      out of fuel and the bandits claim there new belongings");
                    defeat();
    }

  private void fightBack()
  {
    tvStoryText.setText("  Our ship plunges into a maelstrom of laser fire and\n" +
            "    explosive chaos.After barely surviving that fight what\n" +
            "    nexts");

    setAllBtnsVisible();
    btn1.setText("Get revenge");
    btn2.setText("Seek help");
    btn3.setVisibility(View.INVISIBLE);


    btn1.setOnClickListner(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        (revenge);
      }
    });
    btn2.setOnClickListner(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        (seekHelp);
      }
    });
  }

  private void seekHelp()
  {
      tvStoryText.setText(" Using a distressed call an advaced alien civilization\n" +
              "    offers help in destroying these space bandits should we\n" +
              "    accept?");

      setAllBtnsVisible();
      btn1.setText("Yes team up with these guys");
      btn2.setText("Betray them after the job is done");
      btn3.setVisibility(View.INVISIBLE);


      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (destroybadGuys);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (betrayThem);
        }
      });
    }

  private void betrayThem()
  {
    {
      tvStoryText.setText("After obliterating the bandits you quickly take out the\n" +
              "    leader of this civilization and order them to serve under\n" +
              "    you with this power you can do anything");
    }
  }
  private void destroybadGuys()
  {
      tvStoryText.setText(" They help you take down these space bandits but in return\n" +
              "    they decided to enslave you not sure what you expedited\n" +
              "    was gonna happen");
    defeat();
  }
  private void revenge()
  {
      tvStoryText.setText(" I don't know why going for revenge sounded like a great\n" +
              "    idea after barely surviving the first time, lets just say\n" +
              "    you didn't get so lucky the second time");
    defeat();
  }
  private void ignore()
  {
      tvStoryText.setText("  You and your team just travel into the empty void of\n" +
              "    space till you relize we are out of fuel what should\n" +
              "    we do");

      setAllBtnsVisible();
      btn1.setText("Send out a distress call");
      btn2.setText("Drift in space");
      btn3.setVisibility(View.INVISIBLE);


      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (sendDistressCall);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (driftAway);
        }
      });
    }
  private void driftAway()
  {


      tvStoryText.setText(" After month of drifting in the endless void of space you\n" +
              "    guys crashed landed into a rogue moon killing you all");
    defeat();
  }
  private void sendDistressCall()
  {
      tvStoryText.setText(" An Alien civilization rescues you guys and offers to\n" +
              "    take you to there planet");

      setAllBtnsVisible();
      btn1.setText("Accept the offer");
      btn2.setText("Decline the offer");
      btn3.setVisibility(View.INVISIBLE);


      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (accept);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (sayNo);
        }
      });
    }
   private void sayNo()
      {
        tvStoryText.setText(" Declining the offer the aliens attempt to raid your ship\n" +
                "      what should we do");

        setAllBtnsVisible();
        btn1.setText("Attck back");
        btn2.setText("Try to bribe them");
        btn3.setVisibility(View.INVISIBLE);


        btn1.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            (attackThemBack);
          }
        });
        btn2.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            (bribeThem);
          }
        });
      }
      private void decline()
        {

          {
            tvStoryText.setText("Your team opens fire defensively and have a brutal\n" +
                    "          fight to the death against these aliens your ship\n" +
                    "          was heavily damaged so you decide to steal there’s");

            setAllBtnsVisible();
            btn1.setText("Attck back");
            btn2.setText("Try to bribe them");
            btn3.setVisibility(View.INVISIBLE);


            btn1.setOnClickListner(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                (attackThemBack);
              }
            });
            btn2.setOnClickListner(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                (bribeThem);
              }
            });
          }













          String text = """
          Your team opens fire defensively and have a brutal
          fight to the death against these aliens your ship
          was heavily damaged so you decide to steal there’s

          1.
          2.
            """;
          System.out.println(text);
          if (option == 1)
          {
            //();
          }
          else if (option == 2)
          {
            //bribeThem();
          }
      }

  private void accept()
  {
    String text = """
    The aliens welcome you to there planet with opens arms and
    show you around, after staying for a while you decide to

    1.Accept the offer
    2.Delicne the offer
      """;
    System.out.println(text);
    if (option == 1)
    {
      //accept();
    }
    else if (option == 2)
    {
      //decline();
    }

  }
  private void enterBlackHole()
  {

      tvStoryText.setText(" Your team  goes through a black hole and inside it\n" +
              "    you have to go either left or right");

      setAllBtnsVisible();
      btn1.setText("Left");
      btn2.setText("Right");
      btn3.setVisibility(View.INVISIBLE);


      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (Left);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (Right);
        }
      });
    }
  private void right()
  {
      tvStoryText.setText("  Going right you find a small universe, these small beings\n" +
              "    treat you as Gods, what should you do");

      setAllBtnsVisible();
      btn1.setText("Kill them all");
      btn2.setText("Enslave them for more power by playing God");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (killThem);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (enslaveThem);
        }
      });
    }

  private void enslaveThem()
    {
      tvStoryText.setText("  You make this universe work for you in your new journey to\n" +
              "    conquer the multiverse what should we do with this power");

      setAllBtnsVisible();
      btn1.setText("Invade a nerby gallaxy");
      btn2.setText("Build up your army");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (inVade);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (buildUpArmy);
        }
      });
    }
  private void buildUpArmy()
  {
      tvStoryText.setText(" You decide to be smart and build up your army and, you are\n" +
              "    now powerful enough to destroy galaxy");

      setAllBtnsVisible();
      btn1.setText("Concur the galaxy");
      btn2.setText("Go after the Gods");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (concur);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (destroyGods);
        }
      });
    }
  private void concur()
    {
      tvStoryText.setText("After invading countless galaxies you are now feared by\n" +
              "    all in this universe");
  }
  private void destroyGods()
  {
      tvStoryText.setText("You enslaved small humans and thought you were powerfull enough to defeat the Gods.");
    defeat();
  }
  private void inVade()
  {
      tvStoryText.setText("You got to cocky and decided to go straight into it like a\n" +
              "    horrible leader, everyone got killed");
    defeat();
  }

  private void killThem()
  {

      tvStoryText.setText("You decide to massacure this universe but doing so you\n" +
              "    realise that this small universe has defences for this\n" +
              "    what should we do");

      setAllBtnsVisible();
      btn1.setText("Continue");
      btn2.setText("Enslave them by playing God");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (keepGoing);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (enslaveThem);
        }
      });
    }
  private void keepGoing()
  {

      tvStoryText.setText(" After destroying an entire universe the Gods themselves\n" +
              "    couldn't let you leave with this going unseen");
    defeat();
  }

  private void left()
  {
      tvStoryText.setText("Going left you encounter a huge alien spacecraft\n" +
              "    what should we do");

      setAllBtnsVisible();
      btn1.setText("Shoot Them");
      btn2.setText("Be friendly");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (shootThem);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (beFriendly);
        }
      });
    }
  private void beFriendly()
  {
      tvStoryText.setText(" You try to be friendly to the unknown spacecraft, little did you\n" +
              "    these guys are the most wonted beings");
    defeat();
  }

  private void shootThem()
  {
      tvStoryText.setText("You get into a huge gun fight the alien spacecraft\n" +
              "    after a long hard fought battle we win what's next");

      setAllBtnsVisible();
      btn1.setText(".Steal there spaceship");
      btn2.setText("flee the area");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (stealSpaceShip);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (flee);
        }
      });
    }
  private void flee()
    {
        tvStoryText.setText("You and your team don't know what problems you\n" +
                "    might get into next so we decide to leave the\n" +
                "    scene, in doing space police catches you guys\n" +
                "    going to fast should we stop");

        setAllBtnsVisible();
        btn1.setText("Yes");
        btn2.setText("No");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            (yes);
          }
        });
        btn2.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            (no);
          }
        });
      }
    private void yes()
    {
        tvStoryText.setText(" After stopping the police ask you a few questions\n" +
                "    from where you came from they didn't believe\n" +
                "    anything you said and labeled you insane and ordered\n" +
                "    to have you locked up for life");
    defeat();
  }
  private void no()
    {
      tvStoryText.setText("You decide not to stop and get into a high speed\n" +
              "    chase with space cops and they had no choice but to\n" +
              "    shoot you down");
    defeat();
  }

  private void stealSpaceShip()
    {
      tvStoryText.setText("You and your team don't know what problems you\n" +
              "    might get into next so we decide to leave the\n" +
              "    scene, in doing space police catches you guys\n" +
              "    going to fast should we stop");

      setAllBtnsVisible();
      btn1.setText("Stay");
      btn2.setText("Run away");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (stay);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (flee);
        }
      });
    }
  private void stay()
      {
        tvStoryText.setText(" A HUGEEEEE alien spaceship comes out of a wormhole\n" +
                "    and nuke you");
        defeat();
      }
  private void exploreUnknownPlanets()
  {
      tvStoryText.setText("Landing on this unknown place, a strange  cosmic\n" +
              "    entity appears in front of you and gives you two\n" +
              "    choices");

      setAllBtnsVisible();
      btn1.setText("Play");
      btn2.setText("Dont play");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (play);
        }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (DontPlay);
        }
      });
    }
  private void play()
  {
      tvStoryText.setText(" You decided to play I will tell you 3 riddles answer\n" +
              "    correctly and i’ll give you all my knowlege of the\n" +
              "    cosmos");

      setAllBtnsVisible();
      btn1.setText("firstRiddle");
      btn2.setVisibility(View.INVISIBLE);
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          (firstRiddle);
        }
      });
      firstRiddle();
  }
  private void DontPlay()
  {
      {
          tvStoryText.setText(" You chose not to play and this cosmic being\n" +
                  "    wasnt happy about it");
          defeat();
      }
  }

  private void firstRiddle()
  {


          tvStoryText.setText(" I can be cracked, made, told, and played. I can make\n" +
                  "    some people happy while others feel betrayed.\n" +
                  "\n" +
                  "    What am I");

          setAllBtnsVisible();
          btn1.setText("A secret");
          btn2.setText("A joke");
          btn3.setText("A lie");

          btn1.setOnClickListner(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  (aSecret);
              }
          });
          btn2.setOnClickListner(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  (aJoke);
              }
          });

          btn3.setOnClickListner(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  (aLie);
              }
          });

  }

  private void aSecret()
  {
      tvStoryText.setText(" Wrong ill tell you a secret about death");
    defeat();
  }

  private void aJoke()
  {

      tvStoryText.setText("CORRECT moving on");
    secondRiddle();
  }

  private void aLie()
  {
      tvStoryText.setText("I would lie and say you were correct but you arnt\n");
    defeat();
  }

  private void secondRiddle()
  {

      tvStoryText.setText("The more you take, the more you leave behind.\n" +
              "    What am I");

      setAllBtnsVisible();
      btn1.setText("A memmory");
      btn2.setText("A road");
      btn3.setText("Footsteps");

      btn1.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (aMemmory);
          }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (aRoad);
          }
      });

      btn3.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (footSteps);
          }
      });
  }
  private void aMemmory()
  {
      tvStoryText.setText(" I'll remember you in my memory");
    defeat();
  }
  private void aRoad()
  {
      tvStoryText.setText("It’s the end of the road for you");
    defeat();
  }
  private void footSteps()
  {
      tvStoryText.setText(" CORRECT on to the final riddle");
    thirdRiddle();
  }
  private void thirdRiddle()
  {


      tvStoryText.setText(" show you a different face each time you look at me.\n" +
              "    I'm always moving, but I never leave my place.\n" +
              "\n" +
              "    What am I");

      setAllBtnsVisible();
      btn1.setText("A Clock");
      btn2.setText("A photograph");
      btn3.setText("A mirror");

      btn1.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (aClock);
          }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (aPhotograph);
          }
      });

      btn3.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (aMirror);
          }
      });
  }
  private void aClock()
  {

      tvStoryText.setText("CORRECT now heres one final question do you wish to\n" +
              "    know all my knowledge or leave this place and never\n" +
              "    return");

      setAllBtnsVisible();
      btn1.setText("Get his knowledge");
      btn2.setText("Leave and never return");
      btn3.setVisibility(View.INVISIBLE);

      btn1.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (knowledge);
          }
      });
      btn2.setOnClickListner(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              (leave);
          }
      });
  }
  private void knowledge()
  {
      tvStoryText.setText(" A cosmic being mind shouldn’t be shared with a\n" +
              "    human, you dropped dead within seconds");
    defeat();
  }
  private void leave()
  {
      tvStoryText.setText(" Congrats you survived");
    defeat();
  }

  private void aPhotograph()
  {

      tvStoryText.setText("   Here is a picture of your finale momments alive");
    defeat();

  }
  private void aMirror()
  {
      tvStoryText.setText(" I showed you a mirror and you died.");
    defeat();
  }


  private void defeat()
  {
    //run method when defeated


    //lose a life
    numLives--;

    //clear console, display text, etc
    System.out.println(TextColor.RED + "YOU DIED");


    //determine if player gets to play again
    if (numLives > 0)
    {
      //if you still have lives, return to start()
      start();
    }
    else
    {
    System.out.println("GAME OVER");
    }

  }
}