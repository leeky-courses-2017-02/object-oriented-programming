sudo apt-get remove eclipse
sudo apt-get remove eclipse-platform

wget http://ftp.yz.yamagata-u.ac.jp/pub/eclipse/oomph/epp/oxygen/R/eclipse-inst-linux64.tar.gz

tar zxvf eclipse-inst-linux64.tar.gz
cd eclipse-installer
./eclipse-inst
cd ../
rm -rf eclipse-installer
rm -f eclipse-inst-linux64.tar.gz
