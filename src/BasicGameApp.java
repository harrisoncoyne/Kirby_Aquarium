import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BasicGameApp implements Runnable {

	final int WIDTH = 1000;
	final int HEIGHT = 700;

	public int points;

	public int qPos;
	public int wPos;

	public JFrame frame;
	public Canvas canvas;
	public JPanel panel;

	public BufferStrategy bufferStrategy;

	public Image kirbyPic;
	public Image kirbyRevPic;

	public Image middlePic;
	public Image leftPic;
	public Image rightPic;

	//public Image displayPic;

	public Image count0Pic;
	public Image count1Pic;
	public Image count2Pic;
	public Image count3Pic;
	public Image count4Pic;
	public Image count5Pic;
	public Image count6Pic;
	public Image count7Pic;
	public Image count8Pic;
	public Image count9Pic;
	public Image count10Pic;
	public Image count11Pic;
	public Image count12Pic;
	public Image count13Pic;
	public Image count14Pic;
	public Image count15Pic;
	public Image count16Pic;
	public Image count17Pic;
	public Image count18Pic;
	public Image count19Pic;
	public Image count20Pic;

	public Image squareCounterPic;


	//public Image vSquarePic;

	//public Image revAstroPic;
	//public Image astroPic;
	//public Image rastroPic;
	//public Image rastroPicEat;
	//public Image astroPicRev;

	////////////

	//public int points;

	public Image applePic;
	public Image cherryPic;
	public Image grapePic;
	public Image pearPic;
	public Image pineapplePic;
	public Image watermellonPic;


	public Kirby kirby;
	public Kirby kirbyRev;

	public Wall middle;
	public Wall left;
	public Wall right;

	public PointsCounter count0;
	public PointsCounter count1;
	public PointsCounter count2;
	public PointsCounter count3;
	public PointsCounter count4;
	public PointsCounter count5;
	public PointsCounter count6;
	public PointsCounter count7;
	public PointsCounter count8;
	public PointsCounter count9;
	public PointsCounter count10;
	public PointsCounter count11;
	public PointsCounter count12;
	public PointsCounter count13;
	public PointsCounter count14;
	public PointsCounter count15;
	public PointsCounter count16;
	public PointsCounter count17;
	public PointsCounter count18;
	public PointsCounter count19;
	public PointsCounter count20;

	public PointsCounter squareCounter;
	//public Wall vSquare;

	//public Astronaut astro;
	//public Astronaut revAstro;
	//public Rastronaut rastro;

	////////

	public Food apple;
	public Food cherry;
	public Food grape;
	public Food pear;
	public Food pineapple;
	public Food watermellon;

	public static void main(String[] args) {
		BasicGameApp ex = new BasicGameApp();
		new Thread(ex).start();
	}

	public BasicGameApp() {

		setUpGraphics();

		qPos = (int)(Math.random()*100);
		wPos = (int)(Math.random()*100);

		//variable and objects
		//create (construct) the objects needed for the game and load up

		count0Pic =Toolkit.getDefaultToolkit().getImage("1.png");
		count0 = new PointsCounter(850,50);

		count1Pic =Toolkit.getDefaultToolkit().getImage("2.png");
		count1 = new PointsCounter(850,50);

		count2Pic =Toolkit.getDefaultToolkit().getImage("3.png");
		count2 = new PointsCounter(850,50);

		count3Pic =Toolkit.getDefaultToolkit().getImage("4.png");
		count3 = new PointsCounter(850,50);

		count4Pic =Toolkit.getDefaultToolkit().getImage("5.png");
		count4 = new PointsCounter(850,50);

		count5Pic =Toolkit.getDefaultToolkit().getImage("6.png");
		count5 = new PointsCounter(850,50);

		count6Pic =Toolkit.getDefaultToolkit().getImage("7.png");
		count6 = new PointsCounter(850,50);

		count7Pic =Toolkit.getDefaultToolkit().getImage("8.png");
		count7 = new PointsCounter(850,50);

		count8Pic =Toolkit.getDefaultToolkit().getImage("9.png");
		count8 = new PointsCounter(850,50);

		count9Pic =Toolkit.getDefaultToolkit().getImage("10.png");
		count9 = new PointsCounter(850,50);

		count10Pic =Toolkit.getDefaultToolkit().getImage("11.png");
		count10 = new PointsCounter(850,50);

		count11Pic =Toolkit.getDefaultToolkit().getImage("12.png");
		count11 = new PointsCounter(850,50);

		count12Pic =Toolkit.getDefaultToolkit().getImage("13.png");
		count12 = new PointsCounter(850,50);

		count13Pic =Toolkit.getDefaultToolkit().getImage("14.png");
		count13 = new PointsCounter(850,50);

		count14Pic =Toolkit.getDefaultToolkit().getImage("15.png");
		count14 = new PointsCounter(850,50);

		count15Pic =Toolkit.getDefaultToolkit().getImage("16.png");
		count15 = new PointsCounter(850,50);

		count16Pic =Toolkit.getDefaultToolkit().getImage("17.png");
		count16 = new PointsCounter(850,50);

		count17Pic =Toolkit.getDefaultToolkit().getImage("18.png");
		count17 = new PointsCounter(850,50);

		count18Pic =Toolkit.getDefaultToolkit().getImage("19.png");
		count18 = new PointsCounter(850,50);

		count19Pic =Toolkit.getDefaultToolkit().getImage("20.png");
		count19 = new PointsCounter(850,50);

		count20Pic =Toolkit.getDefaultToolkit().getImage("21.png");
		count20 = new PointsCounter(850,50);

		squareCounterPic = Toolkit.getDefaultToolkit().getImage("square.jfif");
		squareCounter = new PointsCounter(850,50);



		middlePic = Toolkit.getDefaultToolkit().getImage("square.jfif");
		middle = new Wall(500, 0);

		leftPic = Toolkit.getDefaultToolkit().getImage("square.jfif");
		left = new Wall(0, 550);

		rightPic = Toolkit.getDefaultToolkit().getImage("square.jfif");
		right = new Wall(950, 550);
		right = new Wall(950, 550);

		//vSquarePic = Toolkit.getDefaultToolkit().getImage("square.jfif");
		//vSquare = new Wall (250, 350);


		applePic = Toolkit.getDefaultToolkit().getImage("8bit_apple.png");
		apple = new Food((int)(Math.random()*10), (int)(Math.random()*10));

		//applePic = Toolkit.getDefaultToolkit().getImage("8bit_apple.png");
		//apple = new Food(700, 1000);

		cherryPic = Toolkit.getDefaultToolkit().getImage("8bit_cherry.png");
		cherry = new Food(700, 1000);

		grapePic = Toolkit.getDefaultToolkit().getImage("8bit_grape.png");
		grape = new Food(700, 1000);

		pearPic = Toolkit.getDefaultToolkit().getImage("8bit_pear.png");
		pear = new Food(700, 1000);

		pineapplePic = Toolkit.getDefaultToolkit().getImage("8bit_pineapple.png");
		pineapple = new Food(700, 1000);

		watermellonPic = Toolkit.getDefaultToolkit().getImage("8bit_watermelon.png");
		watermellon = new Food(700, 1000);

		/////////////////////////////////////////////////////////////////////////////////////////////

		//rastroPicEat = Toolkit.getDefaultToolkit().getImage("8bit_watermelon_slice - Copy.png");
		//rastro = new Rastronaut(rastro.apos,rastro.bpos);

		kirbyPic = Toolkit.getDefaultToolkit().getImage("kirby_fly.jpg"); //load the picture
		kirby = new Kirby(qPos, wPos);

		kirbyRevPic = Toolkit.getDefaultToolkit().getImage("kirby_fly - Copy.jpg"); //load the picture
		kirbyRev = new Kirby(kirby.xpos, kirby.ypos);

		//if(astro.dx>0) {
		//astroPic = Toolkit.getDefaultToolkit().getImage("kirby_fly.jpg"); //load the picture
		//astro = new Astronaut(10, 100);
		//}

		//if(astro.dx<0) {
		//astroPicRev = Toolkit.getDefaultToolkit().getImage("kirby_fly-Copy.jpg"); //load the picture
		//astro = new Astronaut(astro.xpos, astro.ypos);
		//}
	}

	//}// BasicGameApp()
	public void collision() {
		//System.out.println("crash");

		//points = 0;

		if (middle.topRec.intersects(kirby.rec)){
			kirby.dy = 10;
		}

		if (middle.bottomRec.intersects(kirby.rec)){
			kirby.dy = -10;
		}

		if (middle.rec.intersects(kirby.rec)) {

			if (middle.rec.intersects(kirby.rec)) {
				if (middle.db == -middle.db) {
					kirby.dy = middle.db + 1;
					//kirby.move();

					//kirby.dx = kirby.dx;
					//if (kirby.ypos > 500 || kirby.ypos < 550) {
						//kirby.dx = -kirby.dx;

					//}
				}

				if (middle.db == middle.db) {
					kirby.dy = middle.db + 1;
					//kirby.move();

					//kirby.dx = kirby.dx;
					//if (kirby.ypos > 500 || kirby.ypos < 550) {
						//kirby.dx = -kirby.dx;
					}
				}

				if (kirby.dx < 0) {
					kirby.dx = -kirby.dx;
					kirby.move();
					//apple.apos = 0;
				} else if (kirby.dx > 0) {
					kirby.dx = -kirby.dx;
					kirby.move();
				}

				if (kirby.dy < 0) {
					kirby.dy = kirby.dy;
					//apple.apos = 0;
				} else if (kirby.dy > 0) {
					kirby.dy = kirby.dy;
				}
			}

			if (middle.rec.intersects(apple.rec)) {
				if (apple.da < 0) {
					apple.da = -apple.da;
					//apple.apos = 0;
				} else if (apple.da > 0) {
					apple.da = -apple.da;
				}

				if (apple.db < 0) {
					apple.db = -apple.db;
					//apple.apos = 0;
				} else if (apple.db > 0) {
					apple.db = -apple.db;
				}
			}

			if (middle.rec.intersects(cherry.rec)) {
				if (cherry.da < 0) {
					cherry.da = -cherry.da;
					//cherry.apos = 0;
				} else if (cherry.da > 0) {
					cherry.da = -cherry.da;
				}

				if (cherry.db < 0) {
					cherry.db = -cherry.db;
					//cherry.apos = 0;
				} else if (cherry.db > 0) {
					cherry.db = -cherry.db;
				}
			}

			if (middle.rec.intersects(grape.rec)) {
				if (grape.da < 0) {
					grape.da = -grape.da;
					//grape.apos = 0;
				} else if (grape.da > 0) {
					grape.da = -grape.da;
				}

				if (grape.db < 0) {
					grape.db = -grape.db;
					//grape.apos = 0;
				} else if (grape.db > 0) {
					grape.db = -grape.db;
				}
			}

			if (middle.rec.intersects(pear.rec)) {
				if (pear.da < 0) {
					pear.da = -pear.da;
					//pear.apos = 0;
				} else if (pear.da > 0) {
					pear.da = -pear.da;
				}

				if (pear.db < 0) {
					pear.db = -pear.db;
					//pear.apos = 0;
				} else if (pear.db > 0) {
					pear.db = -pear.db;
				}
			}

			if (middle.rec.intersects(pineapple.rec)) {
				if (pineapple.da < 0) {
					pineapple.da = -pineapple.da;
					//pineapple.apos = 0;
				} else if (pineapple.da > 0) {
					pineapple.da = -pineapple.da;
				}

				if (pineapple.db < 0) {
					pineapple.db = -pineapple.db;
					//pineapple.apos = 0;
				} else if (pineapple.db > 0) {
					pineapple.db = -pineapple.db;
				}
			}

			if (middle.rec.intersects(watermellon.rec)) {
				if (watermellon.da < 0) {
					watermellon.da = -watermellon.da;
					///watermellon.apos = 0;
				} else if (watermellon.da > 0) {
					watermellon.da = -watermellon.da;
				}

				if (watermellon.db < 0) {
					watermellon.db = -watermellon.db;
					///watermellon.apos = 0;
				} else if (watermellon.db > 0) {
					watermellon.db = -watermellon.db;
				}
			}

			/////////

		if (left.topRec.intersects(kirby.rec)){
			kirby.dy = 10;
		}

		if (left.bottomRec.intersects(kirby.rec)){
			kirby.dy = -10;
		}

			if (left.rec.intersects(kirby.rec)) {

				if (left.rec.intersects(kirby.rec)) {
					if (left.db == -left.db) {
						kirby.dy = left.db +1;
						//kirby.dx = kirby.dx;
						//if (kirby.ypos > 0 || kirby.ypos < 50) {
							//kirby.dx = -kirby.dx;
						//}
					}

						if (left.db == left.db) {
							kirby.dy = left.db+1;
							//kirby.dx = kirby.dx;
							//if (kirby.ypos > 0 || kirby.ypos < 50) {
								//kirby.dx = -kirby.dx;
							}

				}

						if (kirby.dx < 0) {
							kirby.dx = -kirby.dx;
							kirby.move();
							//apple.apos = 0;
						} else if (kirby.dx > 0) {
							kirby.dx = -kirby.dx;
							kirby.move();
						}

						if (kirby.dy < 0) {
							kirby.dy = kirby.dy;
							//apple.apos = 0;
						} else if (kirby.dy > 0) {
							kirby.dy = kirby.dy;
						}
					}

					if (left.rec.intersects(apple.rec)) {
						if (apple.da < 0) {
							apple.da = -apple.da;
							//apple.apos = 0;
						} else if (apple.da > 0) {
							apple.da = -apple.da;
						}

						if (apple.db < 0) {
							apple.db = -apple.db;
							//apple.apos = 0;
						} else if (apple.db > 0) {
							apple.db = -apple.db;
						}
					}

					if (left.rec.intersects(cherry.rec)) {
						if (cherry.da < 0) {
							cherry.da = -cherry.da;
							//cherry.apos = 0;
						} else if (cherry.da > 0) {
							cherry.da = -cherry.da;
						}

						if (cherry.db < 0) {
							cherry.db = -cherry.db;
							//cherry.apos = 0;
						} else if (cherry.db > 0) {
							cherry.db = -cherry.db;
						}
					}

					if (left.rec.intersects(grape.rec)) {
						if (grape.da < 0) {
							grape.da = -grape.da;
							//grape.apos = 0;
						} else if (grape.da > 0) {
							grape.da = -grape.da;
						}

						if (grape.db < 0) {
							grape.db = -grape.db;
							//grape.apos = 0;
						} else if (grape.db > 0) {
							grape.db = -grape.db;
						}
					}

					if (left.rec.intersects(pear.rec)) {
						if (pear.da < 0) {
							pear.da = -pear.da;
							//pear.apos = 0;
						} else if (pear.da > 0) {
							pear.da = -pear.da;
						}

						if (pear.db < 0) {
							pear.db = -pear.db;
							//pear.apos = 0;
						} else if (pear.db > 0) {
							pear.db = -pear.db;
						}
					}

					if (left.rec.intersects(pineapple.rec)) {
						if (pineapple.da < 0) {
							pineapple.da = -pineapple.da;
							//pineapple.apos = 0;
						} else if (pineapple.da > 0) {
							pineapple.da = -pineapple.da;
						}

						if (pineapple.db < 0) {
							pineapple.db = -pineapple.db;
							//pineapple.apos = 0;
						} else if (pineapple.db > 0) {
							pineapple.db = -pineapple.db;
						}
					}

					if (left.rec.intersects(watermellon.rec)) {
						if (watermellon.da < 0) {
							watermellon.da = -watermellon.da;
							///watermellon.apos = 0;
						} else if (watermellon.da > 0) {
							watermellon.da = -watermellon.da;
						}

						if (watermellon.db < 0) {
							watermellon.db = -watermellon.db;
							///watermellon.apos = 0;
						} else if (watermellon.db > 0) {
							watermellon.db = -watermellon.db;
						}
					}

					/////

					if (right.topRec.intersects(kirby.rec)){
						kirby.dy = 10;
					}

					if (right.bottomRec.intersects(kirby.rec)){
						kirby.dy = -10;
					}

					if (right.rec.intersects(kirby.rec)) {

						if (right.rec.intersects(kirby.rec)) {
							if (right.db == -right.db) {
								kirby.dy = right.db+1;
								//kirby.dx = kirby.dx;
								//if (kirby.ypos > 950 || kirby.ypos < 1000) {
									//kirby.dx = -kirby.dx;
								//}
							}

								if (right.db == right.db) {
									kirby.dy = right.db+1;
									//kirby.dx = kirby.dx;
									//if (kirby.ypos > 950 || kirby.ypos < 1000) {
										//kirby.dx = -kirby.dx;
									}
						}

								if (kirby.dx < 0) {
									kirby.dx = -kirby.dx;
									kirby.move();
									//apple.apos = 0;
								} else if (kirby.dx > 0) {
									kirby.dx = -kirby.dx;
									kirby.move();
								}

								if (kirby.dy < 0) {
									kirby.dy = kirby.dy;
									//apple.apos = 0;
								} else if (kirby.dy > 0) {
									kirby.dy = kirby.dy;
								}
							}

							if (right.rec.intersects(apple.rec)) {
								if (apple.da < 0) {
									apple.da = -apple.da;
									//apple.apos = 0;
								} else if (apple.da > 0) {
									apple.da = -apple.da;
								}

								if (apple.db < 0) {
									apple.db = -apple.db;
									//apple.apos = 0;
								} else if (apple.db > 0) {
									apple.db = -apple.db;
								}
							}

							if (right.rec.intersects(cherry.rec)) {
								if (cherry.da < 0) {
									cherry.da = -cherry.da;
									//cherry.apos = 0;
								} else if (cherry.da > 0) {
									cherry.da = -cherry.da;
								}

								if (cherry.db < 0) {
									cherry.db = -cherry.db;
									//cherry.apos = 0;
								} else if (cherry.db > 0) {
									cherry.db = -cherry.db;
								}
							}

							if (right.rec.intersects(grape.rec)) {
								if (grape.da < 0) {
									grape.da = -grape.da;
									//grape.apos = 0;
								} else if (grape.da > 0) {
									grape.da = -grape.da;
								}

								if (grape.db < 0) {
									grape.db = -grape.db;
									//grape.apos = 0;
								} else if (grape.db > 0) {
									grape.db = -grape.db;
								}
							}

							if (right.rec.intersects(pear.rec)) {
								if (pear.da < 0) {
									pear.da = -pear.da;
									//pear.apos = 0;
								} else if (pear.da > 0) {
									pear.da = -pear.da;
								}

								if (pear.db < 0) {
									pear.db = -pear.db;
									//pear.apos = 0;
								} else if (pear.db > 0) {
									pear.db = -pear.db;
								}
							}

							if (right.rec.intersects(pineapple.rec)) {
								if (pineapple.da < 0) {
									pineapple.da = -pineapple.da;
									//pineapple.apos = 0;
								} else if (pineapple.da > 0) {
									pineapple.da = -pineapple.da;
								}

								if (pineapple.db < 0) {
									pineapple.db = -pineapple.db;
									//pineapple.apos = 0;
								} else if (pineapple.db > 0) {
									pineapple.db = -pineapple.db;
								}
							}

							if (right.rec.intersects(watermellon.rec)) {
								if (watermellon.da < 0) {
									watermellon.da = -watermellon.da;
									///watermellon.apos = 0;
								} else if (watermellon.da > 0) {
									watermellon.da = -watermellon.da;
								}

								if (watermellon.db < 0) {
									watermellon.db = -watermellon.db;
									///watermellon.apos = 0;
								} else if (watermellon.db > 0) {
									watermellon.db = -watermellon.db;
								}
							}


							//FOOD INTERSECTING KIRBY//

							if (apple.rec.intersects(kirby.rec)) {
								System.out.println("noom");
								//apple.isAlive = false;
								kirby.width = kirby.width + 1;
								kirby.height = kirby.height + 1;

								apple.width = apple.width - 30;
								apple.height = apple.height - 30;

								points = points + 1;

								if (apple.width == 20 || apple.height == 20) {
									apple.isAlive = false;
									apple.rec.x = 0;
									apple.rec.y = 0;
									apple.rec.height = 0;
									apple.rec.width = 0;
								}
							}

							if (cherry.rec.intersects(kirby.rec)) {
								System.out.println("noom");
								//apple.isAlive = false;
								kirby.width = kirby.width + 1;
								kirby.height = kirby.height + 1;

								cherry.width = cherry.width - 30;
								cherry.height = cherry.height - 30;

								points = points + 1;

								if (cherry.width == 20 || cherry.height == 20) {
									cherry.isAlive = false;
									cherry.rec.x = 0;
									cherry.rec.y = 0;
									cherry.rec.height = 0;
									cherry.rec.width = 0;
								}
							}

							if (grape.rec.intersects(kirby.rec)) {
								System.out.println("noom");
								//apple.isAlive = false;
								kirby.width = kirby.width + 1;
								kirby.height = kirby.height + 1;

								grape.width = grape.width - 30;
								grape.height = grape.height - 30;

								points = points + 1;

								if (grape.width == 20 || grape.height == 20) {
									grape.isAlive = false;
									grape.rec.x = 0;
									grape.rec.y = 0;
									grape.rec.height = 0;
									grape.rec.width = 0;
								}
							}

							if (pear.rec.intersects(kirby.rec)) {
								System.out.println("noom");
								//apple.isAlive = false;
								kirby.width = kirby.width + 1;
								kirby.height = kirby.height + 1;

								pear.width = pear.width - 30;
								pear.height = pear.height - 30;

								points = points + 1;

								if (pear.width == 20 || pear.height == 20) {
									pear.isAlive = false;
									pear.rec.x = 0;
									pear.rec.y = 0;
									pear.rec.height = 0;
									pear.rec.width = 0;
								}
							}

							if (pineapple.rec.intersects(kirby.rec)) {
								System.out.println("noom");
								//apple.isAlive = false;
								kirby.width = kirby.width + 1;
								kirby.height = kirby.height + 1;

								pineapple.width = pineapple.width - 30;
								pineapple.height = pineapple.height - 30;

								points = points + 1;

								if (pineapple.width == 20 || pineapple.height == 20) {
									pineapple.isAlive = false;
									pineapple.rec.x = 0;
									pineapple.rec.y = 0;
									pineapple.rec.height = 0;
									pineapple.rec.width = 0;
								}
							}

							if (watermellon.rec.intersects(kirby.rec)) {
								System.out.println("noom");
								//watermellon.isAlive = false;
								kirby.width = kirby.width + 1;
								kirby.height = kirby.height + 1;

								watermellon.width = watermellon.width - 30;
								watermellon.height = watermellon.height - 30;

								points = points + 1;

								if (watermellon.width == 20 || watermellon.height == 20) {
									watermellon.isAlive = false;
									watermellon.rec.x = 0;
									watermellon.rec.y = 0;
									watermellon.rec.height = 0;
									watermellon.rec.width = 0;
								}
							}

							//Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
							//g.clearRect(0, 0, WIDTH, HEIGHT);

							//if(astro.bite==1) {
							//g.drawImage(rastroPicEat, rastro.apos, rastro.bpos, rastro.width, rastro.height, null);
							//}

							//if(astro.bite==0) {
							//astro.isAlive = false;
							//}




		//for (int x = 0; x < 10; x++) {
		//	for (int i = 0; i < 10; i++) {
		//		if (apple[x].rec.intersects(food[i].rec) && asteroids[x].isAlive && asteroids[i].isAlive && i != x) {
		//			//asteroids[i].isAlive = false;
		//			//playSound("bang.wav");
		//			//System.out.println("asteroids[" + i + "] hit");
		//			asteroids[x].dx = -asteroids[x].dx;
		//			asteroids[x].dy = -asteroids[x].dy;
		//		}
//
//			}
//		}

						}

//*******************************************************************************
						public void run () {

							while (true) {

								moveThings();
								collision();
								render();
								pause(20);
							}

						}


						public void moveThings ()
						{

							middle.move();
							left.move();
							right.move();

							kirby.move();

							apple.move();
							cherry.move();
							grape.move();
							pear.move();
							pineapple.move();
							watermellon.move();


						}

						public void pause ( int time ){
							//sleep
							try {
								Thread.sleep(time);
							} catch (InterruptedException e) {

							}
						}

	public void count() {
		//int points;
		//points = 0;

	}


						private void setUpGraphics () {
							frame = new JFrame("Application Template");

							panel = (JPanel) frame.getContentPane();
							panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
							panel.setLayout(null);

							canvas = new Canvas();
							canvas.setBounds(0, 0, WIDTH, HEIGHT);
							canvas.setIgnoreRepaint(true);

							panel.add(canvas);

							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							frame.pack();
							frame.setResizable(false);
							frame.setVisible(true);


							canvas.createBufferStrategy(2);
							bufferStrategy = canvas.getBufferStrategy();
							canvas.requestFocus();
							System.out.println("DONE graphic setup");

						}


						private void render () {
							Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
							g.clearRect(0, 0, WIDTH, HEIGHT);

							g.drawImage(middlePic, middle.apos, middle.bpos, middle.width, middle.height, null);
							g.drawImage(leftPic, left.apos, left.bpos, left.width, left.height, null);
							g.drawImage(rightPic, right.apos, right.bpos, right.width, right.height, null);

							//g.drawImage(displayPic, display.xpos, display.ypos, display.width, display.height, null);

							//g.drawImage(vSquarePic, square.apos, square.bpos, square.width, square.height, null);


							if (kirby.dx > 0) {
								g.drawImage(middlePic, kirby.xpos, kirby.ypos, kirby.width, kirby.height, null);
							}

							if (kirby.dx < 0) {
								g.drawImage(middlePic, kirby.xpos, kirby.ypos, kirby.width, kirby.height, null);
							}

							if (apple.isAlive == true) {
								g.drawImage(applePic, apple.getApos(), apple.bpos, apple.width, apple.height, null);
							}

							if (cherry.isAlive == true) {
								g.drawImage(cherryPic, cherry.getApos(), cherry.bpos, cherry.width, cherry.height, null);
							}

							if (grape.isAlive == true) {
								g.drawImage(grapePic, grape.getApos(), grape.bpos, grape.width, grape.height, null);
							}

							if (pear.isAlive == true) {
								g.drawImage(pearPic, pear.getApos(), pear.bpos, pear.width, pear.height, null);
							}

							if (pineapple.isAlive == true) {
								g.drawImage(pineapplePic, pineapple.getApos(), pineapple.bpos, pineapple.width, pineapple.height, null);
							}

							if (watermellon.isAlive == true) {
								g.drawImage(watermellonPic, watermellon.getApos(), watermellon.bpos, watermellon.width, watermellon.height, null);
							}



							//g.drawImage(count0Pic,count0.xpos, count0.ypos, count0.width, count0.height, null);


							//g.drawImage(squareCounterPic,squareCounter.xpos, squareCounter.ypos, squareCounter.width, squareCounter.height, null);
							if (points == 0){
								g.drawImage(count0Pic,count0.xpos, count0.ypos, count0.width, count0.height, null);
							}
							if (points == 1){
								g.drawImage(count1Pic,count1.xpos, count1.ypos, count1.width, count1.height, null);
							}
							if (points == 2){
								g.drawImage(count2Pic,count2.xpos, count2.ypos, count2.width, count2.height, null);
							}
							if (points == 3){
								g.drawImage(count3Pic,count3.xpos, count3.ypos, count3.width, count3.height, null);
							}
							if (points == 4){
								g.drawImage(count4Pic,count4.xpos, count4.ypos, count4.width, count4.height, null);
							}
							if (points == 5){
								g.drawImage(count5Pic,count5.xpos, count5.ypos, count5.width, count5.height, null);
							}
							if (points == 6){
								g.drawImage(count6Pic,count6.xpos, count6.ypos, count6.width, count6.height, null);
							}
							if (points == 7){
								g.drawImage(count7Pic,count7.xpos, count7.ypos, count7.width, count7.height, null);
							}
							if (points == 8){
								g.drawImage(count8Pic,count8.xpos, count8.ypos, count8.width, count8.height, null);
							}
							if (points == 9){
								g.drawImage(count9Pic,count9.xpos, count9.ypos, count9.width, count9.height, null);
							}
							if (points == 10){
								g.drawImage(count10Pic,count10.xpos, count10.ypos, count10.width, count10.height, null);
							}
							if (points == 11){
								g.drawImage(count11Pic,count11.xpos, count11.ypos, count11.width, count11.height, null);
							}
							if (points == 12){
								g.drawImage(count12Pic,count12.xpos, count12.ypos, count12.width, count12.height, null);
							}
							if (points == 13){
								g.drawImage(count13Pic,count13.xpos, count13.ypos, count13.width, count13.height, null);
							}
							if (points == 14){
								g.drawImage(count14Pic,count14.xpos, count14.ypos, count14.width, count14.height, null);
							}
							if (points == 15){
								g.drawImage(count15Pic,count15.xpos, count15.ypos, count15.width, count15.height, null);
							}
							if (points == 16){
								g.drawImage(count16Pic,count16.xpos, count16.ypos, count16.width, count16.height, null);
							}
							if (points == 17){
								g.drawImage(count17Pic,count17.xpos, count17.ypos, count17.width, count17.height, null);
							}
							if (points == 18){
								g.drawImage(count18Pic,count18.xpos, count18.ypos, count18.width, count18.height, null);
							}
							if (points == 19){
								g.drawImage(count19Pic,count19.xpos, count19.ypos, count19.width, count19.height, null);
							}
							if (points == 20){
								g.drawImage(count20Pic,count20.xpos, count20.ypos, count20.width, count20.height, null);
							}





							//if(watermellon.isAlive==false) {

							//g.drawImage(rastroPic, rastro.apos, rastro.bpos, rastro.width, rastro.height, null);
							//}


//if(rastro.isAlive==true){
//g.fillOval(rastro.apos,rastro.bpos,rastro.width,astro.height);
//}g.dispose();

							bufferStrategy.show();
						}
					}
