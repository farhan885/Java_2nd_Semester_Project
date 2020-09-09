import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

   class Gui extends Thread {
	   String s;
	   JFrame frame1;
	   JLabel label,label1,label3,label4,label5,label6,label7,label8;
       JLabel label9,label10,label11,label12,label13;

     Gui(){
		 frame1 = new JFrame("It's GUI");                    // frame 1
		 frame1.setVisible(true);
		 frame1.setSize(1100,600);
         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame1.setLocationRelativeTo(null);
		 label1 = new JLabel("WELCOME TO OUR SYSTEM !");
		 label = new JLabel("PLEASE CLICK 'NEXT' TO STEP FORWARD.");
	label1.setBounds(320,70,850,40);
	label.setBounds(320,140,800,40);
	label1.setFont(new Font("Arial",Font.ITALIC,30));
	label.setFont(new Font("Garamond",Font.BOLD,20));
	JButton  b1 = new JButton("NEXT");
	b1.setBounds(470,200,100,30);
	ImageIcon icon =new ImageIcon("pic2.png");
	            JButton b=new JButton(icon);
	            b.setBounds(0,0,1100,600);
	b.setLayout(null);
	b.add(b1);
    b.add(label1);
    b.add(label);
	frame1.add(b);
	                                                           // End of frame 1

	JFrame frame2 = new JFrame("It's GUI");                   // frame 2 starts here
			 frame2.setSize(700,600);
	         frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame2.setLocationRelativeTo(null);
	b1.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent e){
		   frame2.setVisible(true);
		   frame1.setVisible(false);}
	  });

	 JLabel label2 = new JLabel("Select Country to see its Current Date and Time",JLabel.CENTER);
	 label2.setBounds(-30,60,750,40);
		label2.setFont(new Font("Arial",Font.ITALIC,23));
	JButton	 b2=new JButton("Pakistan");
	b2.setBounds(50,130,90,20);
	JButton	 b3=new JButton("India");
	b3.setBounds(50,170,90,20);
	JButton	 b4=new JButton("China");
	b4.setBounds(50,210,90,20);
	JButton	 b5=new JButton("Russia");
	b5.setBounds(50,250,90,20);
	JButton  b6=new JButton("Turkey");
	b6.setBounds(50,290,90,20);
	JButton  b7=new JButton("Iran");
	b7.setBounds(50,330,90,20);
	JButton  b8=new JButton("France");
	b8.setBounds(50,370,90,20);
	JButton  b9=new JButton("Germany");
	b9.setBounds(50,410,90,20);
	JButton  b10=new JButton("America");
	b10.setBounds(160,130,90,20);
	JButton  b11=new JButton("Australia");
	b11.setBounds(160,170,90,20);
	JButton  b12=new JButton("South Africa");
	b12.setBounds(160,210,110,20);

	ImageIcon icon2 =new ImageIcon("p.png");
		            JButton bb=new JButton(icon2);
	            bb.setBounds(0,0,1100,700);
	 bb.setLayout(null);
	 bb.add(label2); bb.add(b2); bb.add(b3); bb.add(b4); bb.add(b5); bb.add(b6);
	 bb.add(b7); bb.add(b8);  bb.add(b9); bb.add(b10); bb.add(b11); bb.add(b12);
	    frame2.add(bb);                                       // End of frame 2

	              JFrame frame3 = new JFrame("It's GUI");          // frame 3
				  	frame3.setSize(700,600);                       // Pakistan time
				  	frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				  	frame3.setLocationRelativeTo(null);
				  	b2.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent e){
							frame3.setVisible(true);
							frame2.setVisible(false);
						}
					});
	  label3 = new JLabel("ERROR 404");
				label3.setBounds(85,90,700,150);
	           label3.setFont(new Font("Arial",Font.ITALIC,32));
	         JButton  b13 = new JButton("<BACK");
	         b13.setBounds(100,400,90,20);
			   ImageIcon icon3 =new ImageIcon("pic4.png");
			   JButton bb1=new JButton(icon3);
	            bb1.setBounds(0,0,900,700);
	            bb1.setLayout(null);
	            bb1.add(label3);
	            bb1.add(b13);
	          frame3.add(bb1);

	          b13.addActionListener(new ActionListener(){
			  						public void actionPerformed(ActionEvent e){
			  							frame3.setVisible(false);
			  							frame2.setVisible(true);
			  						}
					});                                           // End of frame 3

		JFrame frame4 = new JFrame("It's GUI");                    // frame 4
		  frame4.setSize(700,600);                                // India time
	      frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame4.setLocationRelativeTo(null);
			b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame4.setVisible(true);
			    frame2.setVisible(false);
			}
			});
				label4 = new JLabel("ERROR 404");
				label4.setBounds(85,90,700,150);
			    label4.setFont(new Font("Arial",Font.ITALIC,30));
			JButton  b14 = new JButton("<BACK");
			b14.setBounds(100,400,90,20);
	      ImageIcon icon4 =new ImageIcon("pic4.png");
		  			   JButton bb2=new JButton(icon4);
		  	            bb2.setBounds(0,0,900,700);
		  	            bb2.setLayout(null);
		  	            bb2.add(label4);
		  	            bb2.add(b14);
	          frame4.add(bb2);

			 b14.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					frame4.setVisible(false);
					frame2.setVisible(true);
				}
				});                                              //End of frame 4

			JFrame frame5 = new JFrame("It's GUI");              // frame 5
			 	frame5.setSize(700,600);                          // China time
			 	frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame5.setLocationRelativeTo(null);
			 b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				frame5.setVisible(true);
				frame2.setVisible(false);
				}  });
			label5 = new JLabel("ERROR 404");
			label5.setBounds(90,100,700,150);
         label5.setFont(new Font("Arial",Font.ITALIC,30));
	       JButton  b15 = new JButton("<BACK");
	       b15.setBounds(100,400,90,20);
		   ImageIcon icon5 =new ImageIcon("pic4.png");
		   		  			   JButton bb3=new JButton(icon5);
		   		  	            bb3.setBounds(0,0,900,700);
		   		  	            bb3.setLayout(null);
		   		  	            bb3.add(label5);
		   		  	            bb3.add(b15);
	          frame5.add(bb3);

			b15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
          		frame5.setVisible(false);
				frame2.setVisible(true);
		}				});                                        // End of frame 5

		JFrame frame6 = new JFrame("It's GUI");                    // frame 6
					 	frame6.setSize(700,600);                   // Russia time
					 	frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame6.setLocationRelativeTo(null);
					 b5.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						frame6.setVisible(true);
						frame2.setVisible(false);
						}  });
					label6 = new JLabel("ERROR 404");
					label6.setBounds(90,100,700,150);
		         label6.setFont(new Font("Arial",Font.ITALIC,30));
			       JButton  b16 = new JButton("<BACK");
			       b16.setBounds(100,400,90,20);
				   ImageIcon icon6 =new ImageIcon("pic4.png");
				   		  			   JButton bb4=new JButton(icon6);
				   		  	            bb4.setBounds(0,0,900,700);
				   		  	            bb4.setLayout(null);
				   		  	            bb4.add(label6);
				   		  	            bb4.add(b16);
	                               frame6.add(bb4);
					b16.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
		          		frame6.setVisible(false);
						frame2.setVisible(true);
				}				});                                   // End of frame 6

         JFrame frame7 = new JFrame("It's GUI");                      // frame 7
					 	frame7.setSize(700,600);                      // Turkey time
					 	frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame7.setLocationRelativeTo(null);
					 b6.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						frame7.setVisible(true);
						frame2.setVisible(false);
						}  });
					label7 = new JLabel("ERROR 404");
					label7.setBounds(90,100,700,150);
		         label7.setFont(new Font("Arial",Font.ITALIC,30));
			       JButton  b17 = new JButton("<BACK");
			       b17.setBounds(100,400,90,20);
				   ImageIcon icon7 =new ImageIcon("pic4.png");
				   				   		  			   JButton bb5=new JButton(icon7);
				   				   		  	            bb5.setBounds(0,0,900,700);
				   				   		  	            bb5.setLayout(null);
				   				   		  	            bb5.add(label7);
				   				   		  	            bb5.add(b17);
	                               frame7.add(bb5);
					b17.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
		          		frame7.setVisible(false);
						frame2.setVisible(true);
				}				});                              // End of frame 7

           JFrame frame8 = new JFrame("It's GUI");               // frame 8
					 	frame8.setSize(700,600);                 // Iran time
					 	frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame8.setLocationRelativeTo(null);
					 b7.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						frame8.setVisible(true);
						frame2.setVisible(false);
						}  });
					label8 = new JLabel("ERROR 404");
					label8.setBounds(90,100,700,150);
		         label8.setFont(new Font("Arial",Font.ITALIC,30));
			       JButton  b18 = new JButton("<BACK");
			       b18.setBounds(100,400,90,20);
				   ImageIcon icon8 =new ImageIcon("pic4.png");
				   				   		  			   JButton bb6=new JButton(icon8);
				   				   		  	            bb6.setBounds(0,0,900,700);
				   				   		  	            bb6.setLayout(null);
				   				   		  	            bb6.add(label8);
				   				   		  	            bb6.add(b18);
	                               frame8.add(bb6);
					b18.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
		          		frame8.setVisible(false);
						frame2.setVisible(true);
				}				});                              // End of frame 8

                JFrame frame9 = new JFrame("It's GUI");           // frame 9
					 	frame9.setSize(700,600);                   // France time
					 	frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame9.setLocationRelativeTo(null);
					 b8.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						frame9.setVisible(true);
						frame2.setVisible(false);
						}  });
					label9 = new JLabel("ERROR 404");
					label9.setBounds(90,100,700,150);
		         label9.setFont(new Font("Arial",Font.ITALIC,30));
			       JButton  b19 = new JButton("<BACK");
			       b19.setBounds(100,400,90,20);
				   ImageIcon icon9 =new ImageIcon("pic4.png");
				   				   		  			   JButton bb7=new JButton(icon9);
				   				   		  	            bb7.setBounds(0,0,900,700);
				   				   		  	            bb7.setLayout(null);
				   				   		  	            bb7.add(label9);
				   				   		  	            bb7.add(b19);
	                               frame9.add(bb7);
					b19.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
		          		frame9.setVisible(false);
						frame2.setVisible(true);
				}				});                                 // End of frame 9

              JFrame frame10 = new JFrame("It's GUI");              // frame 10
					 	frame10.setSize(700,600);                   // Germany time
					 	frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame10.setLocationRelativeTo(null);
					 b9.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						frame10.setVisible(true);
						frame2.setVisible(false);
						}  });
					label10 = new JLabel("ERROR 404");
					label10.setBounds(90,100,700,150);
		         label10.setFont(new Font("Arial",Font.ITALIC,30));
			       JButton  b20 = new JButton("<BACK");
			       b20.setBounds(100,400,90,20);
				   ImageIcon icon10 =new ImageIcon("pic4.png");
				   				   		  			   JButton bb8=new JButton(icon10);
				   				   		  	            bb8.setBounds(0,0,900,700);
				   				   		  	            bb8.setLayout(null);
				   				   		  	            bb8.add(label10);
				   				   		  	            bb8.add(b20);
	                               frame10.add(bb8);
					b20.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
		          		frame10.setVisible(false);
						frame2.setVisible(true);
				}				});                                  // End of frame 10

                JFrame frame11 = new JFrame("It's GUI");             // frame 11
					 	frame11.setSize(700,600);                    // America time
					 	frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame11.setLocationRelativeTo(null);
					 b10.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						frame11.setVisible(true);
						frame2.setVisible(false);
						}  });
					label11 = new JLabel("ERROR 404");
					label11.setBounds(90,100,700,150);
		         label11.setFont(new Font("Arial",Font.ITALIC,30));
			       JButton  b21 = new JButton("<BACK");
			       b21.setBounds(100,400,90,20);
				   ImageIcon icon11 =new ImageIcon("pic4.png");
				   				   		  			   JButton bb9=new JButton(icon11);
				   				   		  	            bb9.setBounds(0,0,900,700);
				   				   		  	            bb9.setLayout(null);
				   				   		  	            bb9.add(label11);
				   				   		  	            bb9.add(b21);
	                               frame11.add(bb9);
					b21.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
		          		frame11.setVisible(false);
						frame2.setVisible(true);
				}				});                                // End of frame 11

				JFrame frame12 = new JFrame("It's GUI");             // frame 12
									 	frame12.setSize(700,600);                    // Australia time
									 	frame12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										frame12.setLocationRelativeTo(null);
									 b11.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent e){
										frame12.setVisible(true);
										frame2.setVisible(false);
										}  });
									label12 = new JLabel("ERROR 404");
									label12.setBounds(90,100,700,150);
						         label12.setFont(new Font("Arial",Font.ITALIC,30));
							       JButton  b22 = new JButton("<BACK");
							       b22.setBounds(100,400,90,20);
        ImageIcon icon12 =new ImageIcon("pic4.png");
  			   JButton bb10=new JButton(icon12);
  	            bb10.setBounds(0,0,900,700);
  	            bb10.setLayout(null);
  	            bb10.add(label12);
				bb10.add(b22);
				frame12.add(bb10);
									b22.addActionListener(new ActionListener(){
									public void actionPerformed(ActionEvent e){
						          		frame12.setVisible(false);
										frame2.setVisible(true);
								}				});                              // End of frame 12

                 JFrame frame13 = new JFrame("It's GUI");             // frame 13
 				 	frame13.setSize(700,600);                // South_Africa time
 			 	frame13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 				frame13.setLocationRelativeTo(null);
			 b12.addActionListener(new ActionListener(){
 				public void actionPerformed(ActionEvent e){
 					frame13.setVisible(true);
 					frame2.setVisible(false);
			}  });
 					label13 = new JLabel("ERROR 404");
 					label13.setBounds(90,100,700,150);
 	    	        label13.setFont(new Font("Arial",Font.ITALIC,30));
 		       JButton  b23 = new JButton("<BACK");
 		       b23.setBounds(100,400,90,20);
 			   ImageIcon icon13 =new ImageIcon("pic4.png");
			     			   JButton bb11=new JButton(icon13);
			     	            bb11.setBounds(0,0,900,700);
			     	            bb11.setLayout(null);
			     	            bb11.add(label13);
			   				bb11.add(b23);
				frame13.add(bb11);
 			b23.addActionListener(new ActionListener(){
 			public void actionPerformed(ActionEvent e){
 	          		frame13.setVisible(false);
 					frame2.setVisible(true);
 			}				});                                // End of frame 13


}
public void runMyTime()
{
	while(true){
	 // LocalDateTime d= LocalDateTime.now();
	 ZonedDateTime zone1=ZonedDateTime.now(ZoneId.of("Asia/Karachi"));
	 ZonedDateTime zone2=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
	 ZonedDateTime zone3=ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
	  ZonedDateTime zone4=ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
	  ZonedDateTime zone5=ZonedDateTime.now(ZoneId.of("Turkey"));
      ZonedDateTime zone6=ZonedDateTime.now(ZoneId.of("Asia/Tehran"));
	  ZonedDateTime zone7=ZonedDateTime.now(ZoneId.of("Europe/Paris"));
	  ZonedDateTime zone8=ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
	  ZonedDateTime zone9=ZonedDateTime.now(ZoneId.of("America/Toronto"));
	  ZonedDateTime zone10=ZonedDateTime.now(ZoneId.of("Australia/Canberra"));
	  ZonedDateTime zone11=ZonedDateTime.now(ZoneId.of("Africa/Johannesburg"));
            //d=new Date();
		 //f1 =new SimpleDateFormat("dd-MM-yyyy,  E,  hh:mm:ss");
			 // s=f1.format(d).toString();
			 //String myNew="";
// myNew=zone1.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss"));
 label3.setText(zone1.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label4.setText(zone2.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label5.setText(zone3.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label6.setText(zone4.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label7.setText(zone5.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label8.setText(zone6.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label9.setText(zone7.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label10.setText(zone8.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label11.setText(zone9.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label12.setText(zone10.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));
 label13.setText(zone11.format(DateTimeFormatter.ofPattern("dd:MM:yyy , EEEE , hh:mm:ss a")));

	}	           }
}

class practice{
	public static void main(String args[]){
         Gui obj = new Gui();
         obj.runMyTime();

	}
}