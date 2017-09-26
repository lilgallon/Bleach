@echo off
echo === CREATING FOLDER ====
mkdir Server
echo === COPYING BUKKIT FILE ===
xcopy libs\craftbukkit-1.12.2.jar Server\
echo === BUILDING START.BAT ===
echo @echo off > Server/start.bat
echo java -Xms512M -Xmx1G -XX:+UseConcMarkSweepGC -jar craftbukkit-1.12.2.jar >> Server/start.bat
echo pause >> Server/start.bat
echo === README ===
echo To start the server, please use "start.bat" in Server/ folder. 
echo Please notice that you need to set the value to true in eula.txt.
pause