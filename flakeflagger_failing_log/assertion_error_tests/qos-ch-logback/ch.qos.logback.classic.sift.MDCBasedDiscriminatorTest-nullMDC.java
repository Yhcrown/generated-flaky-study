@Test public void nullMDC(){
  event=new LoggingEvent("a",logger,Level.DEBUG,"",null,null);
// --> Flaky assertion: possible message: expected:<{}> but was:<{compositeProperty=362687584, linger=session1105120429, max=822612267, propertyDefinedWithinSift=1915546258, localProperty=723912984}>; expected:<{}> but was:<{compositeProperty=852986566, max=1895973878, linger=session2035791609, propertyDefinedWithinSift=1119343266, localProperty=284286334}>; expected:<{}> but was:<{compositeProperty=159235862, linger=session878140085, max=318082652, propertyDefinedWithinSift=2018813064, localProperty=1886956796}>; expected:<{}> but was:<{localProperty=1911458559, propertyDefinedWithinSift=1284317281, compositeProperty=1735338059, linger=session677699825, max=1425437609}>; expected:<{}> but was:<{propertyDefinedWithinSift=688238498, localProperty=143478837, compositeProperty=2100963130, linger=session300359049, max=1415348315}>; expected:<{}> but was:<{localProperty=219214399, propertyDefinedWithinSift=1023037941, compositeProperty=249071353, linger=session279732366, max=1105807429}>; expected:<{}> but was:<{localProperty=1540008573, propertyDefinedWithinSift=247171506, compositeProperty=1749339193, linger=session1421571568, max=138130347}>; expected:<{}> but was:<{localProperty=1375795930, propertyDefinedWithinSift=627063367, compositeProperty=825809922, linger=session1934402403, max=1466734771}>; expected:<{}> but was:<{k1959355979=v1959355979, compositeProperty=1093258494, k1156212595=v1156212595, linger=session1786476318, max=191956709, localProperty=356810681, propertyDefinedWithinSift=928466439, userId=user2}>; expected:<{}> but was:<{compositeProperty=1708619898, linger=session312677323, max=1727573332, propertyDefinedWithinSift=1722299406, localProperty=947459772}>; expected:<{}> but was:<{localProperty=196524803, propertyDefinedWithinSift=774871983, compositeProperty=370852571, linger=session150562246, max=1729601177}>; expected:<{}> but was:<{propertyDefinedWithinSift=809829577, localProperty=650778824, compositeProperty=776182168, linger=session1743641024, max=1083877419}>; expected:<{}> but was:<{propertyDefinedWithinSift=1445583803, localProperty=2018538986, compositeProperty=2023154, linger=session65643087, max=826019965}>; expected:<{}> but was:<{localProperty=1912754459, propertyDefinedWithinSift=17299776, compositeProperty=1038686608, max=278018596, linger=session1151516934}>; expected:<{}> but was:<{localProperty=930415432, propertyDefinedWithinSift=1908942951, compositeProperty=1991408892, linger=session920855358, max=157123320}>; expected:<{}> but was:<{propertyDefinedWithinSift=1446804200, localProperty=863592318, compositeProperty=79243789, linger=session1997291724, max=2122507482}>; expected:<{}> but was:<{compositeProperty=1525040801, linger=session930699890, max=2053013447, propertyDefinedWithinSift=436153893, localProperty=97538316}>; expected:<{}> but was:<{compositeProperty=128577720, linger=session1716467892, max=667985461, localProperty=1154211918, propertyDefinedWithinSift=1142559773}>; expected:<{}> but was:<{propertyDefinedWithinSift=883299660, localProperty=1597634799, compositeProperty=339945509, linger=session164177801, max=549032057}>; expected:<{}> but was:<{compositeProperty=2020557488, linger=session820251738, max=2064992688, propertyDefinedWithinSift=910603849, localProperty=2091898258}>; expected:<{}> but was:<{compositeProperty=181430185, max=25197000, linger=session1638068970, propertyDefinedWithinSift=1283656023, localProperty=2098422843}>; expected:<{}> but was:<{compositeProperty=995154168, linger=session617475236, max=456026406, propertyDefinedWithinSift=1995854568, localProperty=1532418682}>; expected:<{}> but was:<{compositeProperty=1328440350, linger=session489662387, max=356882302, propertyDefinedWithinSift=745728398, localProperty=1209864829}>; expected:<{}> but was:<{localProperty=1808901675, propertyDefinedWithinSift=837808669, compositeProperty=978398467, linger=session2085463701, max=197777856}>; expected:<{}> but was:<{propertyDefinedWithinSift=872719228, localProperty=248029088, compositeProperty=1509365762, max=1738261514, linger=session455790495}>; expected:<{}> but was:<{localProperty=1150365111, propertyDefinedWithinSift=833101833, compositeProperty=1031045849, linger=session1515463518, max=2074137555}>; expected:<{}> but was:<{compositeProperty=473855950, max=1685844529, linger=session1164717990, localProperty=839843112, propertyDefinedWithinSift=905639264}>; expected:<{}> but was:<{propertyDefinedWithinSift=899307201, localProperty=1465933634, compositeProperty=812720799, linger=session573421585, max=1606214898}>; expected:<{}> but was:<{compositeProperty=1244584259, linger=session837677278, max=95610097, propertyDefinedWithinSift=259322026, localProperty=1640468240}>; expected:<{}> but was:<{localProperty=61824493, propertyDefinedWithinSift=1474467327, compositeProperty=1893461022, linger=session903010895, max=621018062}>; expected:<{}> but was:<{localProperty=228772618, propertyDefinedWithinSift=574125723, compositeProperty=2057970046, linger=session657672875, max=521764876}>; expected:<{}> but was:<{localProperty=86591668, propertyDefinedWithinSift=537984024, compositeProperty=657942037, linger=session802426980, max=1262638080}>; expected:<{}> but was:<{localProperty=669964421, propertyDefinedWithinSift=1748323894, compositeProperty=316458696, linger=session250101110, max=788442590}>; expected:<{}> but was:<{compositeProperty=1762496808, linger=session1874085619, max=699157842, propertyDefinedWithinSift=427057669, localProperty=1663593652}>; expected:<{}> but was:<{compositeProperty=160705857, linger=session1848562746, max=2120359928, propertyDefinedWithinSift=1177121589, localProperty=1789052770}>; expected:<{}> but was:<{compositeProperty=2056451342, linger=session1943817110, max=31641839, propertyDefinedWithinSift=132806718, localProperty=1011009944}>; expected:<{}> but was:<{localProperty=2056350711, propertyDefinedWithinSift=1544097530, compositeProperty=1822461974, linger=session530789335, max=2082032677}>; expected:<{}> but was:<{compositeProperty=1019953966, linger=session904540379, max=1881456445, propertyDefinedWithinSift=1603380784, localProperty=1739183288}>; expected:<{}> but was:<{propertyDefinedWithinSift=1646089394, localProperty=1713308331, compositeProperty=632694938, linger=session1566929919, max=719774000}>; expected:<{}> but was:<{localProperty=1372126707, propertyDefinedWithinSift=538952782, compositeProperty=1132415060, linger=session932634855, max=1830047350}>; expected:<{}> but was:<{propertyDefinedWithinSift=52702245, localProperty=232952618, compositeProperty=313333294, linger=session1233062006, max=1102778722}>; expected:<{}> but was:<{propertyDefinedWithinSift=1266418319, localProperty=457950190, compositeProperty=65904512, linger=session522046557, max=1260349742}>; expected:<{}> but was:<{propertyDefinedWithinSift=627930502, localProperty=222002392, compositeProperty=1967146502, max=1297442120, linger=session1675822997}>; expected:<{}> but was:<{localProperty=2098837622, propertyDefinedWithinSift=1638711414, compositeProperty=950421361, linger=session1985648866, max=1179298645}>; expected:<{}> but was:<{propertyDefinedWithinSift=719455290, localProperty=354756027, compositeProperty=1588752575, linger=session2127496870, max=1663838727}>; expected:<{}> but was:<{localProperty=1670548738, propertyDefinedWithinSift=1963364208, compositeProperty=105623960, max=67929881, linger=session1357594716}>; expected:<{}> but was:<{compositeProperty=454323876, linger=session679939651, max=770786096, propertyDefinedWithinSift=1958310853, localProperty=138400733}>; expected:<{}> but was:<{localProperty=1955517443, propertyDefinedWithinSift=1421216430, compositeProperty=1670693804, linger=session148501757, max=2022392761}>; expected:<{}> but was:<{propertyDefinedWithinSift=211334249, localProperty=1577898138, compositeProperty=1490511715, linger=session90018777, max=1137246582}>; expected:<{}> but was:<{localProperty=220113112, propertyDefinedWithinSift=279592433, compositeProperty=1184273349, linger=session188751526, max=295994788}>; expected:<{}> but was:<{k1539853763=v1539853763, compositeProperty=645930609, max=1876150228, linger=session357630515, propertyDefinedWithinSift=2130468857, localProperty=1986074714, k931851449=v931851449, userId=user2}>; expected:<{}> but was:<{propertyDefinedWithinSift=196121239, localProperty=1556539904, compositeProperty=1539361832, linger=session1407091960, max=2089904947}>; expected:<{}> but was:<{localProperty=1300518379, propertyDefinedWithinSift=548890325, compositeProperty=2071603704, linger=session517043037, max=1357757020}>; expected:<{}> but was:<{propertyDefinedWithinSift=1345996860, localProperty=952155545, compositeProperty=81403853, linger=session842771435, max=394264438}>; expected:<{}> but was:<{localProperty=241515735, propertyDefinedWithinSift=2077114563, compositeProperty=1573103014, linger=session1700248530, max=1981157729}>; expected:<{}> but was:<{propertyDefinedWithinSift=1174352913, localProperty=20556537, compositeProperty=982511506, linger=session541359388, max=699146527}>; expected:<{}> but was:<{propertyDefinedWithinSift=630548368, localProperty=1725447270, compositeProperty=1250592998, linger=session653476207, max=1314185478}>; expected:<{}> but was:<{propertyDefinedWithinSift=61598392, localProperty=815039140, compositeProperty=1902083155, linger=session606414650, max=2006314291}>; expected:<{}> but was:<{propertyDefinedWithinSift=675297791, localProperty=809471794, compositeProperty=1783249993, linger=session2140956096, max=1626819226}>; expected:<{}> but was:<{compositeProperty=818506155, max=612983276, linger=session1529946208, propertyDefinedWithinSift=843674744, localProperty=1604584388}>; expected:<{}> but was:<{propertyDefinedWithinSift=1940366824, localProperty=407733573, compositeProperty=1978330742, max=278934596, linger=session303580771}>; expected:<{}> but was:<{compositeProperty=974543853, linger=session28061471, max=1820205882, localProperty=248593714, propertyDefinedWithinSift=272001054}>; expected:<{}> but was:<{propertyDefinedWithinSift=886478581, localProperty=1595395135, compositeProperty=2047909361, linger=session1068158394, max=562073246}>; expected:<{}> but was:<{compositeProperty=230055178, linger=session35678438, max=1664271328, localProperty=150339946, propertyDefinedWithinSift=237379515}>; expected:<{}> but was:<{compositeProperty=1651048970, linger=session2031688478, max=1458224229, propertyDefinedWithinSift=674548824, localProperty=1004280322}>; expected:<{}> but was:<{localProperty=596771552, propertyDefinedWithinSift=651753582, compositeProperty=316672107, linger=session918633298, max=1777752828}>; expected:<{}> but was:<{localProperty=1297053413, propertyDefinedWithinSift=1009831687, compositeProperty=1528420610, linger=session1472103204, max=1530107606}>; expected:<{}> but was:<{localProperty=16716809, propertyDefinedWithinSift=101589472, compositeProperty=1023334352, linger=session1853453974, max=190995022}>; expected:<{}> but was:<{propertyDefinedWithinSift=2095547906, localProperty=1526308922, compositeProperty=2089975215, linger=session1128322055, max=355836559}>; expected:<{}> but was:<{compositeProperty=1396700972, max=1985291416, linger=session793838718, propertyDefinedWithinSift=1434215026, localProperty=1442367923}>; expected:<{}> but was:<{propertyDefinedWithinSift=2060502300, localProperty=1411898953, compositeProperty=1886423883, linger=session1377395907, max=737207934}>; expected:<{}> but was:<{compositeProperty=2010382456, linger=session1934660355, max=1101772511, localProperty=144534332, propertyDefinedWithinSift=87945542}>; expected:<{}> but was:<{compositeProperty=253120972, linger=session614292312, max=1189405119, localProperty=2116076599, propertyDefinedWithinSift=1847796490}>; expected:<{}> but was:<{propertyDefinedWithinSift=900278220, localProperty=1966020273, compositeProperty=184562997, linger=session2090782065, max=1882505900}>; expected:<{}> but was:<{localProperty=961310733, propertyDefinedWithinSift=287478148, compositeProperty=1666524724, linger=session1200011289, max=1224289116}>; expected:<{}> but was:<{localProperty=2077599111, propertyDefinedWithinSift=1733731226, compositeProperty=365715033, linger=session468004167, max=292331525}>; expected:<{}> but was:<{compositeProperty=1009099813, linger=session1762096497, max=1212054483, localProperty=1337600231, propertyDefinedWithinSift=1465702547}>; expected:<{}> but was:<{localProperty=217414178, propertyDefinedWithinSift=881815122, compositeProperty=130737578, linger=session1661963006, max=33631828}>; expected:<{}> but was:<{localProperty=1409052162, propertyDefinedWithinSift=437709907, compositeProperty=425808500, linger=session511533795, max=572071336}>; expected:<{}> but was:<{compositeProperty=1808205133, max=862149889, linger=session618790256, localProperty=203596822, propertyDefinedWithinSift=1239216831}>; expected:<{}> but was:<{localProperty=1436262008, propertyDefinedWithinSift=1237253313, compositeProperty=2017921556, linger=session683177925, max=1198830982}>; expected:<{}> but was:<{compositeProperty=1740233508, max=1068798358, linger=session1878477845, propertyDefinedWithinSift=504256313, localProperty=1121669473, k1117257958=v1117257958, userId=user2, k603712739=v603712739}>; expected:<{}> but was:<{propertyDefinedWithinSift=231860283, localProperty=460095272, compositeProperty=1599133318, max=756411318, linger=session1715232084}>; expected:<{}> but was:<{propertyDefinedWithinSift=619239425, localProperty=2059535474, compositeProperty=215575844, linger=session891147045, max=1962937214}>; expected:<{}> but was:<{localProperty=1181334384, propertyDefinedWithinSift=1667466908, compositeProperty=883556026, linger=session609491155, max=1080024202}>; expected:<{}> but was:<{localProperty=1074053375, propertyDefinedWithinSift=1829961275, compositeProperty=1206819167, linger=session763154577, max=1028083196}>; expected:<{}> but was:<{localProperty=1650366717, propertyDefinedWithinSift=1933649919, compositeProperty=451779559, linger=session1723815562, max=1730242538}>; expected:<{}> but was:<{compositeProperty=1320421861, linger=session629009462, max=195189321, propertyDefinedWithinSift=94812235, localProperty=1885149560}>; expected:<{}> but was:<{localProperty=83941741, propertyDefinedWithinSift=1498612216, compositeProperty=2137677200, max=2077309517, linger=session275948631}>; expected:<{}> but was:<{propertyDefinedWithinSift=1281566598, localProperty=1878606868, compositeProperty=568502290, linger=session465737839, max=1289098856}>; expected:<{}> but was:<{compositeProperty=512777919, linger=session1590283455, max=947224702, propertyDefinedWithinSift=779972819, localProperty=416189842}>; expected:<{}> but was:<{propertyDefinedWithinSift=1327122444, localProperty=617024188, compositeProperty=330655465, max=209592252, linger=session880623418}>; expected:<{}> but was:<{compositeProperty=58168301, linger=session1534968152, max=1446588775, localProperty=1786889544, propertyDefinedWithinSift=953530823}>; expected:<{}> but was:<{localProperty=1859852209, propertyDefinedWithinSift=1289448441, compositeProperty=1938008274, linger=session304634595, max=996166738}>; expected:<{}> but was:<{localProperty=393940451, propertyDefinedWithinSift=1705677682, compositeProperty=280675484, max=1238494825, linger=session1743053145}>; expected:<{}> but was:<{localProperty=1209822231, propertyDefinedWithinSift=1165074319, compositeProperty=1300523035, max=1070468298, linger=session254607989}>; expected:<{}> but was:<{compositeProperty=2009372706, linger=session1920210717, max=199028351, localProperty=1963599921, propertyDefinedWithinSift=930915365}>; expected:<{}> but was:<{localProperty=1244705289, propertyDefinedWithinSift=1574920033, compositeProperty=1138889275, max=836101693, linger=session702960114}>; expected:<{}> but was:<{propertyDefinedWithinSift=1122162, localProperty=2043226026, compositeProperty=1925633938, max=112512312, linger=session1252132840}>; expected:<{}> but was:<{compositeProperty=1818459840, linger=session916158786, max=751702267, propertyDefinedWithinSift=1378985556, localProperty=29572088}>; expected:<{}> but was:<{compositeProperty=1044977886, linger=session1164825061, max=2130123244, localProperty=1212651924, propertyDefinedWithinSift=1646818243}>; expected:<{}> but was:<{localProperty=1316564525, propertyDefinedWithinSift=283901839, compositeProperty=1253871761, linger=session841984136, max=1396914755}>; expected:<{}> but was:<{localProperty=395403539, propertyDefinedWithinSift=1975473674, compositeProperty=1707550129, max=923554685, linger=session1548115366}>; expected:<{}> but was:<{compositeProperty=1089859081, linger=session699823501, max=1441251916, propertyDefinedWithinSift=992551753, localProperty=595919090}>; expected:<{}> but was:<{compositeProperty=847017232, linger=session566895166, max=1349145868, propertyDefinedWithinSift=989833293, localProperty=1914746410}>; expected:<{}> but was:<{compositeProperty=1170797283, linger=session2090275482, max=1879021934, localProperty=18049873, propertyDefinedWithinSift=992120435}>; expected:<{}> but was:<{compositeProperty=1492978199, linger=session1487477509, max=1294333994, propertyDefinedWithinSift=1732742307, localProperty=226986113}>; expected:<{}> but was:<{propertyDefinedWithinSift=1985125729, localProperty=23592693, compositeProperty=1023618519, max=1873919098, linger=session956846396}>; expected:<{}> but was:<{compositeProperty=140282781, max=970905589, linger=session2097924804, propertyDefinedWithinSift=1998861110, localProperty=1068262554}>; expected:<{}> but was:<{compositeProperty=1186086677, linger=session1604586034, max=271584333, propertyDefinedWithinSift=640783715, localProperty=645043411}>; expected:<{}> but was:<{compositeProperty=331464039, linger=session213385834, max=183285546, propertyDefinedWithinSift=1190511332, localProperty=1250218705}>; expected:<{}> but was:<{propertyDefinedWithinSift=819135968, localProperty=909729987, compositeProperty=1373980110, linger=session977149183, max=186296462}>; expected:<{}> but was:<{compositeProperty=264009324, linger=session888610010, max=1902512248, localProperty=229137587, propertyDefinedWithinSift=305894050}>; expected:<{}> but was:<{compositeProperty=230392130, linger=session2045733335, max=1154353428, localProperty=919143407, propertyDefinedWithinSift=1165794300}>; expected:<{}> but was:<{compositeProperty=494702218, linger=session2049927406, max=449805564, propertyDefinedWithinSift=2081863350, localProperty=1432672610}>; expected:<{}> but was:<{localProperty=252608922, propertyDefinedWithinSift=1972677584, compositeProperty=100144491, linger=session1197620990, max=1971630294}>; expected:<{}> but was:<{localProperty=1165440816, propertyDefinedWithinSift=1053180556, compositeProperty=533044356, linger=session1533051133, max=1792177993}>; expected:<{}> but was:<{propertyDefinedWithinSift=2122068006, localProperty=875278314, compositeProperty=1987401896, max=790546127, linger=session1928768148}>; expected:<{}> but was:<{propertyDefinedWithinSift=1684753139, localProperty=118554332, compositeProperty=48621887, linger=session774829187, max=1525811869}>; expected:<{}> but was:<{propertyDefinedWithinSift=825813384, localProperty=1067334567, compositeProperty=486745466, linger=session481425847, max=222834348}>; expected:<{}> but was:<{localProperty=22514034, propertyDefinedWithinSift=1325337778, compositeProperty=1699029000, max=1049252725, linger=session1521816436}>; expected:<{}> but was:<{localProperty=1707288856, propertyDefinedWithinSift=804213324, compositeProperty=953133798, max=65865891, linger=session537249266}>; expected:<{}> but was:<{localProperty=1423108206, propertyDefinedWithinSift=1513313893, compositeProperty=256366461, linger=session1062124484, max=18118326}>; expected:<{}> but was:<{localProperty=2087438279, propertyDefinedWithinSift=813016655, compositeProperty=614364332, linger=session1602920610, max=1239705016}>; expected:<{}> but was:<{compositeProperty=391266511, linger=session802444617, max=673321337, localProperty=1036187993, propertyDefinedWithinSift=187455781}>; expected:<{}> but was:<{localProperty=330741226, propertyDefinedWithinSift=19636642, compositeProperty=1044618316, linger=session636193468, max=6574802}>; expected:<{}> but was:<{compositeProperty=699667655, linger=session190289551, max=158713418, propertyDefinedWithinSift=52314366, localProperty=542379202}>; expected:<{}> but was:<{compositeProperty=1415691903, linger=session1041797522, max=1548840646, localProperty=285592074, propertyDefinedWithinSift=1923504463}>; expected:<{}> but was:<{compositeProperty=686558642, linger=session427490781, max=1154928520, propertyDefinedWithinSift=198536027, localProperty=22299931}>; expected:<{}> but was:<{localProperty=1105703625, propertyDefinedWithinSift=1160614304, compositeProperty=1808179071, max=1108118987, linger=session1583713029}>; expected:<{}> but was:<{compositeProperty=94474207, linger=session1703311786, max=1713135656, propertyDefinedWithinSift=1731671864, localProperty=1548647640}>; expected:<{}> but was:<{propertyDefinedWithinSift=1962249770, localProperty=753038233, compositeProperty=1983148717, linger=session963166223, max=1031829702}>; expected:<{}> but was:<{localProperty=1227496432, propertyDefinedWithinSift=207514125, compositeProperty=74789980, linger=session73492614, max=763576585}>; expected:<{}> but was:<{compositeProperty=1143441482, linger=session1996606673, max=820800079, localProperty=817958082, propertyDefinedWithinSift=3066736}>; expected:<{}> but was:<{compositeProperty=1828582191, linger=session180445624, max=759516356, propertyDefinedWithinSift=2034759550, localProperty=1206747350}>; expected:<{}> but was:<{compositeProperty=1677937907, linger=session830269218, max=2143164362, propertyDefinedWithinSift=517710733, localProperty=1589284659}>; expected:<{}> but was:<{propertyDefinedWithinSift=2820323, localProperty=226441348, compositeProperty=2084464392, max=807097715, linger=session1167846063}>; expected:<{}> but was:<{propertyDefinedWithinSift=114175477, localProperty=685541722, compositeProperty=1019914, linger=session1443158709, max=1499368281}>; expected:<{}> but was:<{localProperty=499344749, propertyDefinedWithinSift=1305923555, compositeProperty=1450967711, max=1139298136, linger=session1053177938}>; expected:<{}> but was:<{localProperty=327171780, propertyDefinedWithinSift=879202465, compositeProperty=1004335488, linger=session317312616, max=46187522}>; expected:<{}> but was:<{propertyDefinedWithinSift=1517739090, localProperty=592023597, compositeProperty=1085093100, linger=session1086932120, max=1866499759}>;     assertEquals(new HashMap(), event.getMDCPropertyMap());
  String discriminatorValue=discriminator.getDiscriminatingValue(event);
  assertEquals(DEFAULT_VAL,discriminatorValue);
}