#!/bin/sh
#rm all previous files
chmod -R 700 lab0
rm -rf lab0
#part1
mkdir lab0
cd lab0
mkdir electrode4
cd electrode4
echo "satk=3 sdef=4 spd=4" > timburr
mkdir zigzagoon 
mkdir toxicroak
echo -e "Способности Overgrow\nChlorophyll Own Tempo" > petilil
echo -e "Способности  Overgrow Chlorophyll\nRivalry" > serperior
cd ..
mkdir granbull1
cd granbull1
mkdir drifloon
echo "Тип покемона GRASS DARK" > cacturne
mkdir shedinja
echo -e "weidth=7.1\nheight=24.0 atk=4 def=9" > togetic
echo -e "Развитые способности\nLightningrod" > tynamo
cd ..
echo -e "Развитые способности\nAnalytic" > magnezone3
echo -e "Способности  Growl Bubble Water Sport Peck Metal\nClaw Bubblebeam Bide Fury Attack Brine Whirlpool Drill Peck Hydro\Pump" >> prinplup0
mkdir weezing9
cd weezing9
mkdir cascoon
mkdir roggenrola
mkdir meditite
echo "Живет Urban" > voltorb
mkdir staraptor
mkdir drifloon
cd ..
echo -e "Способности  Dark Art Illusion\nPrankster" > zorua9
#part2
chmod 305 electrode4
cd electrode4
chmod 404 timburr
chmod 576 zigzagoon
chmod 537 toxicroak
chmod 664 petilil
chmod 060 serperior
cd ..
chmod 755 granbull1
cd granbull1
chmod 513 drifloon
chmod 404 cacturne
chmod u=rx,g=w,o=r shedinja
chmod a+w togetic
chmod u+r togetic 
chmod 005 tynamo 
cd ..
chmod 444 magnezone3
chmod 444 prinplup0
chmod 777 weezing9
cd weezing9
chmod 537 cascoon
chmod 550 roggenrola
chmod 524 meditite
chmod 620 voltorb
chmod 375 staraptor
chmod 500 drifloon
cd .. 
chmod 440 zorua9
#part3
cat electrode4/timburr electrode4/petilil > magnezone3_10
ln -s /home/studs/s413099/lab0/prinplup0 granbull1/cacturneprinplup
chmod -R 500 electrode4
chmod 700 weezing9/drifloon
cp -r electrode4 weezing9/drifloon
chmod 513 weezing9/drifloon
cd electrode4
chmod 404 timburr
chmod 576 zigzagoon
chmod 537 toxicroak
chmod 664 petilil
chmod 060 serperior
cd ..
chmod 700 electrode4 
ln /home/studs/s413099/lab0/magnezone3 electrode4/petililmagnezone
chmod 305 electrode4
ln -s /home/studs/s413099/lab0/weezing9 /home/studs/s413099/lab0/Copy_30
chmod 700 zorua9
chmod 300 weezing9/cascoon 
cp zorua9 weezing9/cascoon
chmod 537 weezing9/cascoon
chmod 440 zorua9
cat prinplup0 > weezing9/voltorbrinplup
#part4

#1
chmod -R 500 electrode4
chmod 500 granbull1/cacturne
chmod 500 granbull1/cacturneprinplup
chmod 500 granbull1
chmod 500 weezing9/staraptor
chmod 500 weezing9/cascoon
echo "1"
wc -l $(ls -d **/^c | grep -v "/$") 2>/dev/null | sort -nk11 
chmod 305 electrode4
chmod 375 weezing9/staraptor
chmod 664 petilil
chmod 060 serperior
chmod 404 timburr
chmod 537 toxicroak
chmod 576 zigzagoon
cd weezing9
#2
echo "2"
ls -p | grep -v "/" | cat 2>&1 | sort
#3
echo "3"
cat -n `ls -p | grep -v "/"`| grep -v "Permission denied" | sort
#4
echo "4"
ls -Rlt | grep -v "Pe"
cd ..
#5
echo "5"
cat -n zorua9 2>&1 | grep "l$" 
cd granbull1
#6
echo "6"
chmod 400 tynamo
wc -m `ls -p | grep -v "/"` | sort
chmod 005 tynamo 
cd ..
#part5
chmod 700 prinplup0
rm prinplup0
chmod 700 granbull1/togetic
rm granbull1/togetic
rm -f Copy_30



