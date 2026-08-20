/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import javax.microedition.rms.RecordStore;

final class k5 {
    private static final String a = "nso_offline_bots_v1";
    private static final int b = 1314082626;
    private static final int c = 12;
    private static final int d = 30;
    private static final int[] e = new int[0];
    private static final int f = 2;
    private static final int g = 8;
    private static final int h = 10;
    private static final int i = 10;
    private static final int j = 6;
    private static final int k = 5;
    private static final int l = 28;
    private static final int m = 22;
    private static final int n = 8;
    private static final int o = 6;
    private static final long p = 120L;
    private static final long q = 160L;
    private static final int[] r = new int[]{-72, -42, 42, 72, 102};
    private static final int[] s = new int[5];
    private static final int[] t = new int[5];
    private static final int u = 12;
    private static final long v = 650L;
    private static final long w = 90000L;
    private static final long x = 120L;
    private static final int y = 5;
    private static final long z = 180L;
    private static final long A = 120L;
    private static final int B = 36;
    private static final int C = 28;
    private static final int D = 35;
    private static final long E = 420L;
    private static final long F = 30000L;
    private static final long G = 900L;
    private static final long H = 30000L;
    private static final int I = 3;
    private static final int J = 25;
    private static final long K = 86400000L;
    private static final int L = 2;
    private static final int M = 4;
    private static final int N = 10000;
    private static final int O = 100000000;
    private static final int P = 1000000000;
    private static final int Q = 4;
    private static final int R = 16;
    private static final int S = 0;
    private static final int T = 0;
    private static final int U = 1;
    private static final int V = 2;
    private static final int W = 3;
    private static final int X = 4;
    private static final int Y = 5;
    private static final int Z = 1;
    private static final int aa = 2;
    private static final int ab = 3;
    private static final int ac = 4;
    private static final int ad = 5;
    private static final int ae = 6;
    private static final String[] af = new String[]{"Hikari", "Kage", "Sakura", "Kenji", "Akari", "Raiden", "Miko", "Taro", "Yuki", "Ren", "Hana", "Jiro", "Sora", "Daichi", "Mei", "Riku", "Ayame", "Takeshi", "Nozomi", "Ryo", "Kaito", "Emi", "Shin", "Nami", "Haru", "Yuna", "Itsuki", "Aoi", "Kou", "Mina"};
    private static final int[] ag = new int[]{1, 2, 3, 10, 13, 17, 18, 22, 23, 27, 29, 32, 35, 38, 45, 48, 91, 105, 157, 163, 4, 5, 6, 7, 8, 9, 11, 12, 14, 15};
    private static final int[] ah = new int[]{193, 120, 180, 109, 188, 1480, 160, 228, 176, 647, 168, 2502, 152, 397, 176, 140, 120, 120, 120, 120, 120, 180, 240, 300, 420, 540, 660, 780, 900, 1020};
    private static final int[] ai = new int[]{384, 144, 264, 264, 240, 264, 216, 192, 216, 408, 264, 384, 240, 336, 240, 432, 264, 360, 264, 240, 144, 192, 240, 288, 336, 384, 432, 480, 528, 576};
    private static final short[] aj = new short[]{1111, 1112, 1113, 1114, 1115, 1116};
    private static final short[] ak = new short[]{12, 15, 41, 14, 13, 16};
    private static final short[] al = new short[]{814, 815, 816, 817, 818};
    private static final short[] am = new short[]{54, 53, 52, 51, 50};
    private static final short[] an = new short[]{443, 485, 776, 523, 524, 777, 798, 830, 850};
    private static final byte[] ao = new byte[]{6, 7, 10, 67, 69, 68, 70, 71, 72, 73, 74};
    private static final short[] ap = new short[]{50, 50, 10, 5, 10, 10, 5, 5, 5, 100, 50};
    private static final short[] aq = new short[]{11, 26, 27, 28};
    private static final short[] ar = new short[]{2, 23, 24, 25};
    private static final byte[] as;
    private static final short[] at;
    private static final short[] au;
    private static final short[] av;
    private static k0[] aw;
    private static boolean ax;
    private static int ay;
    private static boolean az;
    private static boolean aA;
    private static final boolean[] aB;
    private static long aC;
    private static long aD;
    private static long aE;
    private static long aF;
    private static long aG;
    private static long aH;
    private static long aI;
    private static boolean aJ;
    private static int aK;
    private static boolean aL;
    private static final int[] aM;
    private static int aN;
    private static int aO;
    private static int aP;
    private static int aQ;
    private static int aR;
    private static int aS;
    private static long aT;
    private static long aU;
    private static int aV;
    private static int aW;
    private static int aX;
    private static int aY;
    private static int aZ;
    private static final short[] ba;
    private static final short[] bb;
    private static int bc;
    private static int bd;
    private static int be;
    private static boolean bf;
    private static boolean bg;
    private static long bh;
    private static int bi;
    private static int bj;
    private static int bk;
    private static int bl;
    private static int bm;
    private static int bn;
    private static int bo;
    private static int bp;
    private static int bq;
    private static int br;
    private static int bs;
    private static int bt;
    private static final int[] bu;
    private static int bv;
    private static final long[] bw;
    private static int bx;
    private static final long[] by;
    private static int bz;

    static {
        byte[] byArray = new byte[6];
        byArray[1] = 1;
        byArray[2] = 3;
        byArray[3] = 4;
        byArray[4] = 5;
        byArray[5] = 6;
        as = byArray;
        at = new short[]{17, 18, 19, 23, 24, 25, 26, 27, 28, 269, 270, 280, 284};
        short[] sArray = new short[13];
        sArray[1] = 15;
        sArray[2] = 41;
        sArray[3] = 106;
        sArray[4] = 155;
        sArray[5] = 169;
        sArray[6] = 195;
        sArray[7] = 209;
        sArray[8] = 250;
        sArray[9] = 265;
        sArray[10] = 292;
        sArray[11] = 306;
        sArray[12] = 1199;
        au = sArray;
        short[] sArray2 = new short[1199];
        sArray2[1] = 1;
        sArray2[2] = 2;
        sArray2[3] = 3;
        sArray2[4] = 4;
        sArray2[5] = 5;
        sArray2[6] = 6;
        sArray2[7] = 7;
        sArray2[8] = 8;
        sArray2[9] = 9;
        sArray2[10] = 10;
        sArray2[11] = 11;
        sArray2[12] = 1146;
        sArray2[13] = 1147;
        sArray2[14] = 1148;
        sArray2[15] = 164;
        sArray2[16] = 165;
        sArray2[17] = 166;
        sArray2[18] = 167;
        sArray2[19] = 168;
        sArray2[20] = 169;
        sArray2[21] = 170;
        sArray2[22] = 171;
        sArray2[23] = 172;
        sArray2[24] = 173;
        sArray2[25] = 203;
        sArray2[26] = 204;
        sArray2[27] = 325;
        sArray2[28] = 330;
        sArray2[29] = 363;
        sArray2[30] = 368;
        sArray2[31] = 492;
        sArray2[32] = 493;
        sArray2[33] = 618;
        sArray2[34] = 619;
        sArray2[35] = 746;
        sArray2[36] = 753;
        sArray2[37] = 1097;
        sArray2[38] = 1098;
        sArray2[39] = 1163;
        sArray2[40] = 1164;
        sArray2[41] = 94;
        sArray2[42] = 95;
        sArray2[43] = 96;
        sArray2[44] = 97;
        sArray2[45] = 98;
        sArray2[46] = 99;
        sArray2[47] = 100;
        sArray2[48] = 101;
        sArray2[49] = 102;
        sArray2[50] = 103;
        sArray2[51] = 104;
        sArray2[52] = 105;
        sArray2[53] = 106;
        sArray2[54] = 107;
        sArray2[55] = 108;
        sArray2[56] = 109;
        sArray2[57] = 110;
        sArray2[58] = 111;
        sArray2[59] = 112;
        sArray2[60] = 113;
        sArray2[61] = 114;
        sArray2[62] = 115;
        sArray2[63] = 116;
        sArray2[64] = 117;
        sArray2[65] = 118;
        sArray2[66] = 119;
        sArray2[67] = 120;
        sArray2[68] = 121;
        sArray2[69] = 122;
        sArray2[70] = 123;
        sArray2[71] = 194;
        sArray2[72] = 331;
        sArray2[73] = 332;
        sArray2[74] = 333;
        sArray2[75] = 334;
        sArray2[76] = 335;
        sArray2[77] = 336;
        sArray2[78] = 369;
        sArray2[79] = 370;
        sArray2[80] = 371;
        sArray2[81] = 372;
        sArray2[82] = 373;
        sArray2[83] = 374;
        sArray2[84] = 506;
        sArray2[85] = 507;
        sArray2[86] = 508;
        sArray2[87] = 509;
        sArray2[88] = 510;
        sArray2[89] = 511;
        sArray2[90] = 632;
        sArray2[91] = 633;
        sArray2[92] = 634;
        sArray2[93] = 635;
        sArray2[94] = 636;
        sArray2[95] = 637;
        sArray2[96] = 799;
        sArray2[97] = 800;
        sArray2[98] = 1111;
        sArray2[99] = 1112;
        sArray2[100] = 1113;
        sArray2[101] = 1114;
        sArray2[102] = 1115;
        sArray2[103] = 1116;
        sArray2[104] = 1156;
        sArray2[105] = 1157;
        sArray2[106] = 154;
        sArray2[107] = 155;
        sArray2[108] = 156;
        sArray2[109] = 157;
        sArray2[110] = 158;
        sArray2[111] = 159;
        sArray2[112] = 160;
        sArray2[113] = 161;
        sArray2[114] = 162;
        sArray2[115] = 163;
        sArray2[116] = 201;
        sArray2[117] = 202;
        sArray2[118] = 323;
        sArray2[119] = 329;
        sArray2[120] = 361;
        sArray2[121] = 367;
        sArray2[122] = 494;
        sArray2[123] = 495;
        sArray2[124] = 620;
        sArray2[125] = 621;
        sArray2[126] = 709;
        sArray2[127] = 712;
        sArray2[128] = 715;
        sArray2[129] = 718;
        sArray2[130] = 721;
        sArray2[131] = 724;
        sArray2[132] = 727;
        sArray2[133] = 730;
        sArray2[134] = 795;
        sArray2[135] = 796;
        sArray2[136] = 805;
        sArray2[137] = 806;
        sArray2[138] = 849;
        sArray2[139] = 1083;
        sArray2[140] = 1084;
        sArray2[141] = 1092;
        sArray2[142] = 1093;
        sArray2[143] = 1099;
        sArray2[144] = 1100;
        sArray2[145] = 1160;
        sArray2[146] = 1165;
        sArray2[147] = 1166;
        sArray2[148] = 1192;
        sArray2[149] = 1195;
        sArray2[150] = 1198;
        sArray2[151] = 1201;
        sArray2[152] = 1204;
        sArray2[153] = 1211;
        sArray2[154] = 1212;
        sArray2[155] = 189;
        sArray2[156] = 190;
        sArray2[157] = 191;
        sArray2[158] = 192;
        sArray2[159] = 193;
        sArray2[160] = 208;
        sArray2[161] = 324;
        sArray2[162] = 362;
        sArray2[163] = 505;
        sArray2[164] = 631;
        sArray2[165] = 752;
        sArray2[166] = 759;
        sArray2[167] = 1110;
        sArray2[168] = 1176;
        sArray2[169] = 144;
        sArray2[170] = 145;
        sArray2[171] = 146;
        sArray2[172] = 147;
        sArray2[173] = 148;
        sArray2[174] = 149;
        sArray2[175] = 150;
        sArray2[176] = 151;
        sArray2[177] = 152;
        sArray2[178] = 153;
        sArray2[179] = 199;
        sArray2[180] = 200;
        sArray2[181] = 321;
        sArray2[182] = 328;
        sArray2[183] = 359;
        sArray2[184] = 366;
        sArray2[185] = 498;
        sArray2[186] = 499;
        sArray2[187] = 624;
        sArray2[188] = 625;
        sArray2[189] = 747;
        sArray2[190] = 754;
        sArray2[191] = 1103;
        sArray2[192] = 1104;
        sArray2[193] = 1169;
        sArray2[194] = 1170;
        sArray2[195] = 184;
        sArray2[196] = 185;
        sArray2[197] = 186;
        sArray2[198] = 187;
        sArray2[199] = 188;
        sArray2[200] = 207;
        sArray2[201] = 322;
        sArray2[202] = 360;
        sArray2[203] = 504;
        sArray2[204] = 630;
        sArray2[205] = 749;
        sArray2[206] = 756;
        sArray2[207] = 1109;
        sArray2[208] = 1175;
        sArray2[209] = 31;
        sArray2[210] = 32;
        sArray2[211] = 33;
        sArray2[212] = 134;
        sArray2[213] = 135;
        sArray2[214] = 136;
        sArray2[215] = 137;
        sArray2[216] = 138;
        sArray2[217] = 139;
        sArray2[218] = 140;
        sArray2[219] = 141;
        sArray2[220] = 142;
        sArray2[221] = 143;
        sArray2[222] = 197;
        sArray2[223] = 198;
        sArray2[224] = 319;
        sArray2[225] = 327;
        sArray2[226] = 357;
        sArray2[227] = 365;
        sArray2[228] = 496;
        sArray2[229] = 497;
        sArray2[230] = 622;
        sArray2[231] = 623;
        sArray2[232] = 710;
        sArray2[233] = 713;
        sArray2[234] = 716;
        sArray2[235] = 719;
        sArray2[236] = 722;
        sArray2[237] = 725;
        sArray2[238] = 728;
        sArray2[239] = 731;
        sArray2[240] = 1101;
        sArray2[241] = 1102;
        sArray2[242] = 1161;
        sArray2[243] = 1167;
        sArray2[244] = 1168;
        sArray2[245] = 1193;
        sArray2[246] = 1196;
        sArray2[247] = 1199;
        sArray2[248] = 1202;
        sArray2[249] = 1205;
        sArray2[250] = 179;
        sArray2[251] = 180;
        sArray2[252] = 181;
        sArray2[253] = 182;
        sArray2[254] = 183;
        sArray2[255] = 206;
        sArray2[256] = 320;
        sArray2[257] = 358;
        sArray2[258] = 503;
        sArray2[259] = 629;
        sArray2[260] = 751;
        sArray2[261] = 758;
        sArray2[262] = 1108;
        sArray2[263] = 1117;
        sArray2[264] = 1174;
        sArray2[265] = 39;
        sArray2[266] = 124;
        sArray2[267] = 125;
        sArray2[268] = 126;
        sArray2[269] = 127;
        sArray2[270] = 128;
        sArray2[271] = 129;
        sArray2[272] = 130;
        sArray2[273] = 131;
        sArray2[274] = 132;
        sArray2[275] = 133;
        sArray2[276] = 195;
        sArray2[277] = 196;
        sArray2[278] = 317;
        sArray2[279] = 326;
        sArray2[280] = 355;
        sArray2[281] = 364;
        sArray2[282] = 500;
        sArray2[283] = 501;
        sArray2[284] = 626;
        sArray2[285] = 627;
        sArray2[286] = 748;
        sArray2[287] = 755;
        sArray2[288] = 1105;
        sArray2[289] = 1106;
        sArray2[290] = 1171;
        sArray2[291] = 1172;
        sArray2[292] = 174;
        sArray2[293] = 175;
        sArray2[294] = 176;
        sArray2[295] = 177;
        sArray2[296] = 178;
        sArray2[297] = 205;
        sArray2[298] = 318;
        sArray2[299] = 356;
        sArray2[300] = 502;
        sArray2[301] = 628;
        sArray2[302] = 750;
        sArray2[303] = 757;
        sArray2[304] = 1107;
        sArray2[305] = 1173;
        sArray2[306] = 12;
        sArray2[307] = 13;
        sArray2[308] = 14;
        sArray2[309] = 15;
        sArray2[310] = 16;
        sArray2[311] = 17;
        sArray2[312] = 18;
        sArray2[313] = 19;
        sArray2[314] = 20;
        sArray2[315] = 21;
        sArray2[316] = 22;
        sArray2[317] = 23;
        sArray2[318] = 24;
        sArray2[319] = 25;
        sArray2[320] = 26;
        sArray2[321] = 27;
        sArray2[322] = 28;
        sArray2[323] = 29;
        sArray2[324] = 30;
        sArray2[325] = 34;
        sArray2[326] = 35;
        sArray2[327] = 36;
        sArray2[328] = 37;
        sArray2[329] = 38;
        sArray2[330] = 40;
        sArray2[331] = 41;
        sArray2[332] = 42;
        sArray2[333] = 43;
        sArray2[334] = 44;
        sArray2[335] = 45;
        sArray2[336] = 46;
        sArray2[337] = 47;
        sArray2[338] = 48;
        sArray2[339] = 49;
        sArray2[340] = 50;
        sArray2[341] = 51;
        sArray2[342] = 52;
        sArray2[343] = 53;
        sArray2[344] = 54;
        sArray2[345] = 55;
        sArray2[346] = 56;
        sArray2[347] = 57;
        sArray2[348] = 58;
        sArray2[349] = 59;
        sArray2[350] = 60;
        sArray2[351] = 61;
        sArray2[352] = 62;
        sArray2[353] = 63;
        sArray2[354] = 64;
        sArray2[355] = 65;
        sArray2[356] = 66;
        sArray2[357] = 67;
        sArray2[358] = 68;
        sArray2[359] = 69;
        sArray2[360] = 70;
        sArray2[361] = 71;
        sArray2[362] = 72;
        sArray2[363] = 73;
        sArray2[364] = 74;
        sArray2[365] = 75;
        sArray2[366] = 76;
        sArray2[367] = 77;
        sArray2[368] = 78;
        sArray2[369] = 79;
        sArray2[370] = 80;
        sArray2[371] = 81;
        sArray2[372] = 82;
        sArray2[373] = 83;
        sArray2[374] = 84;
        sArray2[375] = 85;
        sArray2[376] = 86;
        sArray2[377] = 87;
        sArray2[378] = 88;
        sArray2[379] = 89;
        sArray2[380] = 90;
        sArray2[381] = 91;
        sArray2[382] = 92;
        sArray2[383] = 93;
        sArray2[384] = 209;
        sArray2[385] = 210;
        sArray2[386] = 211;
        sArray2[387] = 212;
        sArray2[388] = 213;
        sArray2[389] = 214;
        sArray2[390] = 215;
        sArray2[391] = 216;
        sArray2[392] = 217;
        sArray2[393] = 218;
        sArray2[394] = 219;
        sArray2[395] = 220;
        sArray2[396] = 221;
        sArray2[397] = 222;
        sArray2[398] = 223;
        sArray2[399] = 224;
        sArray2[400] = 225;
        sArray2[401] = 226;
        sArray2[402] = 227;
        sArray2[403] = 228;
        sArray2[404] = 229;
        sArray2[405] = 230;
        sArray2[406] = 231;
        sArray2[407] = 232;
        sArray2[408] = 233;
        sArray2[409] = 234;
        sArray2[410] = 235;
        sArray2[411] = 236;
        sArray2[412] = 237;
        sArray2[413] = 238;
        sArray2[414] = 239;
        sArray2[415] = 240;
        sArray2[416] = 241;
        sArray2[417] = 242;
        sArray2[418] = 243;
        sArray2[419] = 244;
        sArray2[420] = 245;
        sArray2[421] = 246;
        sArray2[422] = 247;
        sArray2[423] = 248;
        sArray2[424] = 249;
        sArray2[425] = 250;
        sArray2[426] = 251;
        sArray2[427] = 252;
        sArray2[428] = 253;
        sArray2[429] = 254;
        sArray2[430] = 255;
        sArray2[431] = 256;
        sArray2[432] = 257;
        sArray2[433] = 258;
        sArray2[434] = 259;
        sArray2[435] = 260;
        sArray2[436] = 261;
        sArray2[437] = 262;
        sArray2[438] = 263;
        sArray2[439] = 264;
        sArray2[440] = 265;
        sArray2[441] = 266;
        sArray2[442] = 267;
        sArray2[443] = 268;
        sArray2[444] = 269;
        sArray2[445] = 270;
        sArray2[446] = 271;
        sArray2[447] = 272;
        sArray2[448] = 273;
        sArray2[449] = 274;
        sArray2[450] = 275;
        sArray2[451] = 276;
        sArray2[452] = 277;
        sArray2[453] = 278;
        sArray2[454] = 279;
        sArray2[455] = 280;
        sArray2[456] = 281;
        sArray2[457] = 282;
        sArray2[458] = 283;
        sArray2[459] = 284;
        sArray2[460] = 285;
        sArray2[461] = 286;
        sArray2[462] = 287;
        sArray2[463] = 288;
        sArray2[464] = 289;
        sArray2[465] = 290;
        sArray2[466] = 291;
        sArray2[467] = 306;
        sArray2[468] = 307;
        sArray2[469] = 308;
        sArray2[470] = 309;
        sArray2[471] = 310;
        sArray2[472] = 311;
        sArray2[473] = 312;
        sArray2[474] = 313;
        sArray2[475] = 314;
        sArray2[476] = 315;
        sArray2[477] = 316;
        sArray2[478] = 337;
        sArray2[479] = 338;
        sArray2[480] = 339;
        sArray2[481] = 340;
        sArray2[482] = 341;
        sArray2[483] = 342;
        sArray2[484] = 343;
        sArray2[485] = 344;
        sArray2[486] = 345;
        sArray2[487] = 346;
        sArray2[488] = 347;
        sArray2[489] = 348;
        sArray2[490] = 349;
        sArray2[491] = 350;
        sArray2[492] = 351;
        sArray2[493] = 352;
        sArray2[494] = 353;
        sArray2[495] = 354;
        sArray2[496] = 375;
        sArray2[497] = 376;
        sArray2[498] = 377;
        sArray2[499] = 378;
        sArray2[500] = 379;
        sArray2[501] = 380;
        sArray2[502] = 381;
        sArray2[503] = 382;
        sArray2[504] = 383;
        sArray2[505] = 384;
        sArray2[506] = 385;
        sArray2[507] = 386;
        sArray2[508] = 387;
        sArray2[509] = 388;
        sArray2[510] = 389;
        sArray2[511] = 390;
        sArray2[512] = 391;
        sArray2[513] = 392;
        sArray2[514] = 393;
        sArray2[515] = 394;
        sArray2[516] = 395;
        sArray2[517] = 396;
        sArray2[518] = 397;
        sArray2[519] = 398;
        sArray2[520] = 399;
        sArray2[521] = 400;
        sArray2[522] = 401;
        sArray2[523] = 402;
        sArray2[524] = 403;
        sArray2[525] = 404;
        sArray2[526] = 405;
        sArray2[527] = 406;
        sArray2[528] = 407;
        sArray2[529] = 408;
        sArray2[530] = 409;
        sArray2[531] = 410;
        sArray2[532] = 411;
        sArray2[533] = 412;
        sArray2[534] = 413;
        sArray2[535] = 414;
        sArray2[536] = 415;
        sArray2[537] = 416;
        sArray2[538] = 417;
        sArray2[539] = 418;
        sArray2[540] = 419;
        sArray2[541] = 420;
        sArray2[542] = 421;
        sArray2[543] = 422;
        sArray2[544] = 423;
        sArray2[545] = 424;
        sArray2[546] = 425;
        sArray2[547] = 426;
        sArray2[548] = 427;
        sArray2[549] = 428;
        sArray2[550] = 429;
        sArray2[551] = 430;
        sArray2[552] = 431;
        sArray2[553] = 432;
        sArray2[554] = 433;
        sArray2[555] = 434;
        sArray2[556] = 435;
        sArray2[557] = 436;
        sArray2[558] = 437;
        sArray2[559] = 438;
        sArray2[560] = 439;
        sArray2[561] = 440;
        sArray2[562] = 441;
        sArray2[563] = 442;
        sArray2[564] = 443;
        sArray2[565] = 444;
        sArray2[566] = 445;
        sArray2[567] = 446;
        sArray2[568] = 447;
        sArray2[569] = 448;
        sArray2[570] = 449;
        sArray2[571] = 450;
        sArray2[572] = 451;
        sArray2[573] = 452;
        sArray2[574] = 453;
        sArray2[575] = 454;
        sArray2[576] = 455;
        sArray2[577] = 456;
        sArray2[578] = 457;
        sArray2[579] = 458;
        sArray2[580] = 459;
        sArray2[581] = 460;
        sArray2[582] = 461;
        sArray2[583] = 462;
        sArray2[584] = 463;
        sArray2[585] = 464;
        sArray2[586] = 465;
        sArray2[587] = 466;
        sArray2[588] = 467;
        sArray2[589] = 468;
        sArray2[590] = 469;
        sArray2[591] = 470;
        sArray2[592] = 471;
        sArray2[593] = 472;
        sArray2[594] = 473;
        sArray2[595] = 474;
        sArray2[596] = 475;
        sArray2[597] = 476;
        sArray2[598] = 477;
        sArray2[599] = 478;
        sArray2[600] = 479;
        sArray2[601] = 480;
        sArray2[602] = 481;
        sArray2[603] = 482;
        sArray2[604] = 483;
        sArray2[605] = 484;
        sArray2[606] = 485;
        sArray2[607] = 486;
        sArray2[608] = 487;
        sArray2[609] = 488;
        sArray2[610] = 489;
        sArray2[611] = 490;
        sArray2[612] = 491;
        sArray2[613] = 512;
        sArray2[614] = 513;
        sArray2[615] = 514;
        sArray2[616] = 515;
        sArray2[617] = 516;
        sArray2[618] = 517;
        sArray2[619] = 518;
        sArray2[620] = 519;
        sArray2[621] = 520;
        sArray2[622] = 521;
        sArray2[623] = 522;
        sArray2[624] = 523;
        sArray2[625] = 524;
        sArray2[626] = 525;
        sArray2[627] = 526;
        sArray2[628] = 527;
        sArray2[629] = 528;
        sArray2[630] = 529;
        sArray2[631] = 530;
        sArray2[632] = 531;
        sArray2[633] = 532;
        sArray2[634] = 533;
        sArray2[635] = 534;
        sArray2[636] = 535;
        sArray2[637] = 536;
        sArray2[638] = 537;
        sArray2[639] = 538;
        sArray2[640] = 539;
        sArray2[641] = 540;
        sArray2[642] = 541;
        sArray2[643] = 542;
        sArray2[644] = 543;
        sArray2[645] = 544;
        sArray2[646] = 545;
        sArray2[647] = 546;
        sArray2[648] = 547;
        sArray2[649] = 548;
        sArray2[650] = 549;
        sArray2[651] = 550;
        sArray2[652] = 551;
        sArray2[653] = 552;
        sArray2[654] = 553;
        sArray2[655] = 554;
        sArray2[656] = 555;
        sArray2[657] = 556;
        sArray2[658] = 557;
        sArray2[659] = 558;
        sArray2[660] = 559;
        sArray2[661] = 560;
        sArray2[662] = 561;
        sArray2[663] = 562;
        sArray2[664] = 563;
        sArray2[665] = 564;
        sArray2[666] = 565;
        sArray2[667] = 566;
        sArray2[668] = 567;
        sArray2[669] = 568;
        sArray2[670] = 569;
        sArray2[671] = 570;
        sArray2[672] = 571;
        sArray2[673] = 572;
        sArray2[674] = 573;
        sArray2[675] = 574;
        sArray2[676] = 575;
        sArray2[677] = 576;
        sArray2[678] = 577;
        sArray2[679] = 578;
        sArray2[680] = 579;
        sArray2[681] = 580;
        sArray2[682] = 581;
        sArray2[683] = 582;
        sArray2[684] = 583;
        sArray2[685] = 584;
        sArray2[686] = 585;
        sArray2[687] = 586;
        sArray2[688] = 587;
        sArray2[689] = 588;
        sArray2[690] = 589;
        sArray2[691] = 590;
        sArray2[692] = 591;
        sArray2[693] = 592;
        sArray2[694] = 593;
        sArray2[695] = 594;
        sArray2[696] = 595;
        sArray2[697] = 596;
        sArray2[698] = 597;
        sArray2[699] = 598;
        sArray2[700] = 599;
        sArray2[701] = 600;
        sArray2[702] = 601;
        sArray2[703] = 602;
        sArray2[704] = 603;
        sArray2[705] = 604;
        sArray2[706] = 605;
        sArray2[707] = 606;
        sArray2[708] = 607;
        sArray2[709] = 608;
        sArray2[710] = 609;
        sArray2[711] = 610;
        sArray2[712] = 611;
        sArray2[713] = 612;
        sArray2[714] = 613;
        sArray2[715] = 614;
        sArray2[716] = 615;
        sArray2[717] = 616;
        sArray2[718] = 617;
        sArray2[719] = 638;
        sArray2[720] = 639;
        sArray2[721] = 640;
        sArray2[722] = 641;
        sArray2[723] = 642;
        sArray2[724] = 643;
        sArray2[725] = 644;
        sArray2[726] = 645;
        sArray2[727] = 646;
        sArray2[728] = 647;
        sArray2[729] = 648;
        sArray2[730] = 649;
        sArray2[731] = 650;
        sArray2[732] = 651;
        sArray2[733] = 652;
        sArray2[734] = 653;
        sArray2[735] = 654;
        sArray2[736] = 655;
        sArray2[737] = 656;
        sArray2[738] = 657;
        sArray2[739] = 658;
        sArray2[740] = 659;
        sArray2[741] = 660;
        sArray2[742] = 661;
        sArray2[743] = 662;
        sArray2[744] = 663;
        sArray2[745] = 664;
        sArray2[746] = 665;
        sArray2[747] = 666;
        sArray2[748] = 667;
        sArray2[749] = 668;
        sArray2[750] = 669;
        sArray2[751] = 670;
        sArray2[752] = 671;
        sArray2[753] = 672;
        sArray2[754] = 673;
        sArray2[755] = 674;
        sArray2[756] = 675;
        sArray2[757] = 676;
        sArray2[758] = 677;
        sArray2[759] = 678;
        sArray2[760] = 679;
        sArray2[761] = 680;
        sArray2[762] = 681;
        sArray2[763] = 682;
        sArray2[764] = 683;
        sArray2[765] = 684;
        sArray2[766] = 685;
        sArray2[767] = 686;
        sArray2[768] = 687;
        sArray2[769] = 688;
        sArray2[770] = 689;
        sArray2[771] = 690;
        sArray2[772] = 691;
        sArray2[773] = 692;
        sArray2[774] = 693;
        sArray2[775] = 694;
        sArray2[776] = 695;
        sArray2[777] = 696;
        sArray2[778] = 697;
        sArray2[779] = 698;
        sArray2[780] = 699;
        sArray2[781] = 700;
        sArray2[782] = 701;
        sArray2[783] = 702;
        sArray2[784] = 703;
        sArray2[785] = 704;
        sArray2[786] = 705;
        sArray2[787] = 706;
        sArray2[788] = 707;
        sArray2[789] = 708;
        sArray2[790] = 711;
        sArray2[791] = 714;
        sArray2[792] = 717;
        sArray2[793] = 720;
        sArray2[794] = 723;
        sArray2[795] = 726;
        sArray2[796] = 729;
        sArray2[797] = 732;
        sArray2[798] = 733;
        sArray2[799] = 734;
        sArray2[800] = 735;
        sArray2[801] = 736;
        sArray2[802] = 737;
        sArray2[803] = 738;
        sArray2[804] = 739;
        sArray2[805] = 740;
        sArray2[806] = 741;
        sArray2[807] = 742;
        sArray2[808] = 743;
        sArray2[809] = 744;
        sArray2[810] = 745;
        sArray2[811] = 760;
        sArray2[812] = 761;
        sArray2[813] = 762;
        sArray2[814] = 763;
        sArray2[815] = 764;
        sArray2[816] = 765;
        sArray2[817] = 766;
        sArray2[818] = 767;
        sArray2[819] = 768;
        sArray2[820] = 769;
        sArray2[821] = 770;
        sArray2[822] = 771;
        sArray2[823] = 772;
        sArray2[824] = 773;
        sArray2[825] = 774;
        sArray2[826] = 775;
        sArray2[827] = 776;
        sArray2[828] = 777;
        sArray2[829] = 778;
        sArray2[830] = 779;
        sArray2[831] = 780;
        sArray2[832] = 781;
        sArray2[833] = 782;
        sArray2[834] = 783;
        sArray2[835] = 784;
        sArray2[836] = 785;
        sArray2[837] = 786;
        sArray2[838] = 787;
        sArray2[839] = 788;
        sArray2[840] = 789;
        sArray2[841] = 790;
        sArray2[842] = 791;
        sArray2[843] = 792;
        sArray2[844] = 793;
        sArray2[845] = 794;
        sArray2[846] = 797;
        sArray2[847] = 798;
        sArray2[848] = 801;
        sArray2[849] = 802;
        sArray2[850] = 803;
        sArray2[851] = 804;
        sArray2[852] = 807;
        sArray2[853] = 808;
        sArray2[854] = 809;
        sArray2[855] = 810;
        sArray2[856] = 811;
        sArray2[857] = 812;
        sArray2[858] = 813;
        sArray2[859] = 814;
        sArray2[860] = 815;
        sArray2[861] = 816;
        sArray2[862] = 817;
        sArray2[863] = 818;
        sArray2[864] = 819;
        sArray2[865] = 820;
        sArray2[866] = 821;
        sArray2[867] = 822;
        sArray2[868] = 823;
        sArray2[869] = 824;
        sArray2[870] = 825;
        sArray2[871] = 826;
        sArray2[872] = 827;
        sArray2[873] = 828;
        sArray2[874] = 829;
        sArray2[875] = 830;
        sArray2[876] = 831;
        sArray2[877] = 832;
        sArray2[878] = 833;
        sArray2[879] = 834;
        sArray2[880] = 835;
        sArray2[881] = 836;
        sArray2[882] = 837;
        sArray2[883] = 838;
        sArray2[884] = 839;
        sArray2[885] = 840;
        sArray2[886] = 841;
        sArray2[887] = 842;
        sArray2[888] = 843;
        sArray2[889] = 844;
        sArray2[890] = 845;
        sArray2[891] = 846;
        sArray2[892] = 847;
        sArray2[893] = 848;
        sArray2[894] = 850;
        sArray2[895] = 851;
        sArray2[896] = 852;
        sArray2[897] = 853;
        sArray2[898] = 854;
        sArray2[899] = 855;
        sArray2[900] = 856;
        sArray2[901] = 857;
        sArray2[902] = 858;
        sArray2[903] = 859;
        sArray2[904] = 860;
        sArray2[905] = 861;
        sArray2[906] = 862;
        sArray2[907] = 863;
        sArray2[908] = 864;
        sArray2[909] = 865;
        sArray2[910] = 866;
        sArray2[911] = 867;
        sArray2[912] = 868;
        sArray2[913] = 869;
        sArray2[914] = 870;
        sArray2[915] = 871;
        sArray2[916] = 872;
        sArray2[917] = 873;
        sArray2[918] = 874;
        sArray2[919] = 875;
        sArray2[920] = 876;
        sArray2[921] = 877;
        sArray2[922] = 878;
        sArray2[923] = 879;
        sArray2[924] = 880;
        sArray2[925] = 881;
        sArray2[926] = 882;
        sArray2[927] = 883;
        sArray2[928] = 884;
        sArray2[929] = 885;
        sArray2[930] = 886;
        sArray2[931] = 887;
        sArray2[932] = 888;
        sArray2[933] = 889;
        sArray2[934] = 890;
        sArray2[935] = 891;
        sArray2[936] = 892;
        sArray2[937] = 893;
        sArray2[938] = 894;
        sArray2[939] = 895;
        sArray2[940] = 896;
        sArray2[941] = 897;
        sArray2[942] = 898;
        sArray2[943] = 899;
        sArray2[944] = 900;
        sArray2[945] = 901;
        sArray2[946] = 902;
        sArray2[947] = 903;
        sArray2[948] = 904;
        sArray2[949] = 905;
        sArray2[950] = 906;
        sArray2[951] = 907;
        sArray2[952] = 908;
        sArray2[953] = 909;
        sArray2[954] = 910;
        sArray2[955] = 911;
        sArray2[956] = 912;
        sArray2[957] = 913;
        sArray2[958] = 914;
        sArray2[959] = 915;
        sArray2[960] = 916;
        sArray2[961] = 917;
        sArray2[962] = 918;
        sArray2[963] = 919;
        sArray2[964] = 920;
        sArray2[965] = 921;
        sArray2[966] = 922;
        sArray2[967] = 923;
        sArray2[968] = 924;
        sArray2[969] = 925;
        sArray2[970] = 926;
        sArray2[971] = 927;
        sArray2[972] = 928;
        sArray2[973] = 929;
        sArray2[974] = 930;
        sArray2[975] = 931;
        sArray2[976] = 932;
        sArray2[977] = 933;
        sArray2[978] = 934;
        sArray2[979] = 935;
        sArray2[980] = 936;
        sArray2[981] = 937;
        sArray2[982] = 938;
        sArray2[983] = 939;
        sArray2[984] = 940;
        sArray2[985] = 941;
        sArray2[986] = 942;
        sArray2[987] = 943;
        sArray2[988] = 944;
        sArray2[989] = 945;
        sArray2[990] = 946;
        sArray2[991] = 947;
        sArray2[992] = 948;
        sArray2[993] = 949;
        sArray2[994] = 950;
        sArray2[995] = 951;
        sArray2[996] = 952;
        sArray2[997] = 953;
        sArray2[998] = 954;
        sArray2[999] = 955;
        sArray2[1000] = 956;
        sArray2[1001] = 957;
        sArray2[1002] = 958;
        sArray2[1003] = 959;
        sArray2[1004] = 960;
        sArray2[1005] = 961;
        sArray2[1006] = 962;
        sArray2[1007] = 963;
        sArray2[1008] = 964;
        sArray2[1009] = 965;
        sArray2[1010] = 966;
        sArray2[1011] = 967;
        sArray2[1012] = 968;
        sArray2[1013] = 969;
        sArray2[1014] = 970;
        sArray2[1015] = 971;
        sArray2[1016] = 972;
        sArray2[1017] = 973;
        sArray2[1018] = 974;
        sArray2[1019] = 975;
        sArray2[1020] = 976;
        sArray2[1021] = 977;
        sArray2[1022] = 978;
        sArray2[1023] = 979;
        sArray2[1024] = 980;
        sArray2[1025] = 981;
        sArray2[1026] = 982;
        sArray2[1027] = 983;
        sArray2[1028] = 984;
        sArray2[1029] = 985;
        sArray2[1030] = 986;
        sArray2[1031] = 987;
        sArray2[1032] = 988;
        sArray2[1033] = 989;
        sArray2[1034] = 990;
        sArray2[1035] = 991;
        sArray2[1036] = 992;
        sArray2[1037] = 993;
        sArray2[1038] = 994;
        sArray2[1039] = 995;
        sArray2[1040] = 996;
        sArray2[1041] = 997;
        sArray2[1042] = 998;
        sArray2[1043] = 999;
        sArray2[1044] = 1000;
        sArray2[1045] = 1001;
        sArray2[1046] = 1002;
        sArray2[1047] = 1003;
        sArray2[1048] = 1004;
        sArray2[1049] = 1005;
        sArray2[1050] = 1006;
        sArray2[1051] = 1007;
        sArray2[1052] = 1008;
        sArray2[1053] = 1009;
        sArray2[1054] = 1010;
        sArray2[1055] = 1011;
        sArray2[1056] = 1012;
        sArray2[1057] = 1013;
        sArray2[1058] = 1014;
        sArray2[1059] = 1015;
        sArray2[1060] = 1016;
        sArray2[1061] = 1017;
        sArray2[1062] = 1018;
        sArray2[1063] = 1019;
        sArray2[1064] = 1020;
        sArray2[1065] = 1021;
        sArray2[1066] = 1022;
        sArray2[1067] = 1023;
        sArray2[1068] = 1024;
        sArray2[1069] = 1025;
        sArray2[1070] = 1026;
        sArray2[1071] = 1027;
        sArray2[1072] = 1028;
        sArray2[1073] = 1029;
        sArray2[1074] = 1030;
        sArray2[1075] = 1031;
        sArray2[1076] = 1032;
        sArray2[1077] = 1033;
        sArray2[1078] = 1034;
        sArray2[1079] = 1035;
        sArray2[1080] = 1036;
        sArray2[1081] = 1037;
        sArray2[1082] = 1038;
        sArray2[1083] = 1039;
        sArray2[1084] = 1040;
        sArray2[1085] = 1041;
        sArray2[1086] = 1042;
        sArray2[1087] = 1043;
        sArray2[1088] = 1044;
        sArray2[1089] = 1045;
        sArray2[1090] = 1046;
        sArray2[1091] = 1047;
        sArray2[1092] = 1048;
        sArray2[1093] = 1049;
        sArray2[1094] = 1050;
        sArray2[1095] = 1051;
        sArray2[1096] = 1052;
        sArray2[1097] = 1053;
        sArray2[1098] = 1054;
        sArray2[1099] = 1055;
        sArray2[1100] = 1056;
        sArray2[1101] = 1057;
        sArray2[1102] = 1058;
        sArray2[1103] = 1059;
        sArray2[1104] = 1060;
        sArray2[1105] = 1061;
        sArray2[1106] = 1062;
        sArray2[1107] = 1063;
        sArray2[1108] = 1064;
        sArray2[1109] = 1065;
        sArray2[1110] = 1066;
        sArray2[1111] = 1067;
        sArray2[1112] = 1068;
        sArray2[1113] = 1069;
        sArray2[1114] = 1070;
        sArray2[1115] = 1071;
        sArray2[1116] = 1072;
        sArray2[1117] = 1073;
        sArray2[1118] = 1074;
        sArray2[1119] = 1075;
        sArray2[1120] = 1076;
        sArray2[1121] = 1077;
        sArray2[1122] = 1078;
        sArray2[1123] = 1079;
        sArray2[1124] = 1080;
        sArray2[1125] = 1081;
        sArray2[1126] = 1082;
        sArray2[1127] = 1085;
        sArray2[1128] = 1086;
        sArray2[1129] = 1087;
        sArray2[1130] = 1088;
        sArray2[1131] = 1089;
        sArray2[1132] = 1090;
        sArray2[1133] = 1091;
        sArray2[1134] = 1094;
        sArray2[1135] = 1095;
        sArray2[1136] = 1096;
        sArray2[1137] = 1118;
        sArray2[1138] = 1119;
        sArray2[1139] = 1120;
        sArray2[1140] = 1121;
        sArray2[1141] = 1122;
        sArray2[1142] = 1123;
        sArray2[1143] = 1124;
        sArray2[1144] = 1125;
        sArray2[1145] = 1126;
        sArray2[1146] = 1127;
        sArray2[1147] = 1128;
        sArray2[1148] = 1129;
        sArray2[1149] = 1130;
        sArray2[1150] = 1131;
        sArray2[1151] = 1132;
        sArray2[1152] = 1133;
        sArray2[1153] = 1134;
        sArray2[1154] = 1135;
        sArray2[1155] = 1136;
        sArray2[1156] = 1137;
        sArray2[1157] = 1138;
        sArray2[1158] = 1139;
        sArray2[1159] = 1140;
        sArray2[1160] = 1141;
        sArray2[1161] = 1142;
        sArray2[1162] = 1143;
        sArray2[1163] = 1144;
        sArray2[1164] = 1145;
        sArray2[1165] = 1149;
        sArray2[1166] = 1150;
        sArray2[1167] = 1151;
        sArray2[1168] = 1152;
        sArray2[1169] = 1153;
        sArray2[1170] = 1154;
        sArray2[1171] = 1155;
        sArray2[1172] = 1158;
        sArray2[1173] = 1159;
        sArray2[1174] = 1162;
        sArray2[1175] = 1177;
        sArray2[1176] = 1178;
        sArray2[1177] = 1179;
        sArray2[1178] = 1180;
        sArray2[1179] = 1181;
        sArray2[1180] = 1182;
        sArray2[1181] = 1183;
        sArray2[1182] = 1184;
        sArray2[1183] = 1185;
        sArray2[1184] = 1186;
        sArray2[1185] = 1187;
        sArray2[1186] = 1188;
        sArray2[1187] = 1189;
        sArray2[1188] = 1190;
        sArray2[1189] = 1191;
        sArray2[1190] = 1194;
        sArray2[1191] = 1197;
        sArray2[1192] = 1200;
        sArray2[1193] = 1203;
        sArray2[1194] = 1206;
        sArray2[1195] = 1207;
        sArray2[1196] = 1208;
        sArray2[1197] = 1209;
        sArray2[1198] = 1210;
        av = sArray2;
        aA = true;
        aB = new boolean[30];
        aM = new int[6];
        aO = -1;
        ba = new short[3];
        bb = new short[3];
        be = 17;
        bq = -1;
        br = -1;
        bt = 324508639;
        bu = new int[4];
        bw = new long[300];
        bx = -1;
        by = new long[300];
        bz = -1;
    }

    private k5() {
    }

    static void a() {
        k5.I();
        boolean bl = false;
        int n = 0;
        while (n < aw.length) {
            if (k5.aw[n].F == 3) {
                k5.a(aw[n], n);
                bl = true;
            }
            ++n;
        }
        if (bl) {
            k5.M();
        }
        az = false;
        aK = 0;
        aL = false;
        aN = 0;
        aO = -1;
        bi = 0;
        bj = 0;
        bk = 0;
        k5.T();
        aP = 0;
        aQ = 0;
        aR = 0;
        aS = 0;
        aT = 0L;
        aU = 0L;
        aV = 0;
        aW = 0;
        aX = 0;
        aY = 0;
        aZ = 0;
        int n2 = 0;
        while (n2 < ba.length) {
            k5.ba[n2] = -1;
            k5.bb[n2] = 0;
            ++n2;
        }
        bc = 0;
        bd = 0;
        int n3 = k5.am();
        int n4 = k5.an();
        int n5 = k5.aq();
        boolean bl2 = false;
        int n6 = 0;
        while (n6 < aw.length) {
            k0 k02 = aw[n6];
            if ((k02.G & n5) == 0) {
                k02.G |= n3 | n5;
                bl2 = true;
            }
            if ((k02.G & n3) != 0) {
                bc |= 1 << n6;
            }
            if ((k02.H & n4) != 0) {
                bd |= 1 << n6;
            }
            ++n6;
        }
        if (bl2) {
            k5.M();
        }
        int n7 = 0;
        while (n7 < aB.length) {
            k5.aB[n7] = false;
            ++n7;
        }
        aC = 0L;
        aD = 0L;
        aE = 0L;
        aF = System.currentTimeMillis() + 30000L;
        aG = 0L;
        aH = System.currentTimeMillis() + 30000L;
        aI = 0L;
        bv = 0;
        bx = -1;
        bz = -1;
        n6 = 0;
        while (n6 < bw.length) {
            k5.bw[n6] = 0L;
            ++n6;
        }
        n6 = 0;
        while (n6 < by.length) {
            k5.by[n6] = 0L;
            ++n6;
        }
        aJ = false;
        bg = false;
        bh = System.currentTimeMillis() + 30000L;
        k5.E();
    }

    static void b() {
        ax = false;
        ay = 0;
        aw = null;
        az = false;
        bd = 0;
        bc = 0;
        aK = 0;
        aN = 0;
    }

    static boolean c() throws Exception {
        k5.I();
        boolean bl = aA = !aA;
        if (!aA) {
            if (aQ != 0) {
                k5.Y();
            }
            if (aP != 0) {
                k5.ac();
            }
            if (aR != 0) {
                k5.ae();
            }
            k5.V();
            int n = 0;
            while (n < aw.length) {
                k5.aw[n].ad = false;
                ++n;
            }
            if (az) {
                k5.O();
            }
        } else if (az) {
            k5.a(System.currentTimeMillis());
            k5.O();
        }
        k5.M();
        return aA;
    }

    static boolean d() {
        k5.I();
        return aA;
    }

    private static boolean F() throws Exception {
        if (aA) {
            return false;
        }
        DoHoang091.a("Bot \u0111ang t\u1eaft. M\u1edf t\u1ea1i NPC Admin > B\u1eadt/T\u1eaft Bot.");
        return true;
    }

    static void e() {
        k5.I();
        az = true;
        try {
            k5.a(System.currentTimeMillis());
            k5.O();
        }
        catch (Exception exception) {}
    }

    static void f() {
        if (!az) {
            return;
        }
        try {
            if (aP != 0) {
                k5.c(true);
            }
        }
        catch (Exception exception) {}
        try {
            if (aR != 0) {
                k5.ae();
            }
        }
        catch (Exception exception) {}
        aS = 0;
        aT = 0L;
        aO = -1;
        k5.G();
        aJ = true;
    }

    static void g() {
        if (!az || aK == 0) {
            return;
        }
        long l = System.currentTimeMillis();
        int n = k5.K(Math.max(0, aN - 1));
        while (n-- > 0) {
            k0 k02 = k5.ar();
            if (k02 == null) continue;
            long l2 = k5.T(k02);
            if (k02.af != 0L && k02.af <= l + l2) continue;
            k02.af = l + l2;
        }
    }

    private static void G() {
        if (!az || aK == 0) {
            return;
        }
        try {
            k5.a(false);
        }
        catch (Exception exception) {}
    }

    private static void a(boolean bl) throws Exception {
        if (bl) {
            k5.g();
            return;
        }
        int n = DoHoang091.r();
        if (k14.a(n)) {
            return;
        }
        int n2 = k5.ak();
        int n3 = DoHoang091.u();
        int n4 = DoHoang091.v();
        k5.c(n, n2, n3, n4);
        boolean bl2 = false;
        int n5 = 0;
        while (n5 < aN) {
            int n6;
            k0 k02 = k5.af(aM[n5]);
            if (k02 != null && (n6 = k5.U(k02)) >= 0 && (aK & 1 << n6) != 0) {
                boolean bl3 = k02.A != n || k02.B != n2 || !k02.ad;
                int n7 = k5.t(k02);
                if (n7 >= 0) {
                    int n8 = s[n7];
                    int n9 = t[n7];
                    if (k02.A != n || k02.B != n2 || k02.C != (short)n8 || k02.D != (short)n9 || !k02.ad) {
                        bl2 = true;
                    }
                    k02.A = n;
                    k02.B = n2;
                    k02.C = (short)n8;
                    k02.D = (short)n9;
                    k02.ad = true;
                    if (bl3) {
                        k5.aB[n6] = false;
                    }
                    k02.af = System.currentTimeMillis() + k5.T(k02);
                    if (bl) {
                        if (!aB[n6]) {
                            k5.P(n6);
                        } else {
                            k5.b(k02);
                        }
                    }
                }
            }
            ++n5;
        }
        if (bl2) {
            k5.N();
        }
    }

    static void h() {
        if (!az || !aA) {
            return;
        }
        k5.I();
        long l = System.currentTimeMillis();
        try {
            if (aJ) {
                k5.a(l);
                k5.O();
                aJ = false;
            }
            if (l >= aC) {
                k5.a(l);
                k5.O();
                aC = l + 5000L;
            }
            k5.g(l);
            k5.h(l);
            k5.d(l);
            k5.ad();
            k5.e(l);
            k5.f(l);
            k5.b(l);
            k5.k(l);
            if (l >= aE) {
                boolean bl = k5.i(l);
                aE = l + (bl ? 420L : 250L);
            }
            if (l >= aF) {
                k5.j(l);
                aF = l + 30000L;
            }
            if (l >= aD) {
                k5.n(l);
                k5.aj();
                k5.o(l);
                aD = l + 120L;
            }
            if (bg && l >= bh) {
                k5.M();
                bg = false;
                bh = l + 30000L;
            }
        }
        catch (Exception exception) {}
    }

    static void i() {
        if (ax) {
            k5.M();
        }
    }

    static boolean a(byte by, byte[] byArray) throws Exception {
        if (by == 25) {
            k5.a(byArray);
            return true;
        }
        if (by == 93) {
            String string = k5.b(byArray, 0);
            k0 k02 = k5.i(string);
            if (k02 == null && byArray != null && byArray.length >= 4) {
                k02 = k5.af(k5.a(byArray, 0));
            }
            if (k02 == null) {
                return k19.a(by, byArray);
            }
            k5.f(k02);
            return true;
        }
        if (by == 94) {
            int n = k5.a(byArray, 0);
            k0 k03 = k5.af(n);
            if (k03 == null) {
                return k19.a(by, byArray);
            }
            k5.a(k03, byArray);
            return true;
        }
        return false;
    }

    static boolean b(byte by, byte[] byArray) throws Exception {
        if (by == -22) {
            return k5.c(by, byArray);
        }
        if (by == -87) {
            k5.T(k5.c(byArray));
            return true;
        }
        if (by == -86) {
            k5.S(k5.c(byArray));
            return true;
        }
        if (by == 59) {
            String string = k5.b(byArray, 0);
            k0 k02 = k5.i(string);
            if (k02 == null) {
                return false;
            }
            if (k02.a == DoHoang091.s()) {
                return true;
            }
            int n = 1 << k5.U(k02);
            if ((bc & n) == 0) {
                bc |= n;
                k02.G |= k5.am();
                k5.N();
            }
            k5.a(k02, (byte)1);
            k2e.k();
            return true;
        }
        if (by == 79 || by == 23) {
            if (k5.F()) {
                return true;
            }
            String string = k5.b(byArray, 0);
            k0 k03 = k5.i(string);
            if (k03 == null) {
                return true;
            }
            k5.i(k03);
            return true;
        }
        if (by == 80 || by == 24) {
            if (k5.F()) {
                return true;
            }
            int n = k5.a(byArray, 0);
            k0 k04 = k5.af(n);
            if (k04 == null) {
                String string = k5.b(byArray, 0);
                k04 = k5.i(string);
            }
            if (k04 != null) {
                k5.i(k04);
            }
            return true;
        }
        if (by == 81) {
            k5.U();
            return true;
        }
        if (by == 82) {
            k5.U();
            return true;
        }
        if (by == 83) {
            k5.V();
            return true;
        }
        if (by == 43 || by == 44) {
            if (k5.F()) {
                return true;
            }
            int n = k5.a(byArray, 0);
            k0 k05 = k5.af(n);
            if (k05 == null) {
                return true;
            }
            k5.j(k05);
            return true;
        }
        if (by == 45) {
            if (aQ != 0) {
                k5.k(k5.af(aQ));
            }
            return true;
        }
        if (by == 46) {
            k5.X();
            return true;
        }
        if (by == 56 || by == 57) {
            k5.Y();
            return true;
        }
        if (by == 65) {
            if (k5.F()) {
                return true;
            }
            k0 k06 = k5.af(k5.a(byArray, 0));
            if (k06 != null) {
                k5.m(k06);
            }
            return true;
        }
        if (by == 66) {
            if (k5.F()) {
                return true;
            }
            k0 k07 = k5.af(k5.a(byArray, 0));
            if (k07 != null) {
                k5.m(k07);
            }
            return true;
        }
        if (by == 67) {
            k5.ab();
            return true;
        }
        if (by == 61) {
            if (k2e.b(byArray)) {
                return true;
            }
            if (k3.b(byArray)) {
                return true;
            }
            k5.e(byArray);
            return true;
        }
        if (by == 68) {
            if (k5.F()) {
                return true;
            }
            k0 k08 = k5.af(k5.a(byArray, 0));
            if (k08 != null) {
                k5.r(k08);
            }
            return true;
        }
        if (by == 70) {
            k5.ae();
            return true;
        }
        return false;
    }

    static boolean a(int n, byte[] byArray) throws Exception {
        if (n == -85) {
            k5.P();
            return true;
        }
        if (n == -83) {
            String string = k5.b(byArray, 1);
            k0 k02 = k5.i(string);
            if (k02 == null) {
                return false;
            }
            int n2 = 1 << k5.U(k02);
            bc &= ~n2;
            k02.G &= ~k5.am();
            k5.N();
            k5.h(k02);
            return true;
        }
        if (n == -77) {
            k5.W();
            return true;
        }
        if (n == -88) {
            if (k5.F()) {
                return true;
            }
            k5.Q();
            k5.U();
            return true;
        }
        if (n == -76) {
            if (aN > 0 && k5.R()) {
                aL = byArray != null && byArray.length > 1 && byArray[1] != 0;
                DoHoang091.a((byte)-30, new byte[]{-76, (byte)(aL ? 1 : 0)});
            }
            return true;
        }
        if (n == -87) {
            k5.T(k5.d(byArray));
            return true;
        }
        if (n == -86) {
            k5.S(k5.d(byArray));
            return true;
        }
        if (n == -63 || n == -61) {
            if (k5.F()) {
                return true;
            }
            if (DoHoang091.z().cb[0] <= 0) {
                DoHoang091.a("B\u1ea1n kh\u00f4ng c\u00f3 gia t\u1ed9c.");
                return true;
            }
            int n3 = k5.a(byArray, 1);
            k0 k03 = k5.af(n3);
            if (k03 != null && !k5.M(k03)) {
                if (1 + k5.j() >= k5.ap()) {
                    DoHoang091.a("Gia t\u1ed9c \u0111\u00e3 \u0111\u1ee7 th\u00e0nh vi\u00ean.");
                    return true;
                }
                k5.O(k03);
                k5.N();
                k5.y(k03);
                k5.O();
            }
            return true;
        }
        if (n == -62 || n == -60) {
            if (k5.F()) {
                return true;
            }
            if (DoHoang091.z().cb[0] <= 0) {
                DoHoang091.a("B\u1ea1n kh\u00f4ng c\u00f3 gia t\u1ed9c.");
                return true;
            }
            int n4 = k5.a(byArray, 1);
            k0 k04 = k5.af(n4);
            if (k04 != null && !k5.M(k04)) {
                if (1 + k5.j() >= k5.ap()) {
                    DoHoang091.a("Gia t\u1ed9c \u0111\u00e3 \u0111\u1ee7 th\u00e0nh vi\u00ean.");
                    return true;
                }
                k5.O(k04);
                k5.N();
                k5.y(k04);
                k5.O();
            }
            return true;
        }
        return false;
    }

    static int j() {
        k5.I();
        int n = 0;
        int n2 = 0;
        while (n2 < aw.length) {
            if ((bd & 1 << n2) != 0) {
                ++n;
            }
            ++n2;
        }
        return n;
    }

    static void a(DataOutputStream dataOutputStream) throws Exception {
        k5.I();
        int n = 0;
        while (n < aw.length) {
            if ((bd & 1 << n) != 0) {
                dataOutputStream.writeByte(k5.aw[n].d);
                dataOutputStream.writeByte(k5.aw[n].j);
                dataOutputStream.writeByte(k5.N(aw[n]));
                dataOutputStream.writeUTF(k5.aw[n].b);
                dataOutputStream.writeInt(k5.aw[n].K);
                dataOutputStream.writeBoolean(k5.aw[n].ad);
            }
            ++n;
        }
    }

    static void b(DataOutputStream dataOutputStream) throws Exception {
        k5.I();
        int n = 0;
        while (n < aw.length) {
            if ((bd & 1 << n) != 0) {
                dataOutputStream.writeInt(0);
            }
            ++n;
        }
    }

    static void k() {
        k5.I();
        bd = 0;
    }

    static void l() {
        k5.I();
        boolean bl = false;
        int n = 0;
        while (n < aw.length) {
            k0 k02 = aw[n];
            if (k5.M(k02)) {
                k5.P(k02);
                bl = true;
            }
            ++n;
        }
        if (bl) {
            k5.N();
        }
        try {
            k5.O();
        }
        catch (Exception exception) {}
    }

    static int a(String string) {
        k5.I();
        k0 k02 = k5.i(string);
        return k02 != null && k5.M(k02) ? k5.N(k02) : -1;
    }

    static int b(String string) {
        k5.I();
        k0 k02 = k5.i(string);
        if (k02 == null || !k5.M(k02) || !k02.ad) {
            return -1;
        }
        return k5.U(k02);
    }

    static int a(int n) {
        k5.I();
        int n2 = 0;
        int n3 = 0;
        while (n3 < aw.length) {
            if ((bd & 1 << n3) != 0 && k5.N(aw[n3]) == n) {
                ++n2;
            }
            ++n3;
        }
        return n2;
    }

    static boolean a(String string, int n) {
        k5.I();
        k0 k02 = k5.i(string);
        if (k02 == null || !k5.M(k02)) {
            return false;
        }
        k5.n(k02, n);
        k5.N();
        return true;
    }

    static boolean c(String string) {
        k5.I();
        k0 k02 = k5.i(string);
        if (k02 == null || !k5.M(k02)) {
            return false;
        }
        k5.P(k02);
        k5.N();
        try {
            k5.O();
        }
        catch (Exception exception) {}
        return true;
    }

    static String m() {
        k5.I();
        return "Gia t\u1ed9c | " + (1 + k5.j()) + " th\u00e0nh vi\u00ean (" + k5.H() + " \u0111ang tr\u1ef1c tuy\u1ebfn)";
    }

    private static int H() {
        int n = 0;
        int n2 = 0;
        while (n2 < aw.length) {
            if ((bd & 1 << n2) != 0 && k5.aw[n2].ad) {
                ++n;
            }
            ++n2;
        }
        return n;
    }

    static int n() {
        k5.I();
        int n = 0;
        int n2 = 0;
        while (n2 < aw.length) {
            if (k5.aw[n2].ad) {
                ++n;
            }
            ++n2;
        }
        return n;
    }

    static int o() throws Exception {
        k5.I();
        int n = DoHoang091.r();
        int n2 = k5.ak();
        int n3 = 0;
        int n4 = 0;
        while (n4 < aw.length) {
            if (k5.aw[n4].ad && k5.aw[n4].A == n && k5.aw[n4].B == n2) {
                ++n3;
            }
            ++n4;
        }
        return n3;
    }

    static int a(int n, int n2, int n3) throws Exception {
        k5.I();
        int n4 = DoHoang091.r();
        int n5 = k5.ak();
        long l = (long)n3 * (long)n3;
        int n6 = 0;
        int n7 = 0;
        while (n7 < aw.length) {
            long l2;
            long l3;
            k0 k02 = aw[n7];
            if (k02.ad && k02.A == n4 && k02.B == n5 && (l3 = (long)k02.C - (long)n) * l3 + (l2 = (long)k02.D - (long)n2) * l2 < l) {
                ++n6;
            }
            ++n7;
        }
        return n6;
    }

    static String a(int n, int n2) throws Exception {
        k5.I();
        int n3 = DoHoang091.r();
        int n4 = k5.ak();
        k0 k02 = null;
        long l = Long.MAX_VALUE;
        int n5 = 0;
        while (n5 < aw.length) {
            long l2;
            long l3;
            long l4;
            k0 k03 = aw[n5];
            if (k03.ad && k03.A == n3 && k03.B == n4 && (l4 = (l3 = (long)k03.C - (long)n) * l3 + (l2 = (long)k03.D - (long)n2) * l2) < l) {
                l = l4;
                k02 = k03;
            }
            ++n5;
        }
        return k02 == null ? null : k02.b;
    }

    static int p() {
        k5.I();
        return aw.length;
    }

    static int b(int n) {
        k5.I();
        if (aw.length == 0) {
            return 0;
        }
        if (n < 0) {
            n = -n;
        }
        return k5.aw[n % k5.aw.length].a;
    }

    static int c(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : k02.L;
    }

    static void b(int n, int n2) {
        if (n2 <= 0) {
            return;
        }
        k5.I();
        k0 k02 = k5.af(n);
        if (k02 == null) {
            return;
        }
        k02.L = k02.L > Integer.MAX_VALUE - n2 ? Integer.MAX_VALUE : (k02.L += n2);
        k5.N();
    }

    static int d(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : k02.M;
    }

    static void c(int n, int n2) {
        if (n2 <= 0) {
            return;
        }
        k5.I();
        k0 k02 = k5.af(n);
        if (k02 == null) {
            return;
        }
        k02.M = k5.k(k02.M, n2);
        k5.N();
    }

    static int e(int n) {
        k5.I();
        int n2 = n - 1;
        return n2 >= 0 && n2 < bu.length ? bu[n2] : 0;
    }

    static void d(int n, int n2) {
        if (n2 <= 0) {
            return;
        }
        k5.I();
        int n3 = n - 1;
        if (n3 < 0 || n3 >= bu.length) {
            return;
        }
        k5.bu[n3] = k5.k(bu[n3], n2);
        k5.N();
    }

    static int q() {
        k5.I();
        return bq;
    }

    static int r() {
        k5.I();
        return br;
    }

    static int s() {
        k5.I();
        return bs;
    }

    static int t() {
        k5.I();
        return bt;
    }

    static void a(int n, int n2, int n3, int n4) {
        k5.I();
        if (bq == n && br == n2 && bs == n3 && bt == n4) {
            return;
        }
        bq = n;
        br = n2;
        bs = n3;
        bt = n4 == 0 ? 324508639 : n4;
        k5.N();
    }

    static void a(int n, int n2, int n3, int n4, int n5, boolean bl) {
        k5.I();
        bq = n;
        br = n2;
        bs = n3;
        int n6 = bt = n4 == 0 ? 324508639 : n4;
        if (bl) {
            if (n5 > 0) {
                k0 k02 = k5.af(n5);
                if (k02 != null) {
                    k02.M = k5.k(k02.M, 1);
                }
            } else {
                int n7 = DoHoang091.s() - 1;
                if (n7 >= 0 && n7 < bu.length) {
                    k5.bu[n7] = k5.k(bu[n7], 1);
                }
            }
        }
        k5.N();
    }

    private static int k(int n, int n2) {
        return n > Integer.MAX_VALUE - n2 ? Integer.MAX_VALUE : n + n2;
    }

    static String u() {
        k5.I();
        return aw.length == 0 ? "Ninja" : k5.aw[0].b;
    }

    static int v() {
        k5.I();
        return aw.length == 0 ? 0 : k5.aw[0].a;
    }

    static int w() {
        k5.I();
        return 0;
    }

    static int d(String string) {
        k5.I();
        k0 k02 = k5.i(string);
        return k02 == null ? 0 : k02.a;
    }

    static int f(int n) {
        k5.I();
        return n >= 0 && n < aw.length ? k5.aw[n].a : 0;
    }

    static int g(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? -1 : k5.U(k02);
    }

    static boolean h(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        int n2 = k5.U(k02);
        return k02 != null && (k02.F == 3 || n2 >= 0 && (bv & 1 << n2) != 0);
    }

    static boolean e(int n, int n2) {
        int n3;
        k5.I();
        k0 k02 = k5.af(n);
        k0 k03 = k5.af(n2);
        int n4 = k5.U(k02);
        int n5 = k5.U(k03);
        int n6 = n3 = n4 < 0 || n5 < 0 ? 0 : 1 << n4 | 1 << n5;
        if (k02 == null || k03 == null || n4 < 0 || n5 < 0 || n4 == n5 || k02.F == 3 || k03.F == 3 || k02.U || k03.U || (aK & n3) != 0 || k02.a == aP || k03.a == aP || k02.a == aR || k03.a == aR || (bv & n3) != 0) {
            return false;
        }
        bv |= n3;
        k02.ad = true;
        k03.ad = true;
        return true;
    }

    static void f(int n, int n2) {
        k5.I();
        int n3 = k5.U(k5.af(n));
        int n4 = k5.U(k5.af(n2));
        if (n3 >= 0) {
            bv &= ~(1 << n3);
        }
        if (n4 >= 0) {
            bv &= ~(1 << n4);
        }
    }

    static boolean e(String string) throws Exception {
        k5.I();
        k0 k02 = k5.i(string);
        if (k02 == null) {
            return false;
        }
        k5.f(k02);
        return true;
    }

    static int i(int n) {
        k5.I();
        k0 k02 = null;
        int n2 = Integer.MAX_VALUE;
        int n3 = 0;
        while (n3 < aw.length) {
            if ((aK & 1 << n3) == 0 && !k5.h(k5.aw[n3].a)) {
                int n4 = Math.abs(k5.aw[n3].j - n);
                if (k02 == null || n4 < n2) {
                    k02 = aw[n3];
                    n2 = n4;
                }
            }
            ++n3;
        }
        if (k02 == null && aw.length > 0) {
            k02 = aw[0];
        }
        return k02 == null ? 0 : k02.a;
    }

    static String j(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? "" : k02.b;
    }

    static int k(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 1 : k02.j;
    }

    static int l(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 1 : Math.max(1, k02.k);
    }

    static int m(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 1 : Math.max(1, k02.o);
    }

    static int n(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : k02.aw & 0xFF;
    }

    static String o(int n) {
        int n2 = k5.n(n);
        if (n2 == 1) {
            return "aggressive";
        }
        if (n2 == 2) {
            return "merchant";
        }
        if (n2 == 3) {
            return "support";
        }
        if (n2 == 4) {
            return "duelist";
        }
        return "balanced";
    }

    static int p(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? (byte)1 : k02.ax;
    }

    static int q(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? -1 : k02.ay;
    }

    static String r(int n) {
        int n2 = k5.p(n);
        if (n2 == 2) {
            return "escort";
        }
        if (n2 == 3) {
            return "boss";
        }
        if (n2 == 4) {
            return "event";
        }
        if (n2 == 5) {
            return "clan-defense";
        }
        if (n2 == 6) {
            return "trade";
        }
        return "quest";
    }

    static int s(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : Math.max(0, k02.aA);
    }

    static int t(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : Math.max(0, k02.aB);
    }

    static int u(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : Math.max(0, k02.aC);
    }

    static int v(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : Math.max(0, k02.aD);
    }

    static int w(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? -1 : (int)k02.aE;
    }

    static int x(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k02 == null ? 0 : Math.max(0, k02.aI);
    }

    static boolean f(String string) {
        k5.I();
        return k5.M(k5.i(string));
    }

    static String y(int n) {
        k5.I();
        k0 k02 = k5.af(n);
        return k5.z(k02);
    }

    static int b(String string, int n) {
        k5.I();
        return 0;
    }

    static boolean z(int n) throws Exception {
        return k5.a(n, 129, 0, 432, 288);
    }

    static boolean A(int n) throws Exception {
        boolean bl = k5.a(n, 129, 0, 565, 264);
        if (bl) {
            k5.l(n, 3);
        }
        return bl;
    }

    static boolean B(int n) throws Exception {
        return k5.a(n, 161, 0, 565, 384);
    }

    static boolean C(int n) throws Exception {
        boolean bl = k5.a(n, 110, 0, 394, 264);
        if (bl) {
            k5.l(n, 0);
        }
        return bl;
    }

    static boolean D(int n) throws Exception {
        return k5.g(n, 2);
    }

    static boolean g(int n, int n2) throws Exception {
        int n3 = n2 == 1 ? 1 : 2;
        boolean bl = k5.a(n, 160, 0, n3 == 1 ? 205 : 565, 264);
        if (bl) {
            k5.l(n, n3 == 1 ? 4 : 5);
        }
        return bl;
    }

    static int h(int n, int n2) {
        k5.I();
        if (aw == null || aw.length == 0) {
            return 0;
        }
        int n3 = n < 0 ? 0 : n % aw.length;
        int n4 = 0;
        while (n4 < aw.length) {
            int n5 = (n3 + n4) % aw.length;
            k0 k02 = aw[n5];
            if (k02 != null && k02.a != n2 && !k5.h(k02.a) && (aK & 1 << n5) == 0) {
                return k02.a;
            }
            ++n4;
        }
        return 0;
    }

    private static void l(int n, int n2) throws Exception {
        k0 k02 = k5.af(n);
        if (k02 == null) {
            return;
        }
        k02.e = (byte)n2;
        if (!az) {
            return;
        }
        byte[] byArray = new byte[6];
        byArray[0] = -92;
        k5.a(byArray, 1, k02.a);
        byArray[5] = k02.e;
        DoHoang091.a((byte)-30, byArray);
    }

    static void b(int n, int n2, int n3) throws Exception {
        k5.I();
        k0 k02 = k5.af(n);
        if (k02 == null) {
            return;
        }
        k02.C = (short)n2;
        k02.D = (short)n3;
        if (az) {
            int n4 = k5.U(k02);
            if (n4 >= 0 && aB[n4]) {
                k5.b(k02);
            } else {
                k5.O();
            }
        }
        k5.N();
    }

    static void E(int n) throws Exception {
        k5.I();
        k0 k02 = k5.af(n);
        if (k02 == null) {
            return;
        }
        int n2 = k5.U(k02);
        if (n2 < 0) {
            return;
        }
        k5.a(k02, n2);
        if (az) {
            k5.O();
        }
        k5.N();
    }

    static int x() {
        k5.I();
        return aw.length;
    }

    static boolean y() {
        k5.I();
        return aw != null && aw.length >= 5;
    }

    private static boolean a(int n, int n2, int n3, int n4, int n5) throws Exception {
        k5.I();
        k0 k02 = k5.af(n);
        int n6 = k5.U(k02);
        if (k02 == null || n6 < 0 || (bv & 1 << n6) != 0) {
            return false;
        }
        k02.A = n2;
        k02.B = n3;
        k02.C = (short)n4;
        k02.D = (short)n5;
        k02.l = Math.max(1, k02.k);
        k02.n = Math.max(1, k02.m);
        k02.U = false;
        k02.V = 0L;
        k02.ad = true;
        k02.F = (byte)3;
        if (az) {
            k5.O();
        }
        k5.N();
        return true;
    }

    private static void a(k0 k02, int n) {
        if (k02 == null || n < 0 || n >= ag.length) {
            return;
        }
        k02.A = ag[n];
        k02.B = 0;
        k02.C = (short)ah[n];
        k02.D = (short)ai[n];
        k02.l = Math.max(1, k02.k);
        k02.n = Math.max(1, k02.m);
        k02.U = false;
        k02.V = 0L;
        k02.aq = false;
        k02.F = (byte)(n % 3);
        k02.e = as[n % as.length];
        k02.ad = true;
        k02.ae = System.currentTimeMillis();
    }

    private static void I() {
        boolean bl;
        if (ax) {
            return;
        }
        ax = true;
        k5.J();
        boolean bl2 = bl = !k5.L();
        if (bl) {
            k5.K();
        }
        boolean bl3 = k5.b(bl || ay < 12);
        if (bl || bl3) {
            k5.M();
        }
    }

    private static void J() {
        bq = -1;
        br = -1;
        bs = 0;
        bt = 324508639;
        int n = 0;
        while (n < bu.length) {
            k5.bu[n] = 0;
            ++n;
        }
    }

    private static void K() {
        aw = new k0[30];
        int n = 0;
        while (n < 30) {
            k5.aw[n] = k5.O(n);
            ++n;
        }
    }

    private static void b(k0 k02, int n) {
        if (k02 == null) {
            return;
        }
        int n2 = n < 0 ? 0 : n;
        k02.aw = (byte)(n2 % 5);
        k02.ax = 1;
        k02.ay = n2 < ag.length ? ag[n2] : 0;
        k02.az = -1;
        k02.aA = 0;
        k02.aB = 0;
        k02.aC = 0;
        k02.aD = 0;
        k02.aE = (short)-1;
        k02.aF = 0;
        k02.aG = (byte)-1;
        k02.aH = 0;
        k02.aI = 0;
    }

    private static k0 O(int n) {
        k0 k02 = new k0();
        k5.b(k02, n);
        k02.a = 100001 + n;
        k02.b = af[n];
        k02.c = (byte)(n & 1);
        k02.d = (byte)(1 + n % 6);
        k02.e = as[n % as.length];
        k02.f = k5.a(k02.c, n);
        k02.j = 12 + n * 11 % 119;
        k02.P = 0x13579BDF ^ n * 7919;
        k5.a(k02);
        k02.A = ag[n];
        k02.B = 0;
        k02.C = (short)ah[n];
        k02.D = (short)ai[n];
        k02.E = (byte)(n >= 12 ? 1 : 0);
        k02.F = (byte)(n % 3);
        k02.G = 0;
        k02.H = 0;
        k02.J = 0;
        k02.K = 100 + n * 17;
        k02.L = 0;
        k02.M = 0;
        k02.N = at[n % at.length];
        k02.O = (short)(5 + n * 2);
        k02.Q = 2000000000;
        k02.R = k5.Y(k02.j);
        k02.S = k5.Z(k02.j);
        k02.T = DoHoang091.a(k02.j);
        k02.U = false;
        k02.V = 0L;
        k5.b(k02, n, true);
        k02.W = (short)(12 + n % 8);
        k02.X = (short)(10 + n % 6);
        k02.Y = (short)(10 + n * 3 % 7);
        int n2 = 0;
        while (n2 < 4) {
            k5.d(k02, n2);
            ++n2;
        }
        k02.ad = true;
        k02.ae = 0L;
        return k02;
    }

    private static boolean b(boolean bl) {
        int n;
        Object object;
        boolean bl2;
        if (aw == null) {
            return false;
        }
        boolean bl3 = bl;
        boolean bl4 = bl2 = ay > 0 && ay < 9;
        if (aw.length < 30) {
            object = new k0[30];
            System.arraycopy(aw, 0, object, 0, aw.length);
            n = aw.length;
            while (n < 30) {
                object[n] = k5.O(n);
                ++n;
            }
            aw = object;
            bl3 = true;
            bl = true;
        }
        object = (int[][])(bl ? k5.ai() : null);
        n = 0;
        while (n < aw.length) {
            k0 k02 = aw[n];
            if (k02 == null) {
                k5.aw[n] = k5.O(n);
                bl3 = true;
            } else {
                int n2;
                int n3;
                int n4;
                if (bl2 && (k02.H != 0 || k02.I != 0)) {
                    k02.H = 0;
                    k02.I = 0;
                    bl3 = true;
                }
                if (ay < 10) {
                    k5.b(k02, n);
                    bl3 = true;
                }
                if ((k02.aw & 0xFF) >= 5) {
                    k02.aw = (byte)(n % 5);
                    bl3 = true;
                }
                if (k02.ax < 1 || k02.ax > 6) {
                    k02.ax = 1;
                    k02.aA = 0;
                    bl3 = true;
                }
                if (!DoHoang091.i(k02.ay)) {
                    k02.ay = k02.A;
                    bl3 = true;
                }
                if (k02.aE >= 0 && ((k02.aG & 0xFF) > 9 || k02.aI <= 0)) {
                    k02.aE = (short)-1;
                    k02.aG = (byte)-1;
                    k02.aH = 0;
                    k02.aF = 0;
                    k02.aI = 0;
                    bl3 = true;
                }
                if ((k02.e & 0xFF) == 2 || (k02.e & 0xFF) > 6) {
                    k02.e = as[n % as.length];
                    bl3 = true;
                }
                short s = k02.f;
                short s2 = k02.g;
                short s3 = k02.h;
                short s4 = k02.i;
                k5.a(k02);
                if (s != k02.f || s2 != k02.g || s3 != k02.h || s4 != k02.i) {
                    bl3 = true;
                }
                if (k02.Q != 2000000000) {
                    k02.Q = 2000000000;
                    bl3 = true;
                }
                if (k02.R != (n4 = k5.Y(k02.j))) {
                    k02.R = n4;
                    bl3 = true;
                }
                if (k02.S != (n3 = k5.Z(k02.j))) {
                    k02.S = n3;
                    bl3 = true;
                }
                if (k02.T < DoHoang091.a(k02.j)) {
                    k02.T = DoHoang091.a(k02.j);
                    bl3 = true;
                }
                if (bl || k02.k <= 0 || k02.m <= 0 || k02.o <= 0 || k02.p <= 0) {
                    n2 = k02.k;
                    int n5 = k02.m;
                    int n6 = k02.o;
                    k5.a(k02, n, false, object == null ? e : (int[])object[n]);
                    if (n2 != k02.k || n5 != k02.m || n6 != k02.o) {
                        bl3 = true;
                    }
                }
                if (k02.W <= 0) {
                    k02.W = (short)12;
                    bl3 = true;
                }
                if (k02.X <= 0) {
                    k02.X = (short)10;
                    bl3 = true;
                }
                if (k02.Y <= 0) {
                    k02.Y = (short)10;
                    bl3 = true;
                }
                if (k02.Z == null || k02.Z.length != 4 || k02.aa == null || k02.aa.length != 4 || k02.ab == null || k02.ab.length != 4 || k02.ac == null || k02.ac.length != 4) {
                    k02.Z = new short[4];
                    k02.aa = new short[4];
                    k02.ab = new int[4];
                    k02.ac = new long[4];
                    n2 = 0;
                    while (n2 < 4) {
                        k5.d(k02, n2);
                        ++n2;
                    }
                    bl3 = true;
                }
            }
            ++n;
        }
        k5.l(System.currentTimeMillis());
        return bl3;
    }

    private static void a(k0 k02) {
        if (k02 == null) {
            return;
        }
        int n = (k02.d & 0xFF) - 1;
        if (n < 0 || n >= ak.length) {
            n = 0;
        }
        k02.g = (short)(k5.C(k02) ? -1 : ak[n]);
        k02.h = k5.F(k02);
        k02.i = k5.H(k02);
        int n2 = k02.a - 100001;
        k02.f = k5.a(k02.c, n2);
    }

    private static short a(byte by, int n) {
        short[] sArray = (by & 0xFF) == 0 ? aq : ar;
        int n2 = n % sArray.length;
        if (n2 < 0) {
            n2 = -n2;
        }
        return sArray[n2];
    }

    /*
     * Unable to fully structure code
     */
    private static boolean L() {
        block46: {
            block44: {
                block45: {
                    block42: {
                        block43: {
                            block40: {
                                block41: {
                                    block38: {
                                        block39: {
                                            block36: {
                                                block37: {
                                                    var0 = null;
                                                    var0 = RecordStore.openRecordStore((String)"nso_offline_bots_v1", (boolean)false);
                                                    if (var0.getNumRecords() >= 1) break block36;
                                                    if (var0 == null) break block37;
                                                    try {
                                                        var0.closeRecordStore();
                                                    }
                                                    catch (Exception v0) {}
                                                }
                                                return false;
                                            }
                                            var1_1 = var0.getRecord(1);
                                            var2_2 = new DataInputStream(new ByteArrayInputStream(var1_1));
                                            if (var2_2.readInt() == 1314082626) break block38;
                                            if (var0 == null) break block39;
                                            try {
                                                var0.closeRecordStore();
                                            }
                                            catch (Exception v1) {}
                                        }
                                        return false;
                                    }
                                    var3_3 = var2_2.readUnsignedByte();
                                    if (var3_3 >= 1 && var3_3 <= 12) break block40;
                                    if (var0 == null) break block41;
                                    try {
                                        var0.closeRecordStore();
                                    }
                                    catch (Exception v2) {}
                                }
                                return false;
                            }
                            k5.ay = var3_3;
                            var4_4 = var2_2.readUnsignedByte();
                            if (var4_4 >= 1 && var4_4 <= 30) break block42;
                            if (var0 == null) break block43;
                            try {
                                var0.closeRecordStore();
                            }
                            catch (Exception v3) {}
                        }
                        return false;
                    }
                    k5.aw = new k0[var4_4];
                    var5_5 = 0;
                    while (var5_5 < var4_4) {
                        var6_6 = new k0();
                        k5.b(var6_6, var5_5);
                        var6_6.a = var2_2.readInt();
                        var6_6.b = var2_2.readUTF();
                        var6_6.c = var2_2.readByte();
                        var6_6.d = var2_2.readByte();
                        var6_6.e = var2_2.readByte();
                        var6_6.f = var2_2.readShort();
                        var6_6.g = var2_2.readShort();
                        var6_6.h = var2_2.readShort();
                        var6_6.i = var2_2.readShort();
                        var6_6.j = var2_2.readInt();
                        var6_6.k = var2_2.readInt();
                        var6_6.l = var2_2.readInt();
                        var6_6.m = var2_2.readInt();
                        var6_6.n = var2_2.readInt();
                        var6_6.o = var2_2.readInt();
                        var6_6.A = var2_2.readInt();
                        var6_6.B = var2_2.readInt();
                        var6_6.C = var2_2.readShort();
                        var6_6.D = var2_2.readShort();
                        var6_6.E = var2_2.readByte();
                        var6_6.F = var2_2.readByte();
                        var6_6.G = var2_2.readInt();
                        var6_6.H = var2_2.readInt();
                        var6_6.J = var2_2.readInt();
                        var6_6.K = var2_2.readInt();
                        var6_6.N = var2_2.readShort();
                        var6_6.O = var2_2.readShort();
                        var6_6.P = var2_2.readInt();
                        var6_6.ae = var2_2.readLong();
                        if (var3_3 >= 2) {
                            var6_6.Q = var2_2.readInt();
                            var6_6.R = var2_2.readInt();
                            var6_6.S = var2_2.readInt();
                            var6_6.W = var2_2.readShort();
                            var6_6.X = var2_2.readShort();
                            var6_6.Y = var2_2.readShort();
                            var7_8 = var3_3 >= 8 ? 4 : 2;
                            var8_9 = 0;
                            while (var8_9 < var7_8) {
                                var6_6.Z[var8_9] = var2_2.readShort();
                                var6_6.aa[var8_9] = var2_2.readShort();
                                var6_6.ab[var8_9] = var2_2.readInt();
                                var6_6.ac[var8_9] = var2_2.readLong();
                                ++var8_9;
                            }
                        }
                        if (var3_3 >= 3) {
                            var6_6.I = var2_2.readInt();
                        }
                        if (var3_3 >= 4) {
                            var6_6.T = var2_2.readLong();
                            var6_6.U = var2_2.readBoolean();
                            var6_6.V = var2_2.readLong();
                        } else {
                            var6_6.T = DoHoang091.a(var6_6.j);
                            var6_6.U = false;
                            var6_6.V = 0L;
                        }
                        var6_6.L = var3_3 >= 5 ? var2_2.readInt() : 0;
                        v4 = var6_6.M = var3_3 >= 6 ? var2_2.readInt() : 0;
                        if (var3_3 >= 7) {
                            var6_6.p = var2_2.readInt();
                            var6_6.q = var2_2.readInt();
                            var6_6.r = var2_2.readInt();
                            var6_6.s = var2_2.readInt();
                            var6_6.t = var2_2.readInt();
                            var6_6.u = var2_2.readInt();
                            var6_6.v = var2_2.readInt();
                            var6_6.w = var2_2.readInt();
                            var6_6.x = var2_2.readInt();
                            var6_6.y = var2_2.readInt();
                            var6_6.z = var2_2.readInt();
                        }
                        if (var3_3 >= 10) {
                            var6_6.aw = var2_2.readByte();
                            var6_6.ax = var2_2.readByte();
                            var6_6.ay = var2_2.readInt();
                            var6_6.az = var2_2.readInt();
                            var6_6.aA = var2_2.readInt();
                            var6_6.aB = var2_2.readInt();
                            var6_6.aC = var2_2.readInt();
                            var6_6.aD = var2_2.readInt();
                            var6_6.aE = var2_2.readShort();
                            var6_6.aF = var2_2.readByte();
                            var6_6.aG = var2_2.readByte();
                            var6_6.aH = var2_2.readByte();
                            var6_6.aI = var2_2.readInt();
                        }
                        var6_6.ad = true;
                        k5.aw[var5_5] = var6_6;
                        ++var5_5;
                    }
                    if (var3_3 < 6) ** GOTO lbl164
                    k5.bq = var2_2.readInt();
                    k5.br = var2_2.readInt();
                    k5.bs = var2_2.readInt();
                    k5.bt = var2_2.readInt();
                    var6_7 = var2_2.readUnsignedByte();
                    if (var6_7 >= 0 && var6_7 <= 16) break block44;
                    if (var0 == null) break block45;
                    try {
                        var0.closeRecordStore();
                    }
                    catch (Exception v5) {}
                }
                return false;
            }
            var5_5 = 0;
            while (var5_5 < var6_7) {
                var7_8 = var2_2.readInt();
                if (var5_5 < k5.bu.length) {
                    k5.bu[var5_5] = var7_8;
                }
                ++var5_5;
            }
lbl164:
            // 2 sources

            k5.aA = var3_3 >= 12 ? var2_2.readBoolean() : true;
            var2_2.close();
            if (var0 == null) break block46;
            try {
                var0.closeRecordStore();
            }
            catch (Exception v6) {}
        }
        return true;
        catch (Exception v7) {
            block47: {
                try {
                    k5.aw = null;
                    k5.ay = 0;
                    if (var0 == null) break block47;
                }
                catch (Throwable var10_10) {
                    if (var0 != null) {
                        try {
                            var0.closeRecordStore();
                        }
                        catch (Exception v8) {}
                    }
                    throw var10_10;
                }
                try {
                    var0.closeRecordStore();
                }
                catch (Exception v9) {}
            }
            return false;
        }
    }

    private static void M() {
        RecordStore recordStore;
        block15: {
            if (aw == null) {
                return;
            }
            recordStore = null;
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
                    DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                    dataOutputStream.writeInt(1314082626);
                    dataOutputStream.writeByte(12);
                    dataOutputStream.writeByte(aw.length);
                    int n = 0;
                    while (n < aw.length) {
                        k0 k02 = aw[n];
                        dataOutputStream.writeInt(k02.a);
                        dataOutputStream.writeUTF(k02.b);
                        dataOutputStream.writeByte(k02.c);
                        dataOutputStream.writeByte(k02.d);
                        dataOutputStream.writeByte(k02.e);
                        dataOutputStream.writeShort(k02.f);
                        dataOutputStream.writeShort(k02.g);
                        dataOutputStream.writeShort(k02.h);
                        dataOutputStream.writeShort(k02.i);
                        dataOutputStream.writeInt(k02.j);
                        dataOutputStream.writeInt(k02.k);
                        dataOutputStream.writeInt(k02.l);
                        dataOutputStream.writeInt(k02.m);
                        dataOutputStream.writeInt(k02.n);
                        dataOutputStream.writeInt(k02.o);
                        dataOutputStream.writeInt(k02.A);
                        dataOutputStream.writeInt(k02.B);
                        dataOutputStream.writeShort(k02.C);
                        dataOutputStream.writeShort(k02.D);
                        dataOutputStream.writeByte(k02.E);
                        dataOutputStream.writeByte(k02.F);
                        dataOutputStream.writeInt(k02.G);
                        dataOutputStream.writeInt(k02.H);
                        dataOutputStream.writeInt(k02.J);
                        dataOutputStream.writeInt(k02.K);
                        dataOutputStream.writeShort(k02.N);
                        dataOutputStream.writeShort(k02.O);
                        dataOutputStream.writeInt(k02.P);
                        dataOutputStream.writeLong(k02.ae);
                        dataOutputStream.writeInt(2000000000);
                        dataOutputStream.writeInt(k02.R);
                        dataOutputStream.writeInt(k02.S);
                        dataOutputStream.writeShort(k02.W);
                        dataOutputStream.writeShort(k02.X);
                        dataOutputStream.writeShort(k02.Y);
                        int n2 = 0;
                        while (n2 < 4) {
                            dataOutputStream.writeShort(k02.Z[n2]);
                            dataOutputStream.writeShort(k02.aa[n2]);
                            dataOutputStream.writeInt(k02.ab[n2]);
                            dataOutputStream.writeLong(k02.ac[n2]);
                            ++n2;
                        }
                        dataOutputStream.writeInt(k02.I);
                        dataOutputStream.writeLong(k02.T);
                        dataOutputStream.writeBoolean(k02.U);
                        dataOutputStream.writeLong(k02.V);
                        dataOutputStream.writeInt(k02.L);
                        dataOutputStream.writeInt(k02.M);
                        dataOutputStream.writeInt(k02.p);
                        dataOutputStream.writeInt(k02.q);
                        dataOutputStream.writeInt(k02.r);
                        dataOutputStream.writeInt(k02.s);
                        dataOutputStream.writeInt(k02.t);
                        dataOutputStream.writeInt(k02.u);
                        dataOutputStream.writeInt(k02.v);
                        dataOutputStream.writeInt(k02.w);
                        dataOutputStream.writeInt(k02.x);
                        dataOutputStream.writeInt(k02.y);
                        dataOutputStream.writeInt(k02.z);
                        dataOutputStream.writeByte(k02.aw);
                        dataOutputStream.writeByte(k02.ax);
                        dataOutputStream.writeInt(k02.ay);
                        dataOutputStream.writeInt(k02.az);
                        dataOutputStream.writeInt(k02.aA);
                        dataOutputStream.writeInt(k02.aB);
                        dataOutputStream.writeInt(k02.aC);
                        dataOutputStream.writeInt(k02.aD);
                        dataOutputStream.writeShort(k02.aE);
                        dataOutputStream.writeByte(k02.aF);
                        dataOutputStream.writeByte(k02.aG);
                        dataOutputStream.writeByte(k02.aH);
                        dataOutputStream.writeInt(k02.aI);
                        ++n;
                    }
                    dataOutputStream.writeInt(bq);
                    dataOutputStream.writeInt(br);
                    dataOutputStream.writeInt(bs);
                    dataOutputStream.writeInt(bt);
                    dataOutputStream.writeByte(bu.length);
                    n = 0;
                    while (n < bu.length) {
                        dataOutputStream.writeInt(bu[n]);
                        ++n;
                    }
                    dataOutputStream.writeBoolean(aA);
                    dataOutputStream.flush();
                    ay = 12;
                    recordStore = RecordStore.openRecordStore((String)a, (boolean)true);
                    if (recordStore.getNumRecords() == 0) {
                        recordStore.addRecord(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                        break block15;
                    }
                    recordStore.setRecord(1, byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                }
                catch (Exception exception) {}
            }
            catch (Throwable throwable) {
                if (recordStore != null) {
                    try {
                        recordStore.closeRecordStore();
                    }
                    catch (Exception exception) {}
                }
                throw throwable;
            }
        }
        if (recordStore != null) {
            try {
                recordStore.closeRecordStore();
            }
            catch (Exception exception) {}
        }
    }

    private static void N() {
        k5.M();
    }

    private static void a(long l) {
        long l2 = l / 90000L;
        int n = 0;
        while (n < aw.length) {
            boolean bl;
            k0 k02 = aw[n];
            boolean bl2 = bl = aA && (k02.E == 0 || (l2 + (long)(k02.P & 7) & 1L) == 0L);
            if (aA && ((aK & 1 << n) != 0 || (bd & 1 << n) != 0)) {
                bl = true;
            }
            if (aA && (k02.F == 3 || (bv & 1 << n) != 0 || k02.a == aP || k02.a == aR)) {
                bl = true;
            }
            if (aA && k02.U) {
                bl = true;
            }
            k02.ad = bl;
            ++n;
        }
    }

    private static void O() throws Exception {
        int n = DoHoang091.r();
        int n2 = k5.ak();
        int n3 = 0;
        while (n3 < aw.length) {
            boolean bl;
            k0 k02 = aw[n3];
            boolean bl2 = bl = az && k02.ad && k02.A == n && k02.B == n2;
            if (bl && !aB[n3]) {
                k5.P(n3);
            } else if (!bl && aB[n3]) {
                k5.Q(n3);
            }
            ++n3;
        }
    }

    private static void P(int n) throws Exception {
        k0 k02 = aw[n];
        k5.aB[n] = true;
        DoHoang091.a((byte)3, k5.c(k02));
        k5.d(k02);
        k5.e(k02);
    }

    private static void Q(int n) throws Exception {
        k0 k02 = aw[n];
        k5.aB[n] = false;
        byte[] byArray = new byte[4];
        k5.a(byArray, 0, k02.a);
        DoHoang091.a((byte)2, byArray);
    }

    private static void b(k0 k02) throws Exception {
        if (k02 == null) {
            return;
        }
        byte[] byArray = new byte[8];
        k5.a(byArray, 0, k02.a);
        k5.b(byArray, 4, (int)k02.C);
        k5.b(byArray, 6, (int)k02.D);
        DoHoang091.a((byte)1, byArray);
    }

    private static byte[] c(k0 k02) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(100);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(k02.a);
        String string = k5.z(k02);
        dataOutputStream.writeUTF(string);
        if (string.length() > 0) {
            dataOutputStream.writeByte(0);
        }
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeByte(k02.e);
        dataOutputStream.writeByte(k02.d);
        dataOutputStream.writeByte(k02.c);
        dataOutputStream.writeShort(k02.f);
        dataOutputStream.writeUTF(k02.b);
        dataOutputStream.writeInt(Math.max(0, k02.l));
        dataOutputStream.writeInt(Math.max(1, k02.k));
        dataOutputStream.writeByte(k02.j);
        dataOutputStream.writeShort(k02.g);
        dataOutputStream.writeShort(k02.h);
        dataOutputStream.writeShort(k02.i);
        dataOutputStream.writeByte(-1);
        dataOutputStream.writeShort(k02.C);
        dataOutputStream.writeShort(k02.D);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeShort(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeShort(k02.f);
        dataOutputStream.writeShort(k02.g);
        dataOutputStream.writeShort(k02.h);
        dataOutputStream.writeShort(k02.i);
        int n = 0;
        while (n < 10) {
            dataOutputStream.writeShort(k5.k(k02, n));
            ++n;
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private static void d(k0 k02) throws Exception {
        short s = k5.J(k02);
        if (s < 0) {
            return;
        }
        byte[] byArray = new byte[56];
        byArray[0] = -54;
        k5.a(byArray, 1, k02.a);
        int n = 5;
        while (n < 13) {
            k5.b(byArray, n, -1);
            n += 2;
        }
        k5.b(byArray, 13, (int)s);
        byArray[15] = k5.K(k02);
        n = 16;
        while (n < 24) {
            byArray[n] = -1;
            ++n;
        }
        byArray[24] = k5.L(k02);
        byArray[25] = 6;
        byArray[26] = 65;
        k5.a(byArray, 27, 0);
        byArray[31] = 66;
        k5.a(byArray, 32, 1000);
        int n2 = 0;
        while (n2 < 4) {
            int n3 = 36 + n2 * 5;
            int n4 = k5.l(k02, n2);
            byArray[n3] = (byte)n4;
            k5.a(byArray, n3 + 1, k5.m(k02, n4));
            ++n2;
        }
        DoHoang091.a((byte)-30, byArray);
    }

    private static void e(k0 k02) throws Exception {
        int n;
        short s = k5.h(k02, 10);
        int n2 = n = s < 0 ? 0 : k16.K(s);
        if (n <= 0) {
            return;
        }
        byte[] byArray = new byte[8];
        byArray[0] = -68;
        k5.a(byArray, 1, k02.a);
        k5.b(byArray, 5, n);
        byArray[7] = (byte)(k16.L(s) ? 1 : 0);
        DoHoang091.a((byte)-30, byArray);
    }

    private static void a(byte[] byArray) throws Exception {
        Object object;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(80);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int n = 0;
        dataOutputStream.writeByte(0);
        int[] nArray = k5.b(byArray);
        int n2 = 0;
        while (n2 < aw.length) {
            object = aw[n2];
            if (((k0)object).ad && aB[n2] && (nArray == null || k5.b(nArray, ((k0)object).a))) {
                dataOutputStream.writeInt(((k0)object).a);
                dataOutputStream.writeShort(((k0)object).C);
                dataOutputStream.writeShort(((k0)object).D);
                dataOutputStream.writeInt(Math.max(0, ((k0)object).l));
                ++n;
            }
            ++n2;
        }
        n += k2e.a(dataOutputStream, nArray);
        n += k2e.b(dataOutputStream, nArray);
        n += k3.a(dataOutputStream, nArray);
        dataOutputStream.flush();
        object = byteArrayOutputStream.toByteArray();
        object[0] = (byte)(n += k19.a(dataOutputStream, nArray));
        DoHoang091.a((byte)25, (byte[])object);
    }

    private static int[] b(byte[] byArray) {
        int n;
        DataInputStream dataInputStream;
        block7: {
            block6: {
                if (byArray == null || byArray.length < 1) {
                    return null;
                }
                dataInputStream = new DataInputStream(new ByteArrayInputStream(byArray));
                n = dataInputStream.readUnsignedByte();
                if (n > 0) break block6;
                return null;
            }
            if (n <= 32 && dataInputStream.available() >= n * 4) break block7;
            return null;
        }
        try {
            int[] nArray = new int[n];
            int n2 = 0;
            while (n2 < n) {
                nArray[n2] = dataInputStream.readInt();
                ++n2;
            }
            return nArray;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void f(k0 k02) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(180);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(k02.a);
        dataOutputStream.writeUTF(k02.b);
        dataOutputStream.writeShort(k02.f);
        dataOutputStream.writeByte(k02.c);
        dataOutputStream.writeByte(k02.d);
        dataOutputStream.writeByte(k02.e);
        dataOutputStream.writeInt(k02.l);
        dataOutputStream.writeInt(k02.k);
        dataOutputStream.writeInt(k02.n);
        dataOutputStream.writeInt(k02.m);
        dataOutputStream.writeByte(k02.p);
        dataOutputStream.writeShort(k5.R(k02.v));
        dataOutputStream.writeShort(k5.R(k02.w));
        dataOutputStream.writeShort(k5.R(k02.x));
        dataOutputStream.writeInt(k02.o);
        dataOutputStream.writeInt(k02.q);
        dataOutputStream.writeShort(k5.R(k02.r));
        dataOutputStream.writeShort(k5.R(k02.s));
        dataOutputStream.writeShort(k5.R(k02.t));
        dataOutputStream.writeShort(k5.R(k02.u));
        dataOutputStream.writeShort(k5.R(k02.y));
        dataOutputStream.writeShort(k5.R(k02.z));
        dataOutputStream.writeByte(k02.j);
        dataOutputStream.writeShort(321);
        String string = k5.z(k02);
        dataOutputStream.writeUTF(string);
        if (string.length() > 0) {
            dataOutputStream.writeByte(0);
        }
        int n = 0;
        while (n < 11) {
            dataOutputStream.writeShort(0);
            ++n;
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        n = 0;
        while (n < 16) {
            short s = k5.h(k02, n);
            dataOutputStream.writeShort(s);
            if (s >= 0) {
                dataOutputStream.writeByte(k5.i(k02, n));
                dataOutputStream.writeByte(k5.j(k02, n));
            }
            ++n;
        }
        n = 0;
        while (n < 16) {
            dataOutputStream.writeShort(-1);
            ++n;
        }
        dataOutputStream.flush();
        DoHoang091.a((byte)93, byteArrayOutputStream.toByteArray());
    }

    private static short R(int n) {
        return (short)Math.max(0, Math.min(Short.MAX_VALUE, n));
    }

    private static void a(k0 k02, byte[] byArray) throws Exception {
        int n;
        int n2 = n = byArray != null && byArray.length > 4 ? byArray[4] & 0xFF : 0;
        if (n < 0 || n >= 16 || k5.h(k02, n) < 0) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(24);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int n3 = k5.h(k02, n) & 0xFFFF;
        int n4 = k5.i(k02, n) & 0xFF;
        dataOutputStream.writeByte(n);
        dataOutputStream.writeLong(-1L);
        dataOutputStream.writeInt(k16.M(n3));
        dataOutputStream.writeByte(k5.j(k02, n));
        k16.a(dataOutputStream, n3, n4, (int)k5.j(k02, n));
        dataOutputStream.flush();
        DoHoang091.a((byte)94, byteArrayOutputStream.toByteArray());
    }

    private static boolean c(byte by, byte[] byArray) throws Exception {
        Object object;
        if (by != -22) {
            return false;
        }
        String string = "";
        String string2 = "";
        try {
            object = new DataInputStream(new ByteArrayInputStream(byArray == null ? new byte[]{} : byArray));
            if (by == -22) {
                string = ((DataInputStream)object).readUTF();
                string2 = ((FilterInputStream)object).available() > 0 ? ((DataInputStream)object).readUTF() : "";
            } else {
                string2 = ((FilterInputStream)object).available() > 0 ? ((DataInputStream)object).readUTF() : "";
            }
        }
        catch (Exception exception) {}
        Object object2 = object = string.length() == 0 ? k5.al() : k5.i(string);
        if (by == -22 && object == null) {
            return true;
        }
        if (object == null) {
            object = k5.al();
        }
        if (object != null) {
            if (string.length() > 0 && !((k0)object).ad) {
                DoHoang091.b("Nh\u00e2n v\u1eadt n\u00e0y \u0111ang offline");
                return true;
            }
            k5.a((byte)-22, (k0)object, k5.a(string2, (k0)object));
        }
        return true;
    }

    private static String a(String string, k0 k02) {
        if (string == null || string.length() == 0) {
            return "M\u00ecnh \u0111ang \u1edf \u0111\u00e2y, c\u1ea7n h\u1ed7 tr\u1ee3 g\u00ec kh\u00f4ng?";
        }
        String string2 = string.toLowerCase();
        if (string2.indexOf("t\u00ednh c\u00e1ch") >= 0 || string2.indexOf("personality") >= 0) {
            return "M\u00ecnh l\u00e0 bot " + k5.o(k02 == null ? 0 : k02.a) + ".";
        }
        if ((string2.indexOf("gi\u00e1") >= 0 || string2.indexOf("mua") >= 0) && k02 != null && (k02.aw & 0xFF) == 2) {
            return "M\u00ecnh \u0111ang s\u0103n v\u1eadt ph\u1ea9m t\u1ed1t v\u1edbi gi\u00e1 h\u1ee3p l\u00fd.";
        }
        if ((string2.indexOf("h\u1ed7 tr\u1ee3") >= 0 || string2.indexOf("buff") >= 0) && k02 != null && (k02.aw & 0xFF) == 3) {
            return "M\u00ecnh s\u1ebd \u01b0u ti\u00ean h\u1ed3i ph\u1ee5c v\u00e0 h\u1ed7 tr\u1ee3 c\u1ea3 nh\u00f3m.";
        }
        if ((string2.indexOf("\u0111\u00e1nh") >= 0 || string2.indexOf("qu\u00e1i") >= 0) && k02 != null && (k02.aw & 0xFF) == 1) {
            return "M\u00ecnh s\u1ebd lao v\u00e0o \u0111\u00e1nh nhanh khi k\u1ef9 n\u0103ng s\u1eb5n s\u00e0ng.";
        }
        if ((string2.indexOf("\u0111\u1ed1i th\u1ee7") >= 0 || string2.indexOf("th\u00e1ch \u0111\u1ea5u") >= 0) && k02 != null && (k02.aw & 0xFF) == 4) {
            return "M\u00ecnh lu\u00f4n s\u1eb5n s\u00e0ng t\u00ecm m\u1ed9t \u0111\u1ed1i th\u1ee7 x\u1ee9ng \u0111\u00e1ng.";
        }
        if (string2.indexOf("party") >= 0 || string2.indexOf("nh\u00f3m") >= 0) {
            return "\u0110\u01b0\u1ee3c, m\u1eddi m\u00ecnh v\u00e0o nh\u00f3m nh\u00e9!";
        }
        if (string2.indexOf("trade") >= 0 || string2.indexOf("giao d\u1ecbch") >= 0) {
            return "M\u00ecnh c\u00f3 th\u1ec3 giao d\u1ecbch c\u00f9ng b\u1ea1n.";
        }
        if (string2.indexOf("duel") >= 0 || string2.indexOf("t\u1ef7 th\u00ed") >= 0) {
            return "M\u00ecnh nh\u1eadn l\u1eddi t\u1ef7 th\u00ed!";
        }
        if (string2.indexOf("clan") >= 0 || string2.indexOf("gia t\u1ed9c") >= 0) {
            return "M\u00ecnh s\u1ebd tham gia gia t\u1ed9c c\u1ee7a b\u1ea1n.";
        }
        return k5.g(k02);
    }

    private static String g(k0 k02) {
        String string;
        try {
            string = DoHoang091.u(k02 == null ? 22 : k02.A);
        }
        catch (Exception exception) {
            string = "map " + (k02 == null ? 22 : k02.A);
        }
        int n = k02 == null ? 0 : k02.B;
        return "T\u00f4i \u0111ang \u1edf " + string + " khu " + (n + 1) + ".";
    }

    private static void a(byte by, k0 k02, String string) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(48);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(k02.b);
        dataOutputStream.writeUTF(string);
        dataOutputStream.flush();
        DoHoang091.a(by, byteArrayOutputStream.toByteArray());
    }

    private static void a(k0 k02, byte by) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(24);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(k02.b);
        dataOutputStream.writeByte(by);
        dataOutputStream.flush();
        DoHoang091.a((byte)84, byteArrayOutputStream.toByteArray());
    }

    private static void h(k0 k02) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(24);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(k02.b);
        dataOutputStream.flush();
        DoHoang091.a((byte)-30, k5.d((byte)-83, byteArrayOutputStream.toByteArray()));
    }

    private static void P() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(80);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int n = 0;
        while (n < aw.length) {
            if ((bc & 1 << n) != 0) {
                dataOutputStream.writeUTF(k5.aw[n].b);
                dataOutputStream.writeByte(k5.aw[n].ad ? 3 : 0);
            }
            ++n;
        }
        dataOutputStream.flush();
        DoHoang091.a((byte)-30, k5.d((byte)-85, byteArrayOutputStream.toByteArray()));
    }

    private static void i(k0 k02) throws Exception {
        if (k5.F()) {
            return;
        }
        if (k02 == null) {
            return;
        }
        if (k5.h(k02.a)) {
            k5.h("Ng\u01b0\u1eddi n\u00e0y \u0111ang thi \u0111\u1ea5u");
            return;
        }
        k5.Q();
        if (!k5.R()) {
            k5.h("B\u1ea1n kh\u00f4ng ph\u1ea3i tr\u01b0\u1edfng nh\u00f3m");
            return;
        }
        if (aL) {
            k5.h("Nh\u00f3m \u0111\u00e3 kh\u00f3a");
            return;
        }
        int n = k5.U(k02);
        if (n < 0) {
            return;
        }
        if ((aK & 1 << n) != 0) {
            k5.U();
            return;
        }
        if (aN >= 6) {
            k5.h("Nh\u00f3m \u0111\u00e3 \u0111\u1ee7 th\u00e0nh vi\u00ean");
            return;
        }
        int n2 = DoHoang091.r();
        int n3 = k5.ak();
        k02.A = n2;
        k02.B = n3;
        k02.C = (short)(DoHoang091.u() + 24 + n * 3);
        k02.D = (short)DoHoang091.v();
        k02.ad = true;
        aK |= 1 << n;
        k5.aM[k5.aN++] = k02.a;
        k5.S();
        if (!aB[n]) {
            k5.P(n);
        } else {
            k5.b(k02);
        }
        k5.U();
        k5.N();
    }

    private static void S(int n) throws Exception {
        if (aN == 0) {
            return;
        }
        if (!k5.R()) {
            k5.h("B\u1ea1n kh\u00f4ng ph\u1ea3i tr\u01b0\u1edfng nh\u00f3m");
            return;
        }
        if (n <= 0 || n >= aN) {
            k5.h("Kh\u00f4ng th\u1ec3 tr\u1ee5c xu\u1ea5t ng\u01b0\u1eddi n\u00e0y");
            return;
        }
        k0 k02 = k5.af(aM[n]);
        int n2 = k5.U(k02);
        if (k02 == null || n2 < 0) {
            k5.h("Kh\u00f4ng th\u1ec3 tr\u1ee5c xu\u1ea5t ng\u01b0\u1eddi n\u00e0y");
            return;
        }
        aK &= ~(1 << n2);
        k02.J = 0;
        int n3 = n;
        while (n3 < aN - 1) {
            k5.aM[n3] = aM[n3 + 1];
            ++n3;
        }
        k5.aM[--k5.aN] = 0;
        if (aK == 0) {
            aO = -1;
        }
        k5.U();
        k5.O();
        k5.N();
    }

    private static void T(int n) throws Exception {
        if (aN == 0) {
            return;
        }
        if (!k5.R()) {
            k5.h("B\u1ea1n kh\u00f4ng ph\u1ea3i tr\u01b0\u1edfng nh\u00f3m");
            return;
        }
        if (n <= 0 || n >= aN) {
            k5.h("Kh\u00f4ng th\u1ec3 nh\u01b0\u1eddng cho ng\u01b0\u1eddi n\u00e0y");
            return;
        }
        int n2 = aM[0];
        k5.aM[0] = aM[n];
        k5.aM[n] = n2;
        k5.S();
        DoHoang091.a((byte)-30, new byte[]{-87, (byte)n});
        k5.N();
    }

    private static void Q() {
        if (aN > 0) {
            return;
        }
        aN = 1;
        k5.aM[0] = DoHoang091.s();
    }

    private static boolean R() {
        return aN > 0 && aM[0] == DoHoang091.s();
    }

    private static int c(byte[] byArray) {
        return byArray != null && byArray.length > 0 ? byArray[0] & 0xFF : -1;
    }

    private static int d(byte[] byArray) {
        return byArray != null && byArray.length > 1 ? byArray[1] & 0xFF : -1;
    }

    private static void S() {
        int n = aN > 0 ? aM[0] : 0;
        int n2 = 0;
        while (n2 < aw.length) {
            k5.aw[n2].J = (aK & 1 << n2) != 0 ? n : 0;
            ++n2;
        }
    }

    private static void T() {
        int n = 0;
        while (n < aM.length) {
            k5.aM[n] = 0;
            ++n;
        }
    }

    private static void h(String string) throws Exception {
        DoHoang091.a(string);
    }

    private static void U() throws Exception {
        k5.Q();
        DoHoang091.k0 k02 = DoHoang091.z();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(120);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeBoolean(aL);
        int n = 0;
        while (n < aN) {
            int n2 = aM[n];
            if (n2 == DoHoang091.s()) {
                dataOutputStream.writeInt(n2);
                dataOutputStream.writeByte(k02.bx);
                dataOutputStream.writeUTF(k02.a);
            } else {
                k0 k03 = k5.af(n2);
                if (k03 != null) {
                    dataOutputStream.writeInt(k03.a);
                    dataOutputStream.writeByte(k03.d);
                    dataOutputStream.writeUTF(k03.b);
                }
            }
            ++n;
        }
        dataOutputStream.flush();
        DoHoang091.a((byte)82, byteArrayOutputStream.toByteArray());
    }

    private static void V() throws Exception {
        int n = 0;
        while (n < aw.length) {
            k5.aw[n].J = 0;
            ++n;
        }
        aK = 0;
        aN = 0;
        aO = -1;
        k5.T();
        DoHoang091.a((byte)83, new byte[0]);
        k5.O();
        k5.N();
    }

    private static void W() throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(100);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int n = 0;
        while (n < aw.length) {
            if (k5.aw[n].ad) {
                dataOutputStream.writeByte(k5.aw[n].d);
                dataOutputStream.writeByte(k5.aw[n].j);
                dataOutputStream.writeUTF(k5.aw[n].b);
                dataOutputStream.writeByte((aK & 1 << n) != 0 ? 2 : 1);
            }
            ++n;
        }
        dataOutputStream.flush();
        DoHoang091.a((byte)-30, k5.d((byte)-77, byteArrayOutputStream.toByteArray()));
    }

    private static void j(k0 k02) throws Exception {
        if (k5.F()) {
            return;
        }
        if (k02 == null || k5.h(k02.a)) {
            DoHoang091.b("Ng\u01b0\u1eddi n\u00e0y \u0111ang thi \u0111\u1ea5u");
            return;
        }
        if (aQ != 0) {
            k5.Y();
        }
        aQ = k02.a;
        k5.aa();
        k5.Z();
        aY = k5.l(k02);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(k02.b.length() + 3);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(k02.b);
        dataOutputStream.flush();
        DoHoang091.a((byte)37, byteArrayOutputStream.toByteArray());
        k5.k(k02);
    }

    private static void k(k0 k02) throws Exception {
        if (k02 == null || k02.a != aQ) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8 + aZ * 5);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(aY);
        dataOutputStream.writeByte(aZ);
        int n = 0;
        while (n < aZ) {
            dataOutputStream.writeShort(ba[n]);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeShort(bb[n]);
            ++n;
        }
        dataOutputStream.flush();
        DoHoang091.a((byte)45, byteArrayOutputStream.toByteArray());
    }

    private static void X() throws Exception {
        if (aQ == 0) {
            return;
        }
        try {
            int n = 0;
            int n2 = 0;
            while (n2 < aZ) {
                if (ba[n2] >= 0 && bb[n2] > 0) {
                    ++n;
                }
                ++n2;
            }
            DoHoang091.k0 k02 = DoHoang091.z();
            int n3 = 0;
            n2 = 0;
            while (n2 < k02.K.length) {
                if (k02.K[n2] < 0) {
                    ++n3;
                }
                ++n2;
            }
            if (n > n3) {
                DoHoang091.b("H\u00e0nh trang c\u1ee7a b\u1ea1n kh\u00f4ng \u0111\u1ee7 ch\u1ed7 tr\u1ed1ng");
                DoHoang091.a((byte)57, new byte[0]);
                return;
            }
            DoHoang091.a((byte)46, new byte[0]);
            n2 = 0;
            while (n2 < aZ) {
                if (ba[n2] >= 0 && bb[n2] > 0) {
                    k16.a(ba[n2], (int)bb[n2], false, (byte)0, (byte)0);
                }
                ++n2;
            }
            if (aY > 0) {
                k32.a(aY);
            }
            DoHoang091.a((byte)58, k5.ag(k32.a()));
        }
        finally {
            aQ = 0;
            aY = 0;
            k5.aa();
            k5.N();
        }
    }

    private static void Y() throws Exception {
        aQ = 0;
        aY = 0;
        k5.aa();
        DoHoang091.a((byte)57, new byte[0]);
    }

    private static void Z() {
        short s = aZ > 0 ? ba[0] : (short)-1;
        aZ = 1 + DoHoang091.g(ba.length);
        int n = (DoHoang091.g(at.length) + aX++) % at.length;
        if (s >= 0 && at.length > 1 && at[n] == s) {
            n = (n + 1 + DoHoang091.g(at.length - 1)) % at.length;
        }
        int n2 = 0;
        while (n2 < ba.length) {
            if (n2 >= aZ) {
                k5.ba[n2] = -1;
                k5.bb[n2] = 0;
            } else {
                short s2;
                k5.ba[n2] = s2 = at[(n + n2) % at.length];
                k5.bb[n2] = (short)(k5.a(s2) ? 1 + DoHoang091.g(20) : 1);
            }
            ++n2;
        }
    }

    private static boolean a(short s) {
        return s == 17 || s == 18 || s == 19 || s == 28;
    }

    private static int l(k0 k02) {
        int n = k02 == null ? aX : k02.P ^ aX * 1103515245;
        int n2 = 25 + Math.abs(n % 976);
        long l = (long)n2 * 1000000L;
        if (l > 1000000000L) {
            l = 1000000000L;
        }
        return (int)l;
    }

    private static void aa() {
        aZ = 0;
        int n = 0;
        while (n < ba.length) {
            k5.ba[n] = -1;
            k5.bb[n] = 0;
            ++n;
        }
    }

    private static void m(k0 k02) throws Exception {
        if (k5.F()) {
            return;
        }
        if (k02 == null || k02.U) {
            return;
        }
        if (k5.h(k02.a)) {
            DoHoang091.b("Ng\u01b0\u1eddi n\u00e0y \u0111ang thi \u0111\u1ea5u");
            return;
        }
        k02.A = DoHoang091.r();
        k02.B = k5.ak();
        k02.ad = true;
        k02.C = (short)(DoHoang091.u() + 40);
        k02.D = (short)DoHoang091.v();
        aP = k02.a;
        aS = 0;
        aT = 0L;
        aV = 0;
        aU = System.currentTimeMillis() + 180L;
        if (!aB[k5.U(k02)]) {
            k5.P(k5.U(k02));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(k02.a);
        dataOutputStream.writeInt(DoHoang091.s());
        dataOutputStream.flush();
        DoHoang091.a((byte)66, byteArrayOutputStream.toByteArray());
        k5.N();
    }

    private static void e(byte[] byArray) throws Exception {
        int n;
        int n2;
        boolean bl;
        Object object;
        Object object2 = null;
        if (byArray != null) {
            int n3 = 0;
            while (n3 + 4 <= byArray.length) {
                object = k5.af(k5.a(byArray, n3));
                if (object != null) {
                    object2 = object;
                    break;
                }
                n3 += 4;
            }
        }
        if (object2 == null) {
            Object object3 = object2 = aP == 0 ? null : k5.af(aP);
        }
        if (object2 == null || ((k0)object2).U || !k5.q((k0)object2)) {
            return;
        }
        object = k25.d();
        if (object == null) {
            return;
        }
        int n4 = DoHoang091.r();
        boolean bl2 = bl = ((k0)object2).F == 3 && (n4 == 129 || n4 == 160 || n4 == 161);
        if (!bl && k5.h(((k0)object2).a)) {
            DoHoang091.b("Ng\u01b0\u1eddi n\u00e0y \u0111ang thi \u0111\u1ea5u");
            return;
        }
        if (!bl && !k5.a((k0)object2, (k25.k0)object)) {
            return;
        }
        if (((k25.k0)object).a == 42) {
            DoHoang091.a((int)((k0)object2).C, (int)((k0)object2).D);
        }
        DoHoang091.k0 k02 = DoHoang091.A();
        DoHoang091.k0 k03 = DoHoang091.z();
        if (!k9.b(k02.bx & 0xFF, k03.t, k03.u, ((k0)object2).C, ((k0)object2).D, ((k25.k0)object).f, ((k25.k0)object).g)) {
            return;
        }
        if (!k25.a((k25.k0)object)) {
            return;
        }
        k0.k0 k04 = k0.b(k02);
        boolean bl3 = k9.a(k04.g, DoHoang091.g(1000));
        int n5 = 0;
        if (kd.c(11)) {
            bl3 = true;
            n5 = k04.k;
        }
        int n6 = n2 = Math.max(1, DoHoang091.b(k04.d, k04.c) / 4);
        if (bl3) {
            n = k9.b(n2, k04.i, k04.j, n5, k04.h / 4);
            long l = (long)n2 + (long)n / 3L;
            int n7 = l < 1L ? 1 : (n6 = l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l);
        }
        if ((n6 = k9.a(n6, n = k9.d(k02.bx & 0xFF), ((k0)object2).v, ((k0)object2).w, ((k0)object2).x, 0, 0, 0, 0, 0, 0, k04.w, k04.x, k04.y, k04.z, n2, false)) <= 0) {
            n6 = 1;
        }
        if (k9.a(DoHoang091.g(((k0)object2).s + 100), DoHoang091.g(k04.e + 100), false)) {
            n6 = 0;
        }
        if (k30.a(((k0)object2).a, n6)) {
            return;
        }
        if (k1d.a(((k0)object2).a, n6)) {
            return;
        }
        if (((k0)object2).a != aP && ((k0)object2).a != aR) {
            aS = ((k0)object2).a;
            aT = System.currentTimeMillis() + 100L + (long)Math.abs(((k0)object2).P % 240);
        }
        if (n6 > 0 && k5.j(((k0)object2).a, ((k0)object2).K++)) {
            return;
        }
        if (n6 > 0) {
            ((k0)object2).l -= n6;
            if (((k0)object2).l < 0) {
                ((k0)object2).l = 0;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(24);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(((k0)object2).a);
        dataOutputStream.writeInt(((k0)object2).l);
        dataOutputStream.writeInt(bl3 ? -n6 : n6);
        dataOutputStream.writeInt(((k0)object2).n);
        dataOutputStream.writeInt(0);
        dataOutputStream.flush();
        DoHoang091.a((byte)62, byteArrayOutputStream.toByteArray());
        if (n6 > 0) {
            k7.c(((k0)object2).a, ((k25.k0)object).a);
        }
        if (((k0)object2).l == 0) {
            if (((k0)object2).a == aP) {
                k5.ab();
                return;
            }
            if (((k0)object2).a == aR) {
                k18.e(2);
                k5.ae();
                DoHoang091.H();
            }
            k5.o((k0)object2);
        }
        k5.N();
    }

    static void b(int n, int n2, int n3, int n4) throws Exception {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        if (n4 <= 0) {
            return;
        }
        k0 k02 = k5.af(n);
        if (k02 == null || k02.U || k02.l <= 0) {
            return;
        }
        if (n3 >= 0 && n3 <= 127) {
            byteArrayOutputStream = new ByteArrayOutputStream(12);
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(n2);
            dataOutputStream.writeByte(n3);
            dataOutputStream.writeInt(k02.a);
            dataOutputStream.flush();
            DoHoang091.a((byte)61, byteArrayOutputStream.toByteArray());
        }
        k02.l -= n4;
        if (k02.l < 0) {
            k02.l = 0;
        }
        byteArrayOutputStream = new ByteArrayOutputStream(24);
        dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(k02.a);
        dataOutputStream.writeInt(k02.l);
        dataOutputStream.writeInt(n4);
        dataOutputStream.writeInt(k02.n);
        dataOutputStream.writeInt(0);
        dataOutputStream.flush();
        DoHoang091.a((byte)62, byteArrayOutputStream.toByteArray());
        if (k02.l == 0) {
            k5.o(k02);
        }
        k5.N();
    }

    private static boolean a(k0 k02, k25.k0 k03) throws Exception {
        if (k02 == null || k02.U || k02.l <= 0 || k03 == null || k03.d != 1) {
            return false;
        }
        int n = DoHoang091.r();
        if (k9.c(n) || k5.V(n)) {
            DoHoang091.b("Kh\u00f4ng \u0111\u01b0\u1ee3c pk \u1edf trong tr\u01b0\u1eddng ho\u1eb7c l\u00e0ng.");
            return false;
        }
        return k5.n(k02);
    }

    private static boolean n(k0 k02) throws Exception {
        boolean bl;
        if (k02 == null || k02.U || k02.l <= 0) {
            return false;
        }
        int n = DoHoang091.r();
        if (k9.c(n) || k5.V(n)) {
            return false;
        }
        int n2 = k18.b(DoHoang091.z());
        int n3 = k02.e & 0xFF;
        int n4 = k5.U(k02);
        boolean bl2 = n4 >= 0 && (aK & 1 << n4) != 0;
        boolean bl3 = (n2 == 6 && (n3 == 4 || n3 == 5) || n2 == 4 && (n3 == 5 || n3 == 6) || n2 == 5 && (n3 == 4 || n3 == 6)) && !bl2;
        boolean bl4 = (n3 == 3 || n2 == 3) && !bl2;
        boolean bl5 = n2 == 1 && n3 == 1 && !bl2;
        boolean bl6 = aP == k02.a;
        boolean bl7 = bl = aR == k02.a;
        return bl3 || bl4 || bl5 || bl6 || bl;
    }

    private static void o(k0 k02) throws Exception {
        if (k02 == null || k02.U) {
            return;
        }
        k02.l = 0;
        k02.U = true;
        k02.aq = false;
        k02.V = System.currentTimeMillis() + 4000L;
        if (aS == k02.a) {
            aS = 0;
            aT = 0L;
        }
        DoHoang091.a((byte)0, k5.ag(k02.a));
        k5.N();
    }

    private static void b(long l) throws Exception {
        if (aw == null || aw.length == 0) {
            return;
        }
        int n = k5.J(aw.length);
        boolean bl = false;
        while (n-- > 0) {
            k0 k02;
            int n2 = k5.ac(aw.length);
            if (!k5.a(n2, k02 = aw[n2], l)) continue;
            bl = true;
        }
        if (bl) {
            bg = true;
        }
    }

    private static void c(long l) throws Exception {
        boolean bl = false;
        int n = 0;
        while (n < aw.length) {
            k0 k02 = aw[n];
            if (k5.a(n, k02, l)) {
                bl = true;
            }
            ++n;
        }
        if (bl) {
            k5.N();
        }
    }

    private static boolean a(int n, k0 k02, long l) throws Exception {
        if (k02 == null || !k02.U || k02.V <= 0L || l < k02.V) {
            return false;
        }
        k02.U = false;
        k02.V = 0L;
        k02.l = k02.k;
        k02.n = k02.m;
        k02.Q = 2000000000;
        if (aB[n]) {
            k5.Q(n);
            if (k02.ad && k02.A == DoHoang091.r() && k02.B == k5.ak()) {
                k5.P(n);
            }
        }
        return true;
    }

    static boolean z() {
        return aQ != 0;
    }

    static boolean A() {
        return aP != 0;
    }

    static boolean B() {
        return aR != 0;
    }

    static void C() throws Exception {
        if (aR != 0) {
            k5.ae();
        }
    }

    static void D() throws Exception {
        k5.ab();
    }

    private static void ab() throws Exception {
        k5.ac();
    }

    private static void ac() throws Exception {
        if (aP == 0) {
            return;
        }
        k0 k02 = k5.af(aP);
        DoHoang091.k0 k03 = DoHoang091.z();
        DoHoang091.b(k03);
        if (k02 != null) {
            k02.l = k02.k;
            k02.n = k02.m;
            k02.U = false;
            k02.V = 0L;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(12);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(DoHoang091.s());
        dataOutputStream.writeInt(k02 == null ? 0 : k02.a);
        dataOutputStream.writeInt(k03.x);
        dataOutputStream.flush();
        DoHoang091.a((byte)67, byteArrayOutputStream.toByteArray());
        DoHoang091.c(k03);
        if (k02 != null) {
            k5.p(k02);
        }
        aP = 0;
        aV = 0;
        aU = 0L;
        DoHoang091.G();
        DoHoang091.H();
        k5.N();
    }

    private static void c(boolean bl) throws Exception {
        int n;
        if (aP == 0) {
            return;
        }
        k0 k02 = k5.af(aP);
        DoHoang091.k0 k03 = DoHoang091.z();
        int n2 = bl ? DoHoang091.s() : (n = k02 == null ? 0 : k02.a);
        int n3 = bl ? (k02 == null ? 0 : k02.a) : DoHoang091.s();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(12);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(n);
        dataOutputStream.writeInt(n3);
        dataOutputStream.writeInt(0);
        dataOutputStream.flush();
        DoHoang091.a((byte)67, byteArrayOutputStream.toByteArray());
        DoHoang091.b(k03);
        if (k02 != null) {
            k02.l = k02.k;
            k02.n = k02.m;
            k02.U = false;
            k02.V = 0L;
        }
        DoHoang091.c(k03);
        if (k02 != null) {
            k5.p(k02);
        }
        aP = 0;
        aV = 0;
        aU = 0L;
        DoHoang091.G();
        DoHoang091.H();
        k5.N();
        if (bl) {
            DoHoang091.b("B\u1ea1n \u0111\u00e3 thua t\u1ef7 th\u00ed do r\u1eddi kh\u1ecfi khu v\u1ef1c.");
        } else {
            DoHoang091.b(String.valueOf(k02 == null ? "\u0110\u1ed1i th\u1ee7" : k02.b) + " \u0111\u00e3 thua t\u1ef7 th\u00ed do r\u1eddi kh\u1ecfi khu v\u1ef1c.");
        }
    }

    private static void p(k0 k02) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(20);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeInt(k02.a);
        dataOutputStream.writeInt(k02.l);
        dataOutputStream.writeInt(0);
        dataOutputStream.writeInt(k02.n);
        dataOutputStream.writeInt(0);
        dataOutputStream.flush();
        DoHoang091.a((byte)62, byteArrayOutputStream.toByteArray());
    }

    private static void d(long l) throws Exception {
        if (aP == 0) {
            return;
        }
        k0 k02 = k5.af(aP);
        if (!k5.q(k02)) {
            k5.c(false);
            return;
        }
        if (l < aU) {
            return;
        }
        if (DoHoang091.z().z) {
            k5.ab();
            return;
        }
        if (k02.l <= 0) {
            k5.ab();
            return;
        }
        if (k5.c(k02, aV)) {
            ++aV;
        }
        aU = l + 180L;
    }

    private static boolean q(k0 k02) throws Exception {
        return k02 != null && k02.ad && k02.A == DoHoang091.r() && k02.B == k5.ak();
    }

    private static void ad() throws Exception {
        if (aR == 0) {
            return;
        }
        if (!k5.q(k5.af(aR))) {
            k5.ae();
        }
    }

    private static boolean c(k0 k02, int n) throws Exception {
        return k5.a(k02, n, false);
    }

    static boolean i(int n, int n2) throws Exception {
        k5.I();
        return k5.a(k5.af(n), n2, true);
    }

    private static boolean a(k0 k02, int n, boolean bl) throws Exception {
        if (k02 == null || k02.U || DoHoang091.z().z || !k5.q(k02)) {
            return false;
        }
        if (kd.a()) {
            bx = -1;
            return false;
        }
        long l = System.currentTimeMillis();
        k25.k0 k03 = k5.e(k02, n, l);
        if (k03 == null) {
            return false;
        }
        int n2 = k03.a;
        int n3 = DoHoang091.r();
        if (!bl && (k9.c(n3) || k5.V(n3))) {
            bx = -1;
            return false;
        }
        if (bl && n3 != 129) {
            bx = -1;
            return false;
        }
        int n4 = DoHoang091.u();
        int n5 = DoHoang091.v();
        if (k5.aa(k02.d & 0xFF) && k5.ab(DoHoang091.z().bx & 0xFF) && k9.a(k02.C, k02.D, n4, n5, 96) && k5.a(k02.P, n, l, 100) < 68) {
            k5.a(k02, n4, n5, l, n);
        }
        if (!k9.b(k02.d & 0xFF, k02.C, k02.D, n4, n5, k03.f, k03.g)) {
            k5.a(k02, n4, n5, 24, l);
            bx = -1;
            return false;
        }
        if (k02.n < k03.h) {
            k5.u(k02);
        }
        if (k02.n < k03.h) {
            bx = -1;
            return false;
        }
        k02.n -= k03.h;
        k5.a(k03, l);
        int n6 = k25.a(k03, Math.max(1, k02.o));
        int n7 = k5.a(n6, k02);
        DoHoang091.e(k02.a, n2, n7);
        return true;
    }

    private static int a(int n, k0 k02) throws Exception {
        int n2;
        DoHoang091.k0 k03 = DoHoang091.A();
        k0.k0 k04 = k0.b(k03);
        int n3 = k9.d(k02.d & 0xFF);
        boolean bl = false;
        if (kd.a(39)) {
            bl = DoHoang091.g(100) < kd.e(39);
        }
        int n4 = Math.max(1, n);
        n4 = k9.a(n4, n3, k04.n, k04.o, k04.p, k04.t, k04.u, k04.v, k04.q, k04.r, k04.s, 0, 0, 0, 0, n4, bl);
        n4 = k9.b(n4, k04.A);
        long l = (long)(n4 = k9.a(n4, kd.b(37), k04.B)) * (long)(n2 = 6 - (DoHoang091.z().r - k02.j) / 40) / 100L;
        int n5 = l < 1L ? 1 : (n4 = l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l);
        if (n4 <= 0) {
            n4 = 1;
        }
        if (k9.a(DoHoang091.g(k04.f + 100), DoHoang091.g(k02.r + 100), kd.b(7))) {
            return 0;
        }
        return n4;
    }

    private static void r(k0 k02) throws Exception {
        if (k5.F()) {
            return;
        }
        if (k02 == null) {
            return;
        }
        if (k5.h(k02.a)) {
            DoHoang091.b("Ng\u01b0\u1eddi n\u00e0y \u0111ang thi \u0111\u1ea5u");
            return;
        }
        if (k02.U) {
            return;
        }
        if (DoHoang091.z().z) {
            return;
        }
        if (aR != 0) {
            return;
        }
        if (!k5.af()) {
            return;
        }
        aR = k02.a;
        aS = 0;
        aT = 0L;
        aW = 0;
        k02.A = DoHoang091.r();
        k02.B = k5.ak();
        k02.ad = true;
        if (!aB[k5.U(k02)]) {
            k5.P(k5.U(k02));
        }
        DoHoang091.a((byte)69, k5.ag(k02.a));
        long l = System.currentTimeMillis();
        aI = l + 180L;
        k02.aq = false;
        k02.ar = 0;
        if (DoHoang091.g(100) < 35 && k5.s(k02)) {
            aI = l;
        }
        k5.N();
    }

    private static void ae() throws Exception {
        int n = aR;
        k0 k02 = k5.af(n);
        if (k02 != null) {
            k02.aq = false;
            k02.ar = 0;
        }
        aR = 0;
        aW = 0;
        aI = 0L;
        DoHoang091.a((byte)70, k5.ag(n));
    }

    private static boolean s(k0 k02) {
        if (k02 == null) {
            return false;
        }
        int[] nArray = DoHoang091.b(k02.A, k02.C, k02.D);
        if (nArray == null) {
            return false;
        }
        k02.ar = nArray[0];
        k02.as = (short)nArray[1];
        k02.at = (short)nArray[2];
        k02.au = (short)nArray[3];
        k02.av = (short)nArray[4];
        k02.aq = true;
        k02.af = 0L;
        return true;
    }

    private static boolean a(k0 k02, long l) throws Exception {
        if (k02 == null || !k02.aq) {
            return false;
        }
        if (!k5.q(k02)) {
            k5.ae();
            return false;
        }
        if (Math.abs(k02.C - k02.as) <= 28 && Math.abs(k02.D - k02.at) <= 28) {
            int n = k02.ar;
            short s = k02.au;
            short s2 = k02.av;
            k02.aq = false;
            k02.ar = 0;
            if (!DoHoang091.i(n) || n == DoHoang091.r()) {
                k5.ae();
                return false;
            }
            k5.a(k02, n, 0, (int)s, (int)s2, l);
            k5.ae();
            k5.N();
            return false;
        }
        k5.a(k02, (int)k02.as, (int)k02.at, 36, l);
        return true;
    }

    private static void e(long l) throws Exception {
        if (aR == 0) {
            return;
        }
        k0 k02 = k5.af(aR);
        if (k02 == null) {
            k5.ae();
            return;
        }
        if (k02.aq) {
            if (l < aI) {
                return;
            }
            if (k5.a(k02, l) && aR != 0) {
                aI = l + 120L;
            }
            return;
        }
        if (l < aI) {
            return;
        }
        if (!k5.q(k02) || !k5.af()) {
            k5.ae();
            return;
        }
        if (k02.U) {
            k5.ae();
            return;
        }
        k5.u(k02);
        if (k5.c(k02, aW)) {
            ++aW;
        }
        aI = l + 180L;
    }

    private static void f(long l) throws Exception {
        if (aS == 0 || l < aT) {
            return;
        }
        k0 k02 = k5.af(aS);
        if (k02 == null || k02.U || DoHoang091.z().z || !k5.q(k02) || !k5.n(k02) || k5.h(k02.a)) {
            aS = 0;
            aT = 0L;
            return;
        }
        k5.u(k02);
        boolean bl = k5.c(k02, k02.K + (int)(l / 180L));
        aT = l + (bl ? 180L : 100L) + (long)Math.abs((k02.P >>> 5) % 120);
    }

    private static boolean af() throws Exception {
        int n = DoHoang091.r();
        if (k5.U(n)) {
            DoHoang091.b("Kh\u00f4ng \u0111\u01b0\u1ee3c c\u1eebu s\u00e1t \u1edf trong tr\u01b0\u1eddng ho\u1eb7c l\u00e0ng.");
            return false;
        }
        if (k5.V(n)) {
            DoHoang091.b("Kh\u00f4ng th\u1ec3 s\u1eed d\u1ee5ng t\u00ednh n\u0103ng n\u00e0y.");
            return false;
        }
        return true;
    }

    private static boolean U(int n) {
        switch (n) {
            case 1: 
            case 10: 
            case 17: 
            case 22: 
            case 27: 
            case 32: 
            case 38: 
            case 43: 
            case 48: 
            case 72: 
            case 98: 
            case 133: 
            case 138: 
            case 162: {
                return true;
            }
        }
        return false;
    }

    private static boolean V(int n) {
        if (n == 111 || n == 129 || n == 149 || n == 160 || n == 161 || n == 168 || n == 130 || n == 131 || n == 132 || n == 133) {
            return true;
        }
        return DoHoang091.x() == 3;
    }

    private static void g(long l) throws Exception {
        if (aK == 0) {
            return;
        }
        int n = DoHoang091.r();
        if (k14.a(n)) {
            return;
        }
        int n2 = k5.ak();
        int n3 = DoHoang091.u();
        int n4 = DoHoang091.v();
        boolean bl = aO >= 0 && aO < DoHoang091.w() && DoHoang091.k(aO);
        int n5 = bl ? DoHoang091.q(aO) : n3;
        int n6 = bl ? DoHoang091.r(aO) : n4;
        k5.c(n, n2, n5, n6);
        int n7 = k5.K(Math.max(0, aN - 1));
        while (n7-- > 0) {
            int n8;
            int n9;
            k0 k02 = k5.ar();
            if (k02 == null || (n9 = k5.U(k02)) < 0 || k02.U || (n8 = k5.t(k02)) < 0) continue;
            int n10 = s[n8];
            int n11 = t[n8];
            if (k02.A != n || k02.B != n2) {
                k02.A = n;
                k02.B = n2;
                k02.C = (short)n10;
                k02.D = (short)n11;
                k02.ad = true;
            }
            if (l < k02.af) continue;
            if (Math.abs(k02.C - n10) <= 8 && Math.abs(k02.D - n11) <= 6) {
                k02.ap = false;
                k02.af = l + k5.T(k02);
                continue;
            }
            short s = k02.C;
            short s2 = k02.D;
            int n12 = bl ? 56 : 28;
            int n13 = bl ? 44 : 22;
            k02.C = (short)k9.a((int)k02.C, n10, n12);
            k02.D = (short)k9.a((int)k02.D, n11, n13);
            k02.ao = (byte)(k02.ao + 1);
            k02.af = l + k5.T(k02);
            if (k02.C == s && k02.D == s2) continue;
            if (!aB[n9]) {
                k5.P(n9);
            } else {
                k5.b(k02);
            }
            k02.ae = l;
            bg = true;
        }
    }

    private static void c(int n, int n2, int n3, int n4) throws Exception {
        int n5 = DoHoang091.t(n);
        int n6 = 24;
        int n7 = n5 > 48 ? n5 - 24 : Math.max(24, n5 - 1);
        int n8 = DoHoang091.s() ^ n * 31 ^ n2 * 17;
        int n9 = (n8 & Integer.MAX_VALUE) % r.length;
        int n10 = (n8 & 1) == 0 ? 1 : -1;
        int n11 = 0;
        int n12 = 0;
        while (n12 < aN && n11 < s.length) {
            int n13;
            k0 k02 = k5.af(aM[n12]);
            if (k02 != null && (n13 = k5.U(k02)) >= 0 && (aK & 1 << n13) != 0) {
                int n14;
                int n15;
                int n16;
                int n17 = (n9 + n11 * 2) % r.length;
                int n18 = k5.c(n3 + n10 * r[n17], n6, n7);
                int n19 = DoHoang091.c(n, n18, n4 - 24);
                int n20 = Math.abs(n19 - n4);
                int n21 = 0;
                while (n21 < r.length) {
                    n16 = (n17 + n21) % r.length;
                    n15 = k5.c(n3 + n10 * r[n16], n6, n7);
                    if (!k5.m(n15, n11)) {
                        n14 = DoHoang091.c(n, n15, n4 - 24);
                        int n22 = Math.abs(n14 - n4);
                        if (n21 == 0 || n22 < n20 || k5.m(n18, n11)) {
                            n18 = n15;
                            n19 = n14;
                            n20 = n22;
                        }
                        if (n22 <= 48) break;
                    }
                    ++n21;
                }
                if (k5.m(n18, n11)) {
                    n16 = n10;
                    n15 = n18;
                    n14 = 0;
                    while (n14++ < 10 && k5.m(n15, n11)) {
                        if ((n15 = k5.c(n15 + n16 * 24, n6, n7)) != n6 && n15 != n7) continue;
                        n16 = -n16;
                    }
                    n18 = n15;
                    n19 = DoHoang091.c(n, n18, n4 - 24);
                }
                k5.s[n11] = n18;
                k5.t[n11] = n19;
                ++n11;
            }
            ++n12;
        }
    }

    private static int c(int n, int n2, int n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }

    private static boolean m(int n, int n2) {
        int n3 = 0;
        while (n3 < n2) {
            if (Math.abs(s[n3] - n) < 24) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    private static int t(k0 k02) {
        int n = 0;
        int n2 = 0;
        while (n2 < aN) {
            int n3;
            k0 k03 = k5.af(aM[n2]);
            if (k03 != null && (n3 = k5.U(k03)) >= 0 && (aK & 1 << n3) != 0) {
                if (k03 == k02) {
                    return n;
                }
                ++n;
            }
            ++n2;
        }
        return -1;
    }

    private static boolean a(k0 k02, int n, int n2, int n3, long l) throws Exception {
        if (k02 == null || k02.U) {
            return false;
        }
        short s = k02.C;
        short s2 = k02.D;
        k02.C = (short)k9.a((int)k02.C, n, n3);
        k02.D = (short)k9.a((int)k02.D, n2, Math.max(8, n3 / 2));
        k02.ae = l;
        int n4 = k5.U(k02);
        if (n4 >= 0 && (k02.C != s || k02.D != s2)) {
            if (!aB[n4]) {
                k5.P(n4);
            } else {
                k5.b(k02);
            }
            bg = true;
        }
        return k02.C == (short)n && k02.D == (short)n2;
    }

    private static void h(long l) throws Exception {
        int n = DoHoang091.r();
        int n2 = k5.ak();
        be = be * 1103515245 + 12345;
        int n3 = k5.J(aw.length);
        while (n3-- > 0) {
            int n4;
            int n5 = k5.M(aw.length);
            k0 k02 = aw[n5];
            if (!k02.ad || k02.F == 1 || k5.h(k02.a) || (aK & 1 << n5) != 0 || l - k02.ae < 650L) continue;
            int n6 = k02.A;
            int n7 = k02.B;
            long l2 = l / 180000L;
            if (((k02.P ^ (int)l2 ^ n5) & 0x1F) == 0) {
                n4 = (n5 + (int)l2 + (k02.P >>> 5 & 7)) % ag.length;
                k02.A = ag[n4];
                k02.B = 0;
                k02.C = (short)ah[n4];
                k02.D = (short)ai[n4];
            } else {
                n4 = k02.P ^ be ^ (int)(l / 650L);
                k02.C = (short)(k02.C + (n4 >> (n5 & 7) & 7) - 3);
                k02.D = (short)(k02.D + (n4 >> (n5 + 3 & 7) & 3) - 1);
            }
            if (k02.C < 24) {
                k02.C = (short)24;
            }
            if (k02.C > 3000) {
                k02.C = (short)3000;
            }
            if (k02.D < 24) {
                k02.D = (short)24;
            }
            if (k02.D > 3200) {
                k02.D = (short)3200;
            }
            k02.ae = l;
            if (n6 == n && k02.A == n && k02.B == n2 && aB[n5]) {
                k5.b(k02);
            }
            if (n6 != k02.A || n7 != k02.B) {
                k5.d(n5, n, n2);
            }
            bg = true;
        }
    }

    private static void d(int n, int n2, int n3) throws Exception {
        boolean bl;
        k0 k02 = aw[n];
        boolean bl2 = bl = az && k02.ad && k02.A == n2 && k02.B == n3;
        if (bl && !aB[n]) {
            k5.P(n);
        } else if (!bl && aB[n]) {
            k5.Q(n);
        }
    }

    private static boolean i(long l) throws Exception {
        if (DoHoang091.w() == 0) {
            return false;
        }
        int n = DoHoang091.r();
        int n2 = k5.ak();
        int n3 = k5.J(aw.length);
        while (n3-- > 0) {
            int n4 = k5.ad(aw.length);
            k0 k02 = aw[n4];
            if (!k02.ad || !aB[n4] || k02.A != n || k02.B != n2 || k02.F == 1 || k5.h(k02.a) || k02.U || (aK & 1 << n4) != 0 || (k02.aw & 0xFF) == 2) continue;
            k5.u(k02);
            int n5 = DoHoang091.w();
            int n6 = -1;
            int n7 = k5.L(n5);
            while (n7-- > 0) {
                int n8 = k5.N(n5);
                if (!DoHoang091.k(n8)) continue;
                n6 = n8;
                break;
            }
            if (n6 < 0) {
                return false;
            }
            if (k5.a(k02, n6, l, false)) {
                if ((l / 420L & 0xFL) == 0L) {
                    k5.N();
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private static void u(k0 k02) {
        if (k02 == null || k02.U) {
            return;
        }
        int n = k02.k * 45 / 100;
        int n2 = k02.m * 40 / 100;
        if (k02.l <= n) {
            if (k02.W > 0) {
                k02.W = (short)(k02.W - 1);
                k02.l = Math.min(k02.k, k02.l + Math.max(1, k02.k * 30 / 100));
                k02.n = Math.min(k02.m, k02.n + Math.max(1, k02.m * 12 / 100));
            } else if (k02.X > 0) {
                k02.X = (short)(k02.X - 1);
                k02.l = Math.min(k02.k, k02.l + Math.max(1, k02.k * 55 / 100));
            }
        }
        if (k02.n <= n2 && k02.Y > 0) {
            k02.Y = (short)(k02.Y - 1);
            k02.n = Math.min(k02.m, k02.n + Math.max(1, k02.m * 60 / 100));
        }
        if (k02.W <= 1) {
            k02.W = (short)16;
        }
        if (k02.X <= 1) {
            k02.X = (short)14;
        }
        if (k02.Y <= 1) {
            k02.Y = (short)14;
        }
        k02.Q = 2000000000;
    }

    private static void j(long l) throws Exception {
        k5.l(l);
        if (aw != null && aw.length > 0) {
            int n = be + (int)(l / 30000L);
            int n2 = (n & Integer.MAX_VALUE) % aw.length;
            int n3 = 0;
            while (n3 < aw.length) {
                k0 k02 = aw[(n2 + n3) % aw.length];
                if (k02.ad) {
                    if (DoHoang091.g(100) >= 25 || !k18.a(k02.b, l)) break;
                    k02.Q = 2000000000;
                    bf = true;
                    break;
                }
                ++n3;
            }
        }
        if (bf) {
            k5.M();
            bf = false;
        }
    }

    private static void k(long l) throws Exception {
        if (aw == null || aw.length == 0 || l < aG) {
            return;
        }
        if (aP != 0 || aS != 0 || aR != 0) {
            return;
        }
        aG = l + 900L;
        int n = Math.min(3, aw.length);
        boolean bl = false;
        while (n-- > 0) {
            int n2 = k5.ae(aw.length);
            k0 k02 = aw[n2];
            if (k02 == null || !k02.ad || k02.U || k5.h(k02.a)) continue;
            int n3 = k5.v(k02);
            if (k02.ax != (byte)n3) {
                k02.ax = (byte)n3;
                k02.aA = 0;
                bl = true;
            }
            if (!k5.a(k02, n3, l)) continue;
            if (k02.aA < Integer.MAX_VALUE) {
                ++k02.aA;
            }
            bl = true;
        }
        if (bl && l >= aH) {
            k5.N();
            aH = l + 30000L;
        }
    }

    private static int v(k0 k02) throws Exception {
        if (k02 == null) {
            return 1;
        }
        int n = k5.U(k02);
        if (n >= 0 && (aK & 1 << n) != 0) {
            return 2;
        }
        if (k5.M(k02) && k2f.e() && k2f.d(DoHoang091.r())) {
            return 5;
        }
        int n2 = k02.aw & 0xFF;
        if (n2 == 2) {
            return 6;
        }
        if (k10.h() >= 0 && n2 != 3) {
            return 3;
        }
        if (ke.A() && k5.ag() && n2 != 2) {
            return 4;
        }
        return 1;
    }

    private static boolean ag() {
        int n = DoHoang091.w();
        int n2 = 0;
        while (n2 < n) {
            if (DoHoang091.k(n2) && k10.b(DoHoang091.p(n2))) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static boolean a(k0 k02, int n, long l) throws Exception {
        if (n == 2) {
            if (aO < 0 || aO >= DoHoang091.w() || !DoHoang091.k(aO)) {
                return false;
            }
            if (k02.A != DoHoang091.r() || k02.B != k5.ak()) {
                return false;
            }
            return k5.d(k02, aO, l);
        }
        if (n == 5) {
            return k5.e(k02, l);
        }
        if (n == 3) {
            return k5.d(k02, l);
        }
        if (n == 4) {
            return k5.c(k02, l);
        }
        if (n == 6) {
            return k5.f(k02, l);
        }
        return k5.b(k02, l);
    }

    private static boolean b(k0 k02, long l) throws Exception {
        int n = DoHoang091.r();
        int n2 = k5.ak();
        k02.ay = n;
        if (k02.A != n || k02.B != n2) {
            k5.a(k02, n, n2, DoHoang091.u(), DoHoang091.v(), l);
            return true;
        }
        int n3 = k5.b(0, k02);
        return n3 >= 0 && k5.a(k02, n3, l, false);
    }

    private static boolean c(k0 k02, long l) throws Exception {
        int n = DoHoang091.r();
        int n2 = k5.ak();
        k02.ay = n;
        if (k02.A != n || k02.B != n2) {
            k5.a(k02, n, n2, DoHoang091.u(), DoHoang091.v(), l);
            return true;
        }
        int n3 = k5.b(2, k02);
        return n3 >= 0 && k5.a(k02, n3, l, false);
    }

    private static boolean d(k0 k02, long l) throws Exception {
        int n;
        int n2 = k10.h();
        if (n2 < 0) {
            return false;
        }
        k02.ay = n2;
        int n3 = n = n2 == DoHoang091.r() ? k5.ak() : 0;
        if (k02.A != n2 || k02.B != n) {
            k5.a(k02, n2, n, k10.j(), k10.k(), l);
            return true;
        }
        if (n2 != DoHoang091.r()) {
            return k5.a(k02, l, n2, k10.i(), k10.j(), k10.k());
        }
        int n4 = k5.b(1, k02);
        return n4 >= 0 && k5.a(k02, n4, l, false);
    }

    private static boolean a(k0 k02, long l, int n, int n2, int n3, int n4) throws Exception {
        if (k02 == null || k02.U || n < 0 || n2 < 0) {
            return false;
        }
        int n5 = k02.K + (int)(l / 420L);
        k25.k0 k03 = k5.e(k02, n5, l);
        if (k03 == null) {
            return false;
        }
        if (k02.n < k03.h) {
            k5.u(k02);
        }
        if (k02.n < k03.h) {
            bx = -1;
            return false;
        }
        k02.n -= k03.h;
        k5.a(k03, l);
        int n6 = k25.a(k03, Math.max(1, k02.o));
        int n7 = k10.a(n, n2, (short)n3, (short)n4, Math.max(1, n6), k02.a);
        if (n7 <= 0) {
            return false;
        }
        ++k02.K;
        if (!k02.U) {
            k5.u(k02);
        }
        return true;
    }

    private static boolean e(k0 k02, long l) throws Exception {
        int n = DoHoang091.r();
        if (!k2f.d(n)) {
            return false;
        }
        k2f.a(k02.b);
        k5.ah();
        int n2 = k5.ak();
        if (k02.A != n || k02.B != n2) {
            k5.a(k02, n, n2, DoHoang091.u(), DoHoang091.v(), l);
            return true;
        }
        int n3 = k5.b(0, k02);
        if (n3 < 0 || !k5.a(k02, n3, l, false)) {
            return false;
        }
        if (k02.aC < Integer.MAX_VALUE) {
            ++k02.aC;
        }
        if (k02.aC % 5 == 0 && k18.a(k02.b, k02.N & 0xFFFF, 1, 2) && k02.aB < Integer.MAX_VALUE) {
            ++k02.aB;
        }
        return true;
    }

    private static void ah() throws Exception {
        if (aN <= 0 || aL || !k5.R() || aN >= 6) {
            return;
        }
        int n = -1;
        int n2 = -1;
        int n3 = 0;
        while (n3 < aw.length) {
            k0 k02 = aw[n3];
            if (k02 != null && !k02.U && k02.ad && k5.M(k02) && (aK & 1 << n3) == 0) {
                int n4;
                int n5 = k02.aw & 0xFF;
                int n6 = n5 == 3 ? 5 : (n5 == 1 ? 4 : (n4 = n5 == 4 ? 3 : 1));
                if (n4 > n2) {
                    n = n3;
                    n2 = n4;
                }
            }
            ++n3;
        }
        if (n >= 0) {
            k5.i(aw[n]);
        }
    }

    private static int b(int n, k0 k02) {
        int n2 = DoHoang091.w();
        if (n2 <= 0) {
            return -1;
        }
        int n3 = -1;
        int n4 = 0;
        while (n4 < n2) {
            int n5 = k5.N(n2);
            if (DoHoang091.k(n5)) {
                int n6 = DoHoang091.p(n5);
                if (n3 < 0) {
                    n3 = n5;
                }
                if (n == 1 && DoHoang091.o(n5)) {
                    if (k02 != null) {
                        k02.az = n6;
                    }
                    return n5;
                }
                if (n == 2 && k10.b(n6)) {
                    if (k02 != null) {
                        k02.az = n6;
                    }
                    return n5;
                }
                if (n == 0 && !DoHoang091.o(n5) && !k10.b(n6)) {
                    if (k02 != null) {
                        k02.az = n6;
                    }
                    return n5;
                }
            }
            ++n4;
        }
        if (n == 1 || n == 2) {
            n4 = 0;
            while (n4 < n2) {
                if (DoHoang091.k(n4)) {
                    if (n == 1 && DoHoang091.o(n4)) {
                        return n4;
                    }
                    if (n == 2 && k10.b(DoHoang091.p(n4))) {
                        return n4;
                    }
                }
                ++n4;
            }
        }
        return n == 0 ? n3 : -1;
    }

    private static void a(k0 k02, int n, int n2, int n3, int n4, long l) throws Exception {
        if (k02 == null || !DoHoang091.i(n)) {
            return;
        }
        int n5 = k5.U(k02);
        k02.A = n;
        k02.B = Math.max(0, n2);
        k02.C = (short)Math.max(24, Math.min(3000, n3));
        k02.D = (short)Math.max(24, Math.min(3200, n4));
        k02.ad = true;
        k02.ae = l;
        k02.af = 0L;
        if (n5 >= 0) {
            k5.d(n5, DoHoang091.r(), k5.ak());
        }
        bg = true;
    }

    private static boolean f(k0 k02, long l) throws Exception {
        int n = k18.a(k02.b, k02.j, k5.w(k02), l);
        if (n < 0) {
            return false;
        }
        int n2 = n & 0xFFF;
        byte by = (byte)(n >>> 12 & 0xFF);
        byte by2 = (byte)(n >>> 20 & 0xFF);
        k02.N = (short)n2;
        k02.O = 1;
        if (k02.aD < Integer.MAX_VALUE) {
            ++k02.aD;
        }
        k5.a(k02, n2, by, by2);
        return true;
    }

    private static int w(k0 k02) {
        if (k02 == null) {
            return 10000000;
        }
        int n = k02.aw & 0xFF;
        if (n == 2) {
            return 100000000;
        }
        if (n == 1 || n == 4) {
            return 60000000;
        }
        if (n == 3) {
            return 30000000;
        }
        return 40000000;
    }

    private static void a(k0 k02, int n, byte by, byte by2) throws Exception {
        if (k02 == null || n < 0) {
            return;
        }
        int n2 = k16.E(n);
        if (n2 < 0 || n2 > 9 || !k16.D(n)) {
            return;
        }
        int n3 = k16.F(n);
        if (n3 > k02.j + 10) {
            return;
        }
        int n4 = n3 * 100000 + (by & 0xFF) * 1000 + Math.max(1, n / 100);
        if (n4 <= k02.aI) {
            return;
        }
        k02.aE = (short)n;
        k02.aF = by;
        k02.aG = (byte)n2;
        k02.aH = by2;
        k02.aI = n4;
        k5.a(k02);
        k5.a(k02, k5.U(k02), false, k5.x(k02));
        int n5 = k5.U(k02);
        if (n5 >= 0 && aB[n5]) {
            k5.Q(n5);
            if (k02.ad && k02.A == DoHoang091.r() && k02.B == k5.ak()) {
                k5.P(n5);
            }
        }
    }

    static int a(int n, long l) throws Exception {
        k5.I();
        k5.l(l);
        int n2 = 0;
        int n3 = 0;
        while (n3 < aw.length) {
            k0 k02 = aw[n3];
            int n4 = 0;
            while (n4 < 4) {
                if (k5.b(k02, n4, l) && k5.b(k02.Z[n4]) == n) {
                    ++n2;
                }
                ++n4;
            }
            ++n3;
        }
        return n2;
    }

    static void a(int n, DataOutputStream dataOutputStream, long l) throws Exception {
        k5.I();
        k5.l(l);
        int n2 = 0;
        while (n2 < aw.length) {
            k0 k02 = aw[n2];
            int n3 = 0;
            while (n3 < 4) {
                if (k5.b(k02, n3, l) && k5.b(k02.Z[n3]) == n) {
                    dataOutputStream.writeInt(k5.n(n2, n3));
                    dataOutputStream.writeInt(k5.c(k02, n3, l));
                    dataOutputStream.writeShort(k02.aa[n3]);
                    dataOutputStream.writeUTF(k02.b);
                    dataOutputStream.writeInt(k02.ab[n3]);
                    dataOutputStream.writeShort(k02.Z[n3]);
                }
                ++n3;
            }
            ++n2;
        }
    }

    static boolean F(int n) {
        int n2 = n - 10000;
        return n2 >= 0 && n2 < 120;
    }

    static boolean b(int n, DataOutputStream dataOutputStream, long l) throws Exception {
        k0 k02 = k5.W(n);
        int n2 = k5.X(n);
        if (k02 == null || n2 < 0 || !k5.b(k02, n2, l)) {
            return false;
        }
        int n3 = k02.Z[n2] & 0xFFFF;
        dataOutputStream.writeInt(n);
        dataOutputStream.writeInt(k16.M(n3));
        if (k16.D(n3)) {
            k16.k0 k03 = k16.a(n3, k5.j(k02, 1), (byte)0, k5.H(n));
            dataOutputStream.writeByte(k03.c);
            dataOutputStream.writeByte(k03.b);
            int n4 = 0;
            while (n4 < k03.f.length) {
                dataOutputStream.writeByte(k03.f[n4]);
                dataOutputStream.writeInt(k03.g[n4]);
                ++n4;
            }
        }
        return true;
    }

    static int b(int n, long l) {
        int n2;
        k0 k02;
        block3: {
            try {
                k02 = k5.W(n);
                n2 = k5.X(n);
                if (k02 != null && n2 >= 0 && k5.b(k02, n2, l)) break block3;
                return -1;
            }
            catch (Exception exception) {
                return -1;
            }
        }
        return k02.Z[n2] & 0xFFFF;
    }

    static int c(int n, long l) {
        k0 k02 = k5.W(n);
        int n2 = k5.X(n);
        if (k02 == null || n2 < 0 || !k5.b(k02, n2, l)) {
            return 0;
        }
        return k02.aa[n2] & 0xFFFF;
    }

    static int d(int n, long l) {
        k0 k02 = k5.W(n);
        int n2 = k5.X(n);
        if (k02 == null || n2 < 0 || !k5.b(k02, n2, l)) {
            return -1;
        }
        return k02.ab[n2];
    }

    static byte G(int n) {
        k0 k02 = k5.W(n);
        return k02 == null ? (byte)0 : k5.j(k02, 1);
    }

    static int H(int n) {
        k0 k02 = k5.W(n);
        int n2 = k5.X(n);
        if (k02 == null || n2 < 0) {
            return n * 1103515245;
        }
        int n3 = k02.P ^ n * 8191 ^ k02.ab[n2];
        n3 ^= (int)k02.ac[n2];
        return n3 ^= (int)(k02.ac[n2] >>> 32);
    }

    static boolean e(int n, long l) {
        k0 k02 = k5.W(n);
        int n2 = k5.X(n);
        if (k02 == null || n2 < 0 || !k5.b(k02, n2, l)) {
            return false;
        }
        k5.d(k02, n2);
        k02.Q = 2000000000;
        bf = true;
        return true;
    }

    private static void l(long l) {
        if (aw == null) {
            return;
        }
        boolean bl = false;
        int n = 0;
        while (n < aw.length) {
            k0 k02 = aw[n];
            if (k02 != null) {
                int n2 = 0;
                while (n2 < 4) {
                    if (!k5.b(k02, n2, l)) {
                        k5.a(k02, n, n2, l);
                        bl = true;
                    }
                    ++n2;
                }
            }
            ++n;
        }
        if (bl) {
            bf = true;
        }
    }

    private static void a(k0 k02, int n, int n2, long l) {
        short s;
        int n3 = (int)(l / 86400000L);
        int n4 = k02.P ^ n * 65537 ^ n2 * 8191 ^ n3;
        n4 ^= n4 >>> 16;
        n4 *= 1103515245;
        n4 ^= n4 >>> 13;
        int n5 = au.length - 1;
        int n6 = (n + n2 * 5 + n3) % n5;
        if (n6 < 0) {
            n6 += n5;
        }
        int n7 = au[n6] & 0xFFFF;
        int n8 = au[n6 + 1] & 0xFFFF;
        int n9 = n7 + (n4 & Integer.MAX_VALUE) % (n8 - n7);
        k02.Z[n2] = s = av[n9];
        k02.aa[n2] = (short)(k5.c(s) ? 3 + (n4 >>> 8 & 0x3F) : 1);
        k02.ab[n2] = k5.d(n4, n, n2, n3);
        k02.ac[n2] = l + 86400000L;
    }

    private static int d(int n, int n2, int n3, int n4) {
        int n5 = n & Integer.MAX_VALUE;
        int n6 = n2 + n3 + n4 & 3;
        int n7 = n6 == 0 ? 1000 + n5 % 99 * 1000 : (n6 == 1 ? 100000 + n5 % 900 * 1000 : (n6 == 2 ? 1000000 + n5 % 900 * 10000 : 10000000 + n5 % 901 * 100000));
        return n7 > 100000000 ? 100000000 : n7;
    }

    private static boolean b(k0 k02, int n, long l) {
        return k02 != null && n >= 0 && n < 4 && k02.Z != null && k02.aa != null && k02.ab != null && k02.ac != null && k02.Z[n] >= 0 && k02.aa[n] > 0 && k02.ab[n] > 0 && k02.ac[n] > l;
    }

    private static int b(short s) throws Exception {
        int n = k16.E(s & 0xFFFF);
        if (n == 26) {
            return 0;
        }
        if (n >= 0 && n <= 9) {
            return n + 1;
        }
        return 11;
    }

    private static int n(int n, int n2) {
        return 10000 + n * 4 + n2;
    }

    private static k0 W(int n) {
        int n2 = n - 10000;
        if (n2 < 0 || aw == null) {
            return null;
        }
        int n3 = n2 / 4;
        return n3 >= 0 && n3 < aw.length ? aw[n3] : null;
    }

    private static int X(int n) {
        int n2 = n - 10000;
        if (n2 < 0) {
            return -1;
        }
        int n3 = n2 % 4;
        return n3 >= 0 && n3 < 4 ? n3 : -1;
    }

    private static int c(k0 k02, int n, long l) {
        long l2 = k02.ac[n] - l;
        if (l2 <= 0L) {
            return 0;
        }
        long l3 = (l2 + 999L) / 1000L;
        return l3 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l3;
    }

    private static boolean c(short s) {
        try {
            return k16.N(s & 0xFFFF);
        }
        catch (Exception exception) {
            return false;
        }
    }

    private static void d(k0 k02, int n) {
        if (k02 == null || n < 0 || n >= 4) {
            return;
        }
        k02.Z[n] = -1;
        k02.aa[n] = 0;
        k02.ab[n] = 0;
        k02.ac[n] = 0L;
    }

    private static int Y(int n) {
        n = Math.max(1, n);
        int n2 = n * 10;
        if (n >= 70) {
            n2 += (n - 70) * 10;
        }
        if (n >= 80) {
            n2 += (n - 80) * 10;
        }
        if (n >= 90) {
            n2 += (n - 90) * 10;
        }
        if (n >= 100) {
            n2 += (n - 100) * 10;
        }
        if (n >= 130) {
            n2 += (n - 130) * 10;
        }
        return n2;
    }

    private static int Z(int n) {
        return Math.max(0, Math.max(1, n) - 9);
    }

    private static void b(k0 k02, int n, boolean bl) {
        k5.a(k02, n, bl, e);
    }

    private static synchronized void a(k0 k02, int n, boolean bl, int[] nArray) {
        int n2;
        if (k02 == null) {
            return;
        }
        int n3 = k02.k;
        int n4 = k02.l;
        int n5 = k02.m;
        int n6 = k02.n;
        k02.R = n2 = k5.Y(k02.j);
        k02.S = k5.Z(k02.j);
        int n7 = n2 * (34 + Math.abs(k02.P % 9)) / 100;
        int n8 = n2 * (28 + Math.abs((k02.P >>> 4) % 9)) / 100;
        int n9 = Math.max(0, n2 - n7 - n8);
        int n10 = 0;
        int[] nArray2 = nArray == null ? e : nArray;
        int[] nArray3 = e;
        try {
            nArray3 = k25.f(k02.d & 0xFF, k02.j);
        }
        catch (Exception exception) {}
        int n11 = 0;
        while (n11 < 16) {
            int n12 = k5.i(k02, n11) & 0xFF;
            if (n11 < 10) {
                n10 += n12;
            }
            ++n11;
        }
        long l = 50L + (long)n8 * 10L + (long)k02.j * 25L + (long)n10 * 80L;
        long l2 = 100L + (long)n9 * 6L + (long)k02.j * 12L + (long)n10 * 24L;
        long l3 = 10L + (long)n7 * 2L + (long)k02.j * 6L + (long)n10 * 30L;
        l += (long)(k5.a(nArray2, 6) + k5.a(nArray2, 32) + k5.a(nArray2, 77) + k5.a(nArray2, 82) + k5.a(nArray2, 125));
        l += l * (long)(k5.a(nArray2, 31) + k5.a(nArray2, 61) + k5.a(nArray2, 128)) / 100L;
        l += l * (long)k5.a(nArray3, 17) / 100L;
        l2 += (long)(k5.a(nArray2, 7) + k5.a(nArray2, 19) + k5.a(nArray2, 29) + k5.a(nArray2, 83) + k5.a(nArray2, 117));
        l2 += l2 * (long)(k5.a(nArray2, 28) + k5.a(nArray2, 60)) / 100L;
        l2 += (l2 + (long)k5.a(nArray3, 18)) / 100L;
        boolean bl2 = (k02.d & 0xFF) == 2 || (k02.d & 0xFF) == 4 || (k02.d & 0xFF) == 6;
        l3 += (long)(bl2 ? k5.a(nArray2, 1) : k5.a(nArray2, 0));
        l3 += (long)(k5.a(nArray2, 21) + k5.a(nArray2, 22) + k5.a(nArray2, 23) + k5.a(nArray2, 24) + k5.a(nArray2, 25) + k5.a(nArray2, 26) + k5.a(nArray2, 73) + k5.a(nArray2, 76) + k5.a(nArray2, 87));
        l3 += (long)(k5.a(nArray3, 8) + k5.a(nArray3, 6) + k5.a(nArray3, 9) + k5.a(nArray3, 7) + k5.a(nArray3, 1));
        l3 += (long)n7 * (long)k5.a(nArray2, bl2 ? 9 : 8) / 100L;
        l3 += (long)(n7 * 4) * (long)k5.a(nArray2, 94) / 100L;
        int n13 = k5.j(k02, 0) & 0xFF;
        if (n13 == 1) {
            l3 += (long)k5.a(nArray2, 88);
        }
        if (n13 == 2) {
            l3 += (long)k5.a(nArray2, 89);
        }
        if (n13 == 3) {
            l3 += (long)k5.a(nArray2, 90);
        }
        k02.k = k5.m(l);
        k02.m = k5.m(l2);
        k02.o = k5.m(l3);
        int n14 = k5.a(nArray2, 36) + k5.a(nArray2, 118);
        k02.v = k5.a(nArray2, 2) + k5.a(nArray2, 11) + k5.a(nArray2, 33) + k5.a(nArray2, 70) + k5.a(nArray2, 96) + n14;
        k02.w = k5.a(nArray2, 3) + k5.a(nArray2, 12) + k5.a(nArray2, 34) + k5.a(nArray2, 71) + k5.a(nArray2, 95) + n14;
        k02.x = k5.a(nArray2, 4) + k5.a(nArray2, 13) + k5.a(nArray2, 35) + k5.a(nArray2, 72) + k5.a(nArray2, 97) + n14;
        k02.v += k5.a(nArray3, 19) + k5.a(nArray3, 20);
        k02.w += k5.a(nArray3, 19) + k5.a(nArray3, 21);
        k02.x += k5.a(nArray3, 19) + k5.a(nArray3, 22);
        k02.q = k5.a(nArray2, 47) + k5.a(nArray2, 74) + k5.a(nArray2, 80) + k5.a(nArray2, 124);
        k02.q += k5.a(nArray3, 13);
        k02.r = k02.R / 5 + n10 * 3 + k5.a(nArray2, 10) + k5.a(nArray2, 18) + k5.a(nArray2, 75) + k5.a(nArray2, 86) + k5.a(nArray2, 116);
        k02.r += k5.a(nArray3, 12);
        k02.s = k02.R / 6 + n10 * 2 + k5.a(nArray2, 5) + k5.a(nArray2, 17) + k5.a(nArray2, 62) + k5.a(nArray2, 68) + k5.a(nArray2, 78) + k5.a(nArray2, 84) + k5.a(nArray2, 115);
        k02.t = k02.j + n10 * 2 + k5.a(nArray2, 14) + k5.a(nArray2, 37) + k5.a(nArray2, 69) + k5.a(nArray2, 92) + k5.a(nArray2, 114);
        k02.t += k5.a(nArray3, 14);
        k02.u = k02.j / 2 + n10 + k5.a(nArray2, 15) + k5.a(nArray2, 91) + k5.a(nArray2, 126);
        k02.u += k5.a(nArray3, 15);
        k02.y = 0;
        k02.z = 0;
        k02.y += k5.a(nArray3, 33);
        k02.p = 5 + k5.a(nArray2, 93);
        k02.l = bl || n3 <= 0 ? k02.k : (k02.U ? 0 : Math.max(1, Math.min(k02.k, (int)Math.min(Integer.MAX_VALUE, (long)Math.max(1, n4) * (long)k02.k / (long)n3))));
        k02.n = bl || n5 <= 0 ? k02.m : Math.max(0, Math.min(k02.m, (int)Math.min(Integer.MAX_VALUE, (long)Math.max(0, n6) * (long)k02.m / (long)n5)));
    }

    private static int a(int[] nArray, int n) {
        return n >= 0 && n < nArray.length ? nArray[n] : 0;
    }

    private static int m(long l) {
        if (l <= 0L) {
            return 1;
        }
        return l > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l;
    }

    private static int[][] ai() {
        short[][] sArray = new short[aw.length][16];
        byte[][] byArray = new byte[aw.length][16];
        int n = 0;
        while (n < aw.length) {
            int n2 = 0;
            while (n2 < 16) {
                sArray[n][n2] = k5.h(aw[n], n2);
                byArray[n][n2] = k5.i(aw[n], n2);
                ++n2;
            }
            ++n;
        }
        int[][] nArray = k16.a(sArray, byArray);
        n = 0;
        while (n < aw.length) {
            k5.a(nArray[n], aw[n]);
            ++n;
        }
        return nArray;
    }

    private static int[] x(k0 k02) {
        short[][] sArray = new short[1][16];
        byte[][] byArray = new byte[1][16];
        int n = 0;
        while (n < 16) {
            sArray[0][n] = k5.h(k02, n);
            byArray[0][n] = k5.i(k02, n);
            ++n;
        }
        int[] nArray = k16.a(sArray, byArray)[0];
        k5.a(nArray, k02);
        return nArray;
    }

    private static void a(int[] nArray, k0 k02) {
        if (nArray == null || k5.J(k02) < 0) {
            return;
        }
        int n = 0;
        while (n < 4) {
            int n2 = k5.l(k02, n);
            if (n2 >= 0 && n2 < nArray.length) {
                int n3 = n2;
                nArray[n3] = nArray[n3] + k5.m(k02, n2);
            }
            ++n;
        }
    }

    static void I(int n) {
        if (!az || aK == 0 || n < 0) {
            return;
        }
        if (n >= DoHoang091.w() || !DoHoang091.k(n)) {
            aO = -1;
            return;
        }
        aO = n;
        int n2 = 0;
        while (n2 < aw.length) {
            if ((aK & 1 << n2) != 0) {
                k5.aw[n2].af = 0L;
            }
            ++n2;
        }
        aD = 0L;
    }

    private static void aj() throws Exception {
        if (aK == 0 || aO < 0 || aO >= DoHoang091.w() || !DoHoang091.k(aO)) {
            aO = -1;
            return;
        }
        int n = DoHoang091.r();
        int n2 = k5.ak();
        int n3 = 5;
        while (n3-- > 0) {
            k0 k02 = k5.as();
            if (k02 == null || !k02.ad || k02.A != n || k02.B != n2) continue;
            k5.d(k02, aO, System.currentTimeMillis());
        }
    }

    private static boolean d(k0 k02, int n, long l) throws Exception {
        if (k02 == null || k02.U) {
            return false;
        }
        k5.u(k02);
        return k5.a(k02, n, l, true);
    }

    private static boolean a(k0 k02, int n, long l, boolean bl) throws Exception {
        int n2;
        if (k02 == null || k02.U || !DoHoang091.k(n)) {
            return false;
        }
        int n3 = k02.K + n + (int)(l / 420L);
        k25.k0 k03 = k5.e(k02, n3, l);
        if (k03 == null) {
            return false;
        }
        int n4 = k03.a;
        int n5 = DoHoang091.q(n);
        int n6 = DoHoang091.r(n);
        int n7 = DoHoang091.p(n);
        int n8 = k02.aw & 0xFF;
        if (k5.aa(k02.d & 0xFF) && n8 != 1 && n8 != 4 && k9.a(k02.C, k02.D, n5, n6, 72) && k5.a(k02.P, n, l, 100) < 58) {
            k5.a(k02, n5, n6, l, n);
        }
        if (k03.a == 42) {
            k02.C = (short)n5;
            k02.D = (short)n6;
            n2 = k5.U(k02);
            if (n2 >= 0 && aB[n2]) {
                k5.b(k02);
            }
        }
        if (!k9.a(k02.C, k02.D, n5, n6, k03.f, k03.g, n7)) {
            n2 = bl ? 26 : (n8 == 1 || n8 == 4 ? 30 : 22);
            k5.a(k02, n5, n6, n2, l);
            bx = -1;
            return false;
        }
        if (k02.n < k03.h) {
            k5.u(k02);
        }
        if (k02.n < k03.h) {
            bx = -1;
            return false;
        }
        k02.n -= k03.h;
        k5.a(k03, l);
        n2 = k25.a(k03, Math.max(1, k02.o));
        int n9 = Math.max(1, n2);
        int n10 = DoHoang091.d(k02.a, n, n9, n4);
        if (n10 <= 0) {
            return false;
        }
        k5.a(k02, n, n10);
        ++k02.K;
        k5.g(k02, n, l);
        if (!k02.U) {
            k5.u(k02);
        }
        return true;
    }

    private static k25.k0 e(k0 k02, int n) throws Exception {
        if (k02 == null) {
            return null;
        }
        int n2 = k02.d & 0xFF;
        if (k02.ah == null || k02.ai != k02.j || (k02.aj & 0xFF) != n2) {
            k02.ah = k25.a(n2, k02.j, k02.P);
            k02.ai = k02.j;
            k02.aj = (byte)n2;
        }
        return k25.b(k02.ah, n2, k02.j, n);
    }

    private static k25.k0 e(k0 k02, int n, long l) throws Exception {
        bx = -1;
        if (k02 == null) {
            return null;
        }
        k25.k0 k03 = k5.e(k02, n);
        if (k03 == null || k02.ah == null || k02.ah.length < 1) {
            return null;
        }
        int n2 = k02.ah[0] & 0xFF;
        if (n2 <= 0) {
            return null;
        }
        if (n2 > 10) {
            n2 = 10;
        }
        int n3 = n ^ k02.P ^ (int)(l / 120L);
        n3 ^= n3 >>> 16;
        int n4 = (n3 & Integer.MAX_VALUE) % n2;
        int n5 = k5.U(k02);
        if (n5 < 0) {
            return null;
        }
        int n6 = 0;
        while (n6 < n2) {
            k25.k0 k04;
            int n7 = (n4 + n6) % n2;
            int n8 = n5 * 10 + n7;
            if ((bw[n8] == 0L || l >= bw[n8]) && (k04 = k25.b(k02.ah, k02.d & 0xFF, k02.j, n7)) != null) {
                bx = n8;
                return k04;
            }
            ++n6;
        }
        return null;
    }

    private static void a(k25.k0 k02, long l) {
        int n = bx;
        bx = -1;
        if (k02 == null || n < 0 || n >= bw.length) {
            return;
        }
        long l2 = Math.max(0, k02.i);
        k5.bw[n] = l2 > Long.MAX_VALUE - l ? Long.MAX_VALUE : l + l2;
    }

    private static k25.k1 f(k0 k02, int n) throws Exception {
        if (k02 == null) {
            return null;
        }
        int n2 = k02.d & 0xFF;
        if (k02.ak == null || k02.al != k02.j || (k02.am & 0xFF) != n2) {
            k02.ak = k25.e(n2, k02.j);
            k02.al = k02.j;
            k02.am = (byte)n2;
        }
        return k25.a(k02.ak, n2, k02.j, n);
    }

    private static k25.k1 f(k0 k02, int n, long l) throws Exception {
        int n2;
        bz = -1;
        if (k02 == null) {
            return null;
        }
        k25.k1 k110 = k5.f(k02, n);
        if (k110 == null || k02.ak == null || k02.ak.length < 1) {
            return null;
        }
        int n3 = k02.ak[0] & 0xFF;
        if (n3 <= 0) {
            return null;
        }
        if (n3 > 10) {
            n3 = 10;
        }
        if ((n2 = k5.U(k02)) < 0) {
            return null;
        }
        int n4 = n ^ k02.P ^ (int)(l / 120L);
        n4 ^= n4 >>> 16;
        int n5 = (n4 & Integer.MAX_VALUE) % n3;
        int n6 = 0;
        while (n6 < n3) {
            int n7;
            int n8 = (n5 + n6) % n3;
            k25.k1 k111 = k25.a(k02.ak, k02.d & 0xFF, k02.j, n8);
            if (!(k111 == null || k111.d != 2 && k111.d != 4 || k111.d == 4 && !k5.a(k02, k111) || by[n7 = n2 * 10 + n8] != 0L && l < by[n7])) {
                bz = n7;
                return k111;
            }
            ++n6;
        }
        return null;
    }

    private static void a(k25.k1 k110, long l) {
        int n = bz;
        bz = -1;
        if (k110 == null || n < 0 || n >= by.length) {
            return;
        }
        long l2 = Math.max(0, k110.h);
        k5.by[n] = l2 > Long.MAX_VALUE - l ? Long.MAX_VALUE : l + l2;
    }

    private static int a(k25.k1 k110) {
        if (k110 == null) {
            return 0;
        }
        long l = (long)Math.max(0, k110.e) * (long)Math.max(0, k110.e) + (long)Math.max(0, k110.f) * (long)Math.max(0, k110.f);
        if (l <= 0L) {
            return 0;
        }
        long l2 = (long)Math.sqrt(l);
        return l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2;
    }

    private static boolean a(k0 k02, k25.k1 k110) throws Exception {
        if (k02 == null || k110 == null || k110.a != 49 || k110.d != 4) {
            return false;
        }
        int n = k5.a(k110);
        if (n <= 0) {
            return false;
        }
        DoHoang091.k0 k03 = DoHoang091.z();
        if (k03.z && k9.a(k02.C, k02.D, k03.t, k03.u, n)) {
            return true;
        }
        int n2 = 0;
        while (n2 < aN) {
            k0 k04 = k5.af(aM[n2]);
            if (k04 != null && k04 != k02 && k04.U && k04.A == k02.A && k04.B == k02.B && k9.a(k02.C, k02.D, k04.C, k04.D, n)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static boolean b(k0 k02, k25.k1 k110) throws Exception {
        if (!k5.a(k02, k110)) {
            return false;
        }
        int n = k5.a(k110);
        DoHoang091.k0 k03 = DoHoang091.z();
        Object object = null;
        long l = Long.MAX_VALUE;
        if (k03.z && k9.a(k02.C, k02.D, k03.t, k03.u, n)) {
            long l2 = (long)k02.C - (long)k03.t;
            long l3 = (long)k02.D - (long)k03.u;
            l = l2 * l2 + l3 * l3;
            object = k03;
        }
        int n2 = -1;
        int n3 = 0;
        while (n3 < aN) {
            long l4;
            long l5;
            long l6;
            k0 k04 = k5.af(aM[n3]);
            if (k04 != null && k04 != k02 && k04.U && k04.A == k02.A && k04.B == k02.B && k9.a(k02.C, k02.D, k04.C, k04.D, n) && (l6 = (l5 = (long)k02.C - (long)k04.C) * l5 + (l4 = (long)k02.D - (long)k04.D) * l4) < l) {
                l = l6;
                object = k04;
                n2 = k5.U(k04);
            }
            ++n3;
        }
        if (object == k03) {
            DoHoang091.b(k03);
            DoHoang091.g();
            DoHoang091.c(k03);
            DoHoang091.G();
            DoHoang091.H();
            return true;
        }
        if (n2 < 0) {
            return false;
        }
        k0 k05 = (k0)object;
        k05.U = false;
        k05.V = 0L;
        k05.l = k05.k;
        k05.n = k05.m;
        k05.Q = 2000000000;
        if (aB[n2]) {
            k5.Q(n2);
            if (k05.ad && k05.A == DoHoang091.r() && k05.B == k5.ak()) {
                k5.P(n2);
            }
        }
        return true;
    }

    private static void n(long l) throws Exception {
        if (aK == 0 || aN <= 1) {
            return;
        }
        int n = 5;
        while (n-- > 0) {
            k25.k1 k110;
            k0 k02 = k5.at();
            if (k02 == null || !k02.ad || k02.U || (k110 = k5.f(k02, k02.K + (int)(l / 120L), l)) == null) continue;
            if (k02.n < k110.g) {
                k5.u(k02);
            }
            if (k02.n < k110.g) {
                bz = -1;
                continue;
            }
            k02.n -= k110.g;
            int n2 = bz;
            k5.a(k110, l);
            ++k02.an;
            if (k110.d == 4) {
                if (!k5.b(k02, k110)) {
                    k02.n += k110.g;
                    if (n2 >= 0 && n2 < by.length) {
                        k5.by[n2] = 0L;
                    }
                    --k02.an;
                }
            } else {
                k25.a(k110);
            }
            if (k02.U) continue;
            k5.u(k02);
        }
    }

    static int a(int n, int n2, int n3, long l) throws Exception {
        return k5.b(n, n2, n3, l);
    }

    static int b(int n, int n2, int n3, long l) throws Exception {
        k5.I();
        k0 k02 = k5.af(n);
        k0 k03 = k5.af(n2);
        if (k02 == null || k03 == null || k02.U || k03.U || !k5.h(n) || !k5.h(n2)) {
            return -1;
        }
        k25.k0 k04 = k5.e(k02, n3, l);
        if (k04 == null) {
            return -1;
        }
        if (k02.n < k04.h) {
            k5.u(k02);
        }
        if (k02.n < k04.h) {
            bx = -1;
            return -1;
        }
        k02.n -= k04.h;
        k5.a(k04, l);
        int n4 = k25.a(k04, Math.max(1, k02.o));
        int n5 = 6 - (k03.j - k02.j) / 40;
        if (n5 < 1) {
            n5 = 1;
        }
        long l2 = (long)Math.max(1, n4) * (long)n5 / 100L;
        int n6 = k03.q;
        if (n6 < 0) {
            n6 = 0;
        }
        if (n6 > 70) {
            n6 = 70;
        }
        l2 -= l2 * (long)n6 / 100L;
        int n7 = k9.d(k02.d & 0xFF);
        int n8 = l2 < 1L ? 1 : (l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2);
        if ((n8 = k9.a(n8, n7, k03.v, k03.w, k03.x, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, n8, false)) <= 0) {
            n8 = 1;
        }
        if (k9.a(DoHoang091.g(k03.s + 100), DoHoang091.g(k02.r + 100), false)) {
            return 0;
        }
        l2 = n8;
        int n9 = (k02.P ^ k03.P ^ n3 ^ (int)(l / 120L)) & Integer.MAX_VALUE;
        if ((n9 %= 100) > 94 - Math.min(20, k02.t / 100)) {
            l2 += l2 / 2L;
        }
        if (l2 < 1L) {
            return 1;
        }
        return l2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)l2;
    }

    static int a(int n, int n2, long l) throws Exception {
        k5.I();
        k0 k02 = k5.af(n);
        if (k02 == null || k02.U || DoHoang091.z().z || !k5.h(n) || !k5.q(k02)) {
            return -1;
        }
        if (kd.a()) {
            bx = -1;
            return -1;
        }
        k25.k0 k03 = k5.e(k02, n2, l);
        if (k03 == null) {
            return -1;
        }
        int n3 = DoHoang091.u();
        int n4 = DoHoang091.v();
        if (k5.aa(k02.d & 0xFF) && k5.ab(DoHoang091.z().bx & 0xFF) && k9.a(k02.C, k02.D, n3, n4, 96) && k5.a(k02.P, n2, l, 100) < 68) {
            k5.a(k02, n3, n4, l, n2);
        }
        if (!k9.b(k02.d & 0xFF, k02.C, k02.D, n3, n4, k03.f, k03.g)) {
            k5.a(k02, n3, n4, 24, l);
            bx = -1;
            return -1;
        }
        if (k02.n < k03.h) {
            k5.u(k02);
        }
        if (k02.n < k03.h) {
            bx = -1;
            return -1;
        }
        k02.n -= k03.h;
        int n5 = k03.a;
        k5.a(k03, l);
        int n6 = k25.a(k03, Math.max(1, k02.o));
        int n7 = k5.a(n6, k02);
        DoHoang091.e(k02.a, n5, 0);
        return n7;
    }

    static boolean j(int n, int n2) throws Exception {
        k5.I();
        k0 k02 = k5.af(n);
        DoHoang091.k0 k03 = DoHoang091.z();
        if (!(k02 != null && k03 != null && !k02.U && k5.aa(k02.d & 0xFF) && k5.ab(k03.bx & 0xFF) && k5.q(k02) && k9.a(k02.C, k02.D, k03.t, k03.u, 100))) {
            return false;
        }
        long l = System.currentTimeMillis();
        if (k5.a(k02.P, n2, l, 100) >= 62) {
            return false;
        }
        k5.a(k02, (int)k03.t, (int)k03.u, l, n2);
        return true;
    }

    private static boolean aa(int n) {
        return n == 2 || n == 4 || n == 6;
    }

    private static boolean ab(int n) {
        return n == 0 || n == 1 || n == 3 || n == 5;
    }

    private static int a(int n, int n2, long l, int n3) {
        int n4 = n ^ n2 * 1103515245 ^ (int)(l / 120L);
        n4 ^= n4 >>> 16;
        return n3 <= 1 ? 0 : (n4 & Integer.MAX_VALUE) % n3;
    }

    private static void a(k0 k02, int n, int n2, long l, int n3) throws Exception {
        int n4;
        if (k02 == null) {
            return;
        }
        int n5 = k02.C >= n ? 1 : -1;
        int n6 = k02.C + n5 * (n4 = 42 + k5.a(k02.P, n3 + 17, l, 31));
        if (n6 < 24) {
            n6 = 24;
        }
        if (n6 > 3000) {
            n6 = 3000;
        }
        int n7 = k02.D;
        if (k5.a(k02.P, n3 + 31, l, 100) < 38) {
            n7 -= 24;
        }
        k5.a(k02, n6, n7, 28, l);
    }

    private static void a(k0 k02, int n, int n2) throws Exception {
        int n3 = DoHoang091.m(n);
        int n4 = DoHoang091.p(n);
        if (n4 == 0 || Math.abs(n3 - k02.j) > 10) {
            return;
        }
        int n5 = k02.j / 20;
        if (n5 == 0) {
            n5 = 1;
        }
        long l = (long)n2 * (long)n5;
        long l2 = l / 2L + l * (long)((n3 - k02.j) * n5) / 100L;
        if (DoHoang091.o(n)) {
            l2 /= 100L;
        } else if (DoHoang091.n(n) == 1) {
            l2 *= 2L;
        } else if (DoHoang091.n(n) == 2) {
            l2 *= 5L;
        }
        if (DoHoang091.x() == 2) {
            l2 *= 2L;
        }
        if ((l2 *= 10L) <= 0L) {
            return;
        }
        k02.T = l2 > Long.MAX_VALUE - k02.T ? Long.MAX_VALUE : k02.T + l2;
        int n6 = k02.j;
        k02.j = DoHoang091.a(k02.T);
        if (k02.j > n6) {
            k5.a(k02);
            k5.a(k02, k5.U(k02), false, k5.x(k02));
            int n7 = k5.U(k02);
            if (n7 >= 0 && aB[n7]) {
                k5.Q(n7);
                k5.P(n7);
            }
        }
    }

    private static void g(k0 k02, int n, long l) throws Exception {
        if (k02 == null || k02.U || !DoHoang091.k(n) || l < k02.ag) {
            return;
        }
        if (!k9.a(DoHoang091.o(n), DoHoang091.p(n), DoHoang091.q(n), DoHoang091.r(n), (int)k02.C, (int)k02.D)) {
            return;
        }
        k02.ag = l + 3000L;
        int n2 = DoHoang091.s(n);
        if (n2 <= 0) {
            return;
        }
        int n3 = n2 - n2 / 10;
        int n4 = Math.max(1, n2 - n3 + 1);
        int n5 = n3 + Math.abs((k02.P ^ n ^ (int)(l / 3000L)) % n4);
        if (n5 > k02.l) {
            n5 = k02.l;
        }
        k02.l -= n5;
        k5.p(k02);
        if (k02.l <= 0) {
            k5.o(k02);
        }
    }

    private static void o(long l) throws Exception {
    }

    private static void y(k0 k02) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(40);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeByte(-62);
        dataOutputStream.writeInt(k02 == null ? 0 : k02.a);
        DoHoang091.k0 k03 = DoHoang091.z();
        dataOutputStream.writeUTF(k03.b == null || k03.b.length() == 0 ? "Offline" : k03.b);
        dataOutputStream.writeByte(k5.N(k02));
        dataOutputStream.flush();
        DoHoang091.a((byte)-30, byteArrayOutputStream.toByteArray());
    }

    private static int ak() throws Exception {
        return k18.c();
    }

    static int g(String string) throws Exception {
        k5.I();
        k0 k02 = k5.i(string);
        if (k02 == null || !k02.ad) {
            return 0;
        }
        if (!DoHoang091.i(k02.A)) {
            return -2;
        }
        DoHoang091.a(k02.A, k02.B, (int)k02.C, (int)k02.D);
        return 1;
    }

    private static k0 al() {
        int n;
        try {
            n = DoHoang091.r();
        }
        catch (Exception exception) {
            n = 22;
        }
        int n2 = 0;
        while (n2 < aw.length) {
            if (k5.aw[n2].ad && k5.aw[n2].A == n) {
                return aw[n2];
            }
            ++n2;
        }
        n2 = 0;
        while (n2 < aw.length) {
            if (k5.aw[n2].ad) {
                return aw[n2];
            }
            ++n2;
        }
        return aw.length == 0 ? null : aw[0];
    }

    private static String z(k0 k02) {
        if (k02 == null) {
            return "";
        }
        if (k5.M(k02)) {
            DoHoang091.k0 k03 = DoHoang091.z();
            if (k03.cb[0] > 0 && k03.b != null && k03.b.length() > 0) {
                return k03.b;
            }
        }
        return "";
    }

    private static short A(k0 k02) {
        int n;
        int n2;
        int n3 = n2 = k02 == null ? 1 : k02.d & 0xFF;
        if (n2 < 1 || n2 > aj.length) {
            n2 = 1;
        }
        if (k5.C(k02)) {
            return (short)((k02.c & 0xFF) == 1 ? 799 : 800);
        }
        int n4 = n = k02 == null ? 1 : k02.j;
        if (n >= 100) {
            return (short)(1110 + n2);
        }
        if (n >= 90) {
            return (short)(631 + n2);
        }
        if (n >= 80) {
            return (short)(505 + n2);
        }
        if (n >= 70) {
            return (short)(368 + n2);
        }
        if (n >= 60) {
            return (short)(330 + n2);
        }
        int n5 = Math.max(0, Math.min(4, n / 10 - 1));
        switch (n2) {
            case 1: {
                return (short)(94 + n5);
            }
            case 2: {
                return (short)(114 + n5);
            }
            case 3: {
                return (short)(99 + n5);
            }
            case 4: {
                return (short)(109 + n5);
            }
            case 5: {
                return (short)(104 + n5);
            }
        }
        return (short)(119 + n5);
    }

    private static boolean B(k0 k02) {
        return k02 != null && k02.j >= 30 && Math.abs(k02.P % 5) == 0 && (k02.aE < 0 || (k02.aG & 0xFF) != 2);
    }

    private static boolean C(k0 k02) {
        return k02 != null && k02.j >= 40 && (k02.P >>> 5 & 0xF) == 0 && (k02.aE < 0 || (k02.aG & 0xFF) != 1);
    }

    private static boolean D(k0 k02) {
        return k02 != null && k02.j >= 20 && (k02.P >>> 2 & 3) == 0;
    }

    private static short E(k0 k02) {
        if (k5.B(k02)) {
            return (short)((k02.c & 0xFF) == 1 ? 796 : 795);
        }
        int n = k02.j;
        if ((k02.c & 0xFF) == 1) {
            if (n >= 107) {
                return 1165;
            }
            if (n >= 97) {
                return 620;
            }
            if (n >= 85) {
                return 494;
            }
            if (n >= 77) {
                return 361;
            }
            if (n >= 67) {
                return 323;
            }
            if (n >= 57) {
                return 162;
            }
            if (n >= 47) {
                return 160;
            }
            if (n >= 37) {
                return 158;
            }
            if (n >= 27) {
                return 156;
            }
            if (n >= 17) {
                return 154;
            }
            return 201;
        }
        if (n >= 107) {
            return 1166;
        }
        if (n >= 97) {
            return 621;
        }
        if (n >= 85) {
            return 495;
        }
        if (n >= 77) {
            return 367;
        }
        if (n >= 67) {
            return 329;
        }
        if (n >= 57) {
            return 163;
        }
        if (n >= 47) {
            return 161;
        }
        if (n >= 37) {
            return 159;
        }
        if (n >= 27) {
            return 157;
        }
        if (n >= 17) {
            return 155;
        }
        return 202;
    }

    private static short F(k0 k02) {
        int n = k02.j;
        if ((k02.c & 0xFF) == 1) {
            if (n >= 107) {
                return 289;
            }
            if (n >= 97) {
                return 197;
            }
            if (n >= 85) {
                return 180;
            }
            if (n >= 77) {
                return 154;
            }
            if (n >= 67) {
                return 29;
            }
            if (n >= 57) {
                return 32;
            }
            if (n >= 47) {
                return 36;
            }
            if (n >= 37) {
                return 5;
            }
            if (n >= 27) {
                return 3;
            }
            if (n >= 17) {
                return 7;
            }
            return 1;
        }
        if (n >= 107) {
            return 291;
        }
        if (n >= 97) {
            return 199;
        }
        if (n >= 85) {
            return 183;
        }
        if (n >= 77) {
            return 156;
        }
        if (n >= 67) {
            return 141;
        }
        if (n >= 57) {
            return 42;
        }
        if (n >= 47) {
            return 38;
        }
        if (n >= 37) {
            return 18;
        }
        if (n >= 27) {
            return 20;
        }
        if (n >= 17) {
            return 22;
        }
        return 10;
    }

    private static short G(k0 k02) {
        int n = k02.j;
        if ((k02.c & 0xFF) == 1) {
            if (n >= 103) {
                return 1167;
            }
            if (n >= 93) {
                return 622;
            }
            if (n >= 85) {
                return 496;
            }
            if (n >= 73) {
                return 357;
            }
            if (n >= 63) {
                return 319;
            }
            if (n >= 53) {
                return 142;
            }
            if (n >= 43) {
                return 140;
            }
            if (n >= 33) {
                return 138;
            }
            if (n >= 23) {
                return 136;
            }
            if (n >= 13) {
                return 134;
            }
            return 197;
        }
        if (n >= 103) {
            return 1168;
        }
        if (n >= 93) {
            return 623;
        }
        if (n >= 85) {
            return 497;
        }
        if (n >= 73) {
            return 365;
        }
        if (n >= 63) {
            return 327;
        }
        if (n >= 53) {
            return 143;
        }
        if (n >= 43) {
            return 141;
        }
        if (n >= 33) {
            return 139;
        }
        if (n >= 23) {
            return 137;
        }
        if (n >= 13) {
            return 135;
        }
        return 198;
    }

    private static short H(k0 k02) {
        int n = k02.j;
        if ((k02.c & 0xFF) == 1) {
            if (n >= 103) {
                return 290;
            }
            if (n >= 93) {
                return 198;
            }
            if (n >= 85) {
                return 181;
            }
            if (n >= 73) {
                return 155;
            }
            if (n >= 63) {
                return 30;
            }
            if (n >= 53) {
                return 33;
            }
            if (n >= 43) {
                return 37;
            }
            if (n >= 33) {
                return 6;
            }
            if (n >= 23) {
                return 4;
            }
            if (n >= 13) {
                return 8;
            }
            return 0;
        }
        if (n >= 103) {
            return 292;
        }
        if (n >= 93) {
            return 200;
        }
        if (n >= 85) {
            return 184;
        }
        if (n >= 73) {
            return 157;
        }
        if (n >= 63) {
            return 142;
        }
        if (n >= 53) {
            return 43;
        }
        if (n >= 43) {
            return 39;
        }
        if (n >= 33) {
            return 17;
        }
        if (n >= 23) {
            return 19;
        }
        if (n >= 13) {
            return 21;
        }
        return 9;
    }

    private static short I(k0 k02) {
        boolean bl;
        int n = k02.j;
        boolean bl2 = bl = (k02.c & 0xFF) == 1;
        if (n >= 109) {
            return (short)(bl ? 1163 : 1164);
        }
        if (n >= 99) {
            return (short)(bl ? 618 : 619);
        }
        if (n >= 85) {
            return (short)(bl ? 492 : 493);
        }
        if (n >= 79) {
            return (short)(bl ? 363 : 368);
        }
        if (n >= 69) {
            return (short)(bl ? 325 : 330);
        }
        if (n >= 59) {
            return (short)(bl ? 172 : 173);
        }
        if (n >= 49) {
            return (short)(bl ? 170 : 171);
        }
        if (n >= 39) {
            return (short)(bl ? 168 : 169);
        }
        if (n >= 29) {
            return (short)(bl ? 166 : 167);
        }
        if (n >= 19) {
            return (short)(bl ? 164 : 165);
        }
        return (short)(bl ? 203 : 204);
    }

    private static short o(int n, int n2) {
        if (n == 3) {
            if (n2 >= 108) {
                return 1176;
            }
            if (n2 >= 100) {
                return 1110;
            }
            if (n2 >= 98) {
                return 631;
            }
            if (n2 >= 85) {
                return 505;
            }
            if (n2 >= 78) {
                return 362;
            }
            if (n2 >= 68) {
                return 324;
            }
            if (n2 >= 58) {
                return 193;
            }
            if (n2 >= 48) {
                return 192;
            }
            if (n2 >= 38) {
                return 191;
            }
            if (n2 >= 28) {
                return 190;
            }
            if (n2 >= 18) {
                return 189;
            }
            return 208;
        }
        if (n == 5) {
            if (n2 >= 106) {
                return 1175;
            }
            if (n2 >= 96) {
                return 630;
            }
            if (n2 >= 85) {
                return 504;
            }
            if (n2 >= 76) {
                return 360;
            }
            if (n2 >= 66) {
                return 322;
            }
            if (n2 >= 56) {
                return 188;
            }
            if (n2 >= 46) {
                return 187;
            }
            if (n2 >= 36) {
                return 186;
            }
            if (n2 >= 26) {
                return 185;
            }
            if (n2 >= 16) {
                return 184;
            }
            return 207;
        }
        if (n == 7) {
            if (n2 >= 104) {
                return 1174;
            }
            if (n2 >= 94) {
                return 629;
            }
            if (n2 >= 85) {
                return 503;
            }
            if (n2 >= 74) {
                return 358;
            }
            if (n2 >= 64) {
                return 320;
            }
            if (n2 >= 54) {
                return 183;
            }
            if (n2 >= 44) {
                return 182;
            }
            if (n2 >= 34) {
                return 181;
            }
            if (n2 >= 24) {
                return 180;
            }
            if (n2 >= 14) {
                return 179;
            }
            return 206;
        }
        if (n == 9) {
            if (n2 >= 102) {
                return 1173;
            }
            if (n2 >= 92) {
                return 628;
            }
            if (n2 >= 85) {
                return 502;
            }
            if (n2 >= 72) {
                return 356;
            }
            if (n2 >= 62) {
                return 318;
            }
            if (n2 >= 52) {
                return 178;
            }
            if (n2 >= 42) {
                return 177;
            }
            if (n2 >= 32) {
                return 176;
            }
            if (n2 >= 22) {
                return 175;
            }
            if (n2 >= 12) {
                return 174;
            }
            return 205;
        }
        return -1;
    }

    private static short g(k0 k02, int n) {
        boolean bl;
        int n2 = k02.j;
        boolean bl2 = bl = (k02.c & 0xFF) == 1;
        if (n == 4) {
            if (n2 >= 105) {
                return (short)(bl ? 1169 : 1170);
            }
            if (n2 >= 95) {
                return (short)(bl ? 624 : 625);
            }
            if (n2 >= 85) {
                return (short)(bl ? 498 : 499);
            }
            if (n2 >= 75) {
                return (short)(bl ? 359 : 366);
            }
            if (n2 >= 65) {
                return (short)(bl ? 321 : 328);
            }
            if (n2 >= 55) {
                return (short)(bl ? 152 : 153);
            }
            if (n2 >= 45) {
                return (short)(bl ? 150 : 151);
            }
            if (n2 >= 35) {
                return (short)(bl ? 148 : 149);
            }
            if (n2 >= 25) {
                return (short)(bl ? 146 : 147);
            }
            if (n2 >= 15) {
                return (short)(bl ? 144 : 145);
            }
            return (short)(bl ? 199 : 200);
        }
        if (n == 8) {
            if (n2 >= 101) {
                return (short)(bl ? 1171 : 1172);
            }
            if (n2 >= 91) {
                return (short)(bl ? 626 : 627);
            }
            if (n2 >= 85) {
                return (short)(bl ? 500 : 501);
            }
            if (n2 >= 71) {
                return (short)(bl ? 355 : 364);
            }
            if (n2 >= 61) {
                return (short)(bl ? 317 : 326);
            }
            if (n2 >= 51) {
                return (short)(bl ? 132 : 133);
            }
            if (n2 >= 41) {
                return (short)(bl ? 130 : 131);
            }
            if (n2 >= 31) {
                return (short)(bl ? 128 : 129);
            }
            if (n2 >= 21) {
                return (short)(bl ? 126 : 127);
            }
            if (n2 >= 11) {
                return (short)(bl ? 124 : 125);
            }
            return (short)(bl ? 195 : 196);
        }
        return -1;
    }

    private static short h(k0 k02, int n) {
        if (k02 == null) {
            return -1;
        }
        if (k02.aE >= 0 && (k02.aG & 0xFF) == n) {
            return k02.aE;
        }
        switch (n) {
            case 0: {
                return k5.I(k02);
            }
            case 1: {
                return k5.A(k02);
            }
            case 2: {
                return k5.E(k02);
            }
            case 3: {
                return k5.o(3, k02.j);
            }
            case 4: {
                return k5.g(k02, 4);
            }
            case 5: {
                return k5.o(5, k02.j);
            }
            case 6: {
                return k5.G(k02);
            }
            case 7: {
                return k5.o(7, k02.j);
            }
            case 8: {
                return k5.g(k02, 8);
            }
            case 9: {
                return k5.o(9, k02.j);
            }
            case 10: {
                return k02.j >= 40 && (k02.P & 1) == 0 ? (short)(568 + Math.abs(k02.P % 4)) : (short)-1;
            }
            case 11: {
                return k5.D(k02) ? (short)k5.R(k02) : (short)-1;
            }
            case 12: {
                return (short)(k02.j >= 70 && (k02.P & 8) != 0 ? 797 : -1);
            }
            case 13: {
                return k02.j >= 50 && (k02.P & 0x10) != 0 ? (short)(870 + Math.abs(k02.P % 10)) : (k02.j >= 10 ? (short)(423 + Math.min(4, (k02.j - 10) / 10)) : (short)-1);
            }
            case 14: {
                return (k02.P & 0x20) != 0 ? (short)(685 + Math.abs(k02.P % 10)) : (short)-1;
            }
            case 15: {
                return k02.j >= 60 ? (short)(397 + Math.abs((k02.d - 1) % 6)) : (short)-1;
            }
        }
        return -1;
    }

    private static byte i(k0 k02, int n) {
        if (k02 == null || n < 0 || n >= 10 || k5.h(k02, n) < 0) {
            return 0;
        }
        if (k02.aE >= 0 && (k02.aG & 0xFF) == n) {
            return k02.aF;
        }
        if (n == 1 && k5.C(k02) || n == 2 && k5.B(k02)) {
            return 0;
        }
        int n2 = k02.j / 12 - 1 + Math.abs((k02.P >>> (n & 7)) % 3);
        return (byte)Math.max(0, Math.min(12, n2));
    }

    private static byte j(k0 k02, int n) {
        int n2;
        if (k02 != null && k02.aE >= 0 && (k02.aG & 0xFF) == n) {
            return k02.aH;
        }
        int n3 = n2 = k02 == null ? 0 : k02.d & 0xFF;
        if (n2 == 1 || n2 == 2) {
            return 1;
        }
        if (n2 == 3 || n2 == 4) {
            return 2;
        }
        if (n2 == 5 || n2 == 6) {
            return 3;
        }
        return 0;
    }

    private static short k(k0 k02, int n) {
        int n2;
        if (n == 8) {
            return k5.D(k02) ? (short)k5.S(k02) : (short)-1;
        }
        if (n == 4) {
            return k5.h(k02, 12) == 797 ? (short)43 : -1;
        }
        if (n == 6) {
            return k5.d(k5.J(k02));
        }
        if (n == 3 && k5.C(k02)) {
            return (short)((k02.c & 0xFF) == 1 ? 44 : 46);
        }
        if (!k5.B(k02)) {
            return -1;
        }
        int n3 = n2 = k02 == null ? 0 : k02.c & 0xFF;
        if (n2 == 1) {
            if (n == 0) {
                return 40;
            }
            if (n == 1) {
                return 41;
            }
            if (n == 2) {
                return 42;
            }
        } else {
            if (n == 0) {
                return 37;
            }
            if (n == 1) {
                return 38;
            }
            if (n == 2) {
                return 39;
            }
        }
        return -1;
    }

    private static short J(k0 k02) {
        int n;
        if (k02 == null) {
            return -1;
        }
        int n2 = k02.a - 100001;
        if (n2 < 0) {
            n2 = -n2;
        }
        if ((n = an[n2 % an.length]) == 485 && k02.j < 50 || n == 524 && k02.j < 60) {
            int n3 = n = k02.j >= 20 ? 523 : 776;
        }
        if (n == 443 && k02.j < 10) {
            n = 776;
        }
        return (short)n;
    }

    private static byte K(k0 k02) {
        return (byte)Math.max(0, Math.min(99, k02 == null ? 0 : k02.j - 10));
    }

    private static byte L(k0 k02) {
        return (byte)(k02 == null ? 0 : Math.abs(k02.P >>> 8) % 5);
    }

    private static short d(short s) {
        if (s == 798) {
            return 36;
        }
        if (s == 830) {
            return 63;
        }
        if (s == 850) {
            return 73;
        }
        return -1;
    }

    private static int l(k0 k02, int n) {
        int n2 = k02 == null ? 0 : Math.abs(k02.P) % ao.length;
        return ao[(n2 + n) % ao.length] & 0xFF;
    }

    private static int m(k0 k02, int n) {
        int n2 = 0;
        int n3 = 0;
        while (n3 < ao.length) {
            if ((ao[n3] & 0xFF) == n) {
                n2 = ap[n3] & 0xFFFF;
                break;
            }
            ++n3;
        }
        n3 = k5.J(k02);
        int n4 = k5.L(k02) & 0xFF;
        if (n4 > 1 && (n3 == 443 || n3 == 523 || n3 == 798 || n3 == 830)) {
            int n5 = (k5.K(k02) & 0xFF) + 1;
            return n2 + n2 * (n5 / 10) + n2 * 2 * n4;
        }
        int n6 = n3 == 830 ? 12 : (n3 == 850 ? 11 : (n3 == 523 || n3 == 798 ? 10 : 1));
        return n2 * n6;
    }

    private static int am() {
        int n = DoHoang091.s();
        if (n < 1 || n > 4) {
            n = 1;
        }
        return 1 << (n & 0xF);
    }

    private static int an() {
        int n = DoHoang091.s();
        if (n < 1 || n > 4) {
            n = 1;
        }
        return 1 << (n & 0xF);
    }

    private static int ao() {
        int n = DoHoang091.s();
        if (n < 1 || n > 4) {
            n = 1;
        }
        return (n - 1) * 3;
    }

    private static boolean M(k0 k02) {
        return k02 != null && (k02.H & k5.an()) != 0;
    }

    private static int N(k0 k02) {
        if (k02 == null) {
            return 0;
        }
        return k02.I >>> k5.ao() & 7;
    }

    private static void n(k0 k02, int n) {
        if (k02 == null) {
            return;
        }
        int n2 = k5.ao();
        k02.I = k02.I & ~(7 << n2) | (n & 7) << n2;
    }

    private static void O(k0 k02) {
        if (k02 == null) {
            return;
        }
        k02.H |= k5.an();
        k5.n(k02, 0);
        int n = k5.U(k02);
        if (n >= 0) {
            bd |= 1 << n;
        }
    }

    private static void P(k0 k02) {
        if (k02 == null) {
            return;
        }
        k02.H &= ~k5.an();
        k5.n(k02, 0);
        int n = k5.U(k02);
        if (n >= 0) {
            bd &= ~(1 << n);
        }
    }

    private static int ap() {
        int n = DoHoang091.z().cb[0];
        return n * 5 + 45;
    }

    private static int aq() {
        int n = DoHoang091.s();
        if (n < 1 || n > 4) {
            n = 1;
        }
        return 1 << 16 + n;
    }

    private static int Q(k0 k02) {
        int n;
        int n2 = n = k02 == null ? 0 : k02.a;
        if (n < 0) {
            n = -n;
        }
        return n % al.length;
    }

    private static short R(k0 k02) {
        return al[k5.Q(k02)];
    }

    private static short S(k0 k02) {
        return am[k5.Q(k02)];
    }

    static void E() {
        bi = 0;
        bj = 0;
        bk = 0;
        bl = 0;
        bm = 0;
        bn = 0;
        bo = 0;
        bp = 0;
    }

    static int J(int n) {
        return n < 2 ? n : 2;
    }

    static int K(int n) {
        return n < 5 ? n : 5;
    }

    private static long T(k0 k02) {
        int n = Math.abs(k02.P % 160);
        return 120L + (long)n;
    }

    static int L(int n) {
        return n < 8 ? n : 8;
    }

    private static k0 ar() {
        return k5.d(true);
    }

    private static k0 as() {
        return k5.d(false);
    }

    private static k0 at() {
        if (aN <= 1) {
            return null;
        }
        int n = bk;
        int n2 = aN;
        while (n2-- > 0) {
            int n3 = k5.p(n, aN);
            bk = n = k5.q(n3, aN);
            int n4 = aM[n3];
            if (n4 == DoHoang091.s()) continue;
            k0 k02 = k5.af(n4);
            int n5 = k5.U(k02);
            if (k02 == null || n5 < 0 || (aK & 1 << n5) == 0) continue;
            return k02;
        }
        return null;
    }

    private static k0 d(boolean bl) {
        if (aN <= 1) {
            return null;
        }
        int n = bl ? bi : bj;
        int n2 = aN;
        while (n2-- > 0) {
            int n3 = k5.p(n, aN);
            n = k5.q(n3, aN);
            int n4 = aM[n3];
            if (bl) {
                bi = n;
            } else {
                bj = n;
            }
            if (n4 == DoHoang091.s()) continue;
            k0 k02 = k5.af(n4);
            int n5 = k5.U(k02);
            if (k02 == null || n5 < 0 || (aK & 1 << n5) == 0) continue;
            return k02;
        }
        return null;
    }

    static int M(int n) {
        int n2 = k5.p(bl, n);
        bl = k5.q(n2, n);
        return n2;
    }

    private static int ac(int n) {
        int n2 = k5.p(bm, n);
        bm = k5.q(n2, n);
        return n2;
    }

    private static int ad(int n) {
        int n2 = k5.p(bn, n);
        bn = k5.q(n2, n);
        return n2;
    }

    static int N(int n) {
        int n2 = k5.p(bo, n);
        bo = k5.q(n2, n);
        return n2;
    }

    private static int ae(int n) {
        int n2 = k5.p(bp, n);
        bp = k5.q(n2, n);
        return n2;
    }

    private static int p(int n, int n2) {
        return n2 <= 0 || n < 0 || n >= n2 ? 0 : n;
    }

    private static int q(int n, int n2) {
        if (n2 <= 1) {
            return 0;
        }
        return ++n >= n2 ? 0 : n;
    }

    private static k0 af(int n) {
        if (aw == null) {
            return null;
        }
        int n2 = 0;
        while (n2 < aw.length) {
            if (k5.aw[n2].a == n) {
                return aw[n2];
            }
            ++n2;
        }
        return null;
    }

    private static k0 i(String string) {
        if (string == null || aw == null) {
            return null;
        }
        int n = 0;
        while (n < aw.length) {
            if (k5.aw[n].b.equalsIgnoreCase(string)) {
                return aw[n];
            }
            ++n;
        }
        return null;
    }

    private static int U(k0 k02) {
        if (k02 == null || aw == null) {
            return -1;
        }
        int n = 0;
        while (n < aw.length) {
            if (aw[n] == k02) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    private static boolean b(int[] nArray, int n) {
        int n2 = 0;
        while (n2 < nArray.length) {
            if (nArray[n2] == n) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    private static int a(byte[] byArray, int n) {
        if (byArray == null || n < 0 || byArray.length - n < 4) {
            return 0;
        }
        try {
            return new DataInputStream(new ByteArrayInputStream(byArray, n, byArray.length - n)).readInt();
        }
        catch (Exception exception) {
            return 0;
        }
    }

    private static String b(byte[] byArray, int n) {
        if (byArray == null || n < 0 || n >= byArray.length) {
            return "";
        }
        try {
            return new DataInputStream(new ByteArrayInputStream(byArray, n, byArray.length - n)).readUTF();
        }
        catch (Exception exception) {
            return "";
        }
    }

    private static byte[] d(byte by, byte[] byArray) {
        byte[] byArray2 = new byte[byArray.length + 1];
        byArray2[0] = by;
        System.arraycopy(byArray, 0, byArray2, 1, byArray.length);
        return byArray2;
    }

    private static byte[] ag(int n) {
        byte[] byArray = new byte[4];
        k5.a(byArray, 0, n);
        return byArray;
    }

    private static void a(byte[] byArray, int n, int n2) {
        byArray[n] = (byte)(n2 >> 24);
        byArray[n + 1] = (byte)(n2 >> 16);
        byArray[n + 2] = (byte)(n2 >> 8);
        byArray[n + 3] = (byte)n2;
    }

    private static void b(byte[] byArray, int n, int n2) {
        byArray[n] = (byte)(n2 >> 8);
        byArray[n + 1] = (byte)n2;
    }

    static final class k0 {
        int a;
        String b;
        byte c;
        byte d;
        byte e;
        short f;
        short g;
        short h;
        short i;
        int j;
        int k;
        int l;
        int m;
        int n;
        int o;
        int p;
        int q;
        int r;
        int s;
        int t;
        int u;
        int v;
        int w;
        int x;
        int y;
        int z;
        int A;
        int B;
        short C;
        short D;
        byte E;
        byte F;
        int G;
        int H;
        int I;
        int J;
        int K;
        int L;
        int M;
        short N;
        short O;
        int P;
        int Q;
        int R;
        int S;
        long T;
        boolean U;
        long V;
        short W;
        short X;
        short Y;
        short[] Z = new short[4];
        short[] aa = new short[4];
        int[] ab = new int[4];
        long[] ac = new long[4];
        boolean ad;
        long ae;
        long af;
        long ag;
        byte[] ah;
        int ai;
        byte aj;
        byte[] ak;
        int al;
        byte am;
        int an;
        byte ao;
        boolean ap;
        boolean aq;
        int ar;
        short as;
        short at;
        short au;
        short av;
        byte aw;
        byte ax;
        int ay;
        int az;
        int aA;
        int aB;
        int aC;
        int aD;
        short aE;
        byte aF;
        byte aG;
        byte aH;
        int aI;

        k0() {
        }
    }
}

