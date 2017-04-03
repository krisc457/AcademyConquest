package hello;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Region> regions = new ArrayList<>();

    public Board(){
        addRegions();
        addAdjacentRegions();
    }

    private void addRegions() {
        regions.add(new Region("g1","Columbia", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g2","Russian America", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g3","Northwest Territories", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g4","Alberta", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g5","Nunavut", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g6","Quebec", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g7", "Ontario", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g8","Eastern USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g9","Central USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g10","Western USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g11","Southern USA", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g12","Mexico", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g13","Cuba", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g14","Jamaica", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g15","Haiti", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g16","Puerto Rico", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g17","Guatemala", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g18","Belize", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g19","El Salavador", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g20","Honduras", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g21","Nicaragua", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g22","Costa Rica", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g23","Granada", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g24","Venezuela", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g25","Guiana", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g26","Brazil", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g27","Ecuador", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g28","Peru", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g29","Bolivia", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g30","Paraguay", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g31","Chile", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g32","Argentine Republic", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g33","Uruguay", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g34","Patagonia", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g35","Tierra del Fuego", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
        regions.add(new Region("g36","Falkland Isles", returnRandomIntRange(10000,1000), returnRandomIntRange(10000,1000)));
    }

    private void addAdjacentRegions() {
        regions.get(0).addToAdjacentRegions("g10");
        regions.get(0).addToAdjacentRegions("g4");
        regions.get(0).addToAdjacentRegions("g3");
        regions.get(0).addToAdjacentRegions("g2");

        regions.get(1).addToAdjacentRegions("g1");

        regions.get(2).addToAdjacentRegions("g1");
        regions.get(2).addToAdjacentRegions("g4");
        regions.get(2).addToAdjacentRegions("g5");

        regions.get(3).addToAdjacentRegions("g1");
        regions.get(3).addToAdjacentRegions("g10");
        regions.get(3).addToAdjacentRegions("g9");
        regions.get(3).addToAdjacentRegions("g7");
        regions.get(3).addToAdjacentRegions("g5");
        regions.get(3).addToAdjacentRegions("g3");

        regions.get(4).addToAdjacentRegions("g3");
        regions.get(4).addToAdjacentRegions("g4");
        regions.get(4).addToAdjacentRegions("g7");

        regions.get(5).addToAdjacentRegions("g7");
        regions.get(5).addToAdjacentRegions("g8");

        regions.get(6).addToAdjacentRegions("g4");
        regions.get(6).addToAdjacentRegions("g5");
        regions.get(6).addToAdjacentRegions("g6");
        regions.get(6).addToAdjacentRegions("g8");
        regions.get(6).addToAdjacentRegions("g9");

        regions.get(7).addToAdjacentRegions("g6");
        regions.get(7).addToAdjacentRegions("g7");
        regions.get(7).addToAdjacentRegions("g9");
        regions.get(7).addToAdjacentRegions("g11");

        regions.get(8).addToAdjacentRegions("g10");
        regions.get(8).addToAdjacentRegions("g4");
        regions.get(8).addToAdjacentRegions("g7");
        regions.get(8).addToAdjacentRegions("g8");
        regions.get(8).addToAdjacentRegions("g11");

        regions.get(9).addToAdjacentRegions("g1");
        regions.get(9).addToAdjacentRegions("g4");
        regions.get(9).addToAdjacentRegions("g9");
        regions.get(9).addToAdjacentRegions("g11");
        regions.get(9).addToAdjacentRegions("g12");

        regions.get(10).addToAdjacentRegions("g8");
        regions.get(10).addToAdjacentRegions("g9");
        regions.get(10).addToAdjacentRegions("g10");
        regions.get(10).addToAdjacentRegions("g12");

        regions.get(11).addToAdjacentRegions("g10");
        regions.get(11).addToAdjacentRegions("g11");
        regions.get(11).addToAdjacentRegions("g17");
        regions.get(11).addToAdjacentRegions("g18");

        regions.get(16).addToAdjacentRegions("g12");
        regions.get(16).addToAdjacentRegions("g18");
        regions.get(16).addToAdjacentRegions("g20");
        regions.get(16).addToAdjacentRegions("g19");

        regions.get(17).addToAdjacentRegions("g12");
        regions.get(17).addToAdjacentRegions("g17");

        regions.get(18).addToAdjacentRegions("g17");
        regions.get(18).addToAdjacentRegions("g20");

        regions.get(19).addToAdjacentRegions("g17");
        regions.get(19).addToAdjacentRegions("g19");
        regions.get(19).addToAdjacentRegions("g21");

        regions.get(20).addToAdjacentRegions("g20");
        regions.get(20).addToAdjacentRegions("g22");

        regions.get(21).addToAdjacentRegions("g21");
        regions.get(21).addToAdjacentRegions("g23");

        regions.get(22).addToAdjacentRegions("g22");
        regions.get(22).addToAdjacentRegions("g24");
        regions.get(22).addToAdjacentRegions("g26");
        regions.get(22).addToAdjacentRegions("g27");

        regions.get(23).addToAdjacentRegions("g23");
        regions.get(23).addToAdjacentRegions("g25");
        regions.get(23).addToAdjacentRegions("g26");

        regions.get(24).addToAdjacentRegions("g24");
        regions.get(24).addToAdjacentRegions("g26");

        regions.get(25).addToAdjacentRegions("g23");
        regions.get(25).addToAdjacentRegions("g24");
        regions.get(25).addToAdjacentRegions("g25");
        regions.get(25).addToAdjacentRegions("g27");
        regions.get(25).addToAdjacentRegions("g28");
        regions.get(25).addToAdjacentRegions("g29");
        regions.get(25).addToAdjacentRegions("g30");
        regions.get(25).addToAdjacentRegions("g32");
        regions.get(25).addToAdjacentRegions("g33");

        regions.get(26).addToAdjacentRegions("g28");
        regions.get(26).addToAdjacentRegions("g26");
        regions.get(26).addToAdjacentRegions("g23");

        regions.get(27).addToAdjacentRegions("g27");
        regions.get(27).addToAdjacentRegions("g26");
        regions.get(27).addToAdjacentRegions("g29");

        regions.get(28).addToAdjacentRegions("g28");
        regions.get(28).addToAdjacentRegions("g26");
        regions.get(28).addToAdjacentRegions("g30");
        regions.get(28).addToAdjacentRegions("g32");
        regions.get(28).addToAdjacentRegions("g31");

        regions.get(29).addToAdjacentRegions("g26");
        regions.get(29).addToAdjacentRegions("g29");
        regions.get(29).addToAdjacentRegions("g32");

        regions.get(30).addToAdjacentRegions("g29");
        regions.get(30).addToAdjacentRegions("g32");
        regions.get(30).addToAdjacentRegions("g34");

        regions.get(31).addToAdjacentRegions("g31");
        regions.get(31).addToAdjacentRegions("g29");
        regions.get(31).addToAdjacentRegions("g30");
        regions.get(31).addToAdjacentRegions("g26");
        regions.get(31).addToAdjacentRegions("g33");
        regions.get(31).addToAdjacentRegions("g34");

        regions.get(32).addToAdjacentRegions("g26");
        regions.get(32).addToAdjacentRegions("g32");

        regions.get(33).addToAdjacentRegions("g32");
        regions.get(33).addToAdjacentRegions("g31");
        regions.get(33).addToAdjacentRegions("g35");

        regions.get(34).addToAdjacentRegions("g34");

        regions.get(37).addToAdjacentRegions("g39");

        regions.get(38).addToAdjacentRegions("g38");
        regions.get(38).addToAdjacentRegions("g40");

        regions.get(39).addToAdjacentRegions("g39");

        regions.get(40).addToAdjacentRegions("g42");
        regions.get(40).addToAdjacentRegions("g43");

        regions.get(41).addToAdjacentRegions("g41");
        regions.get(41).addToAdjacentRegions("g47");
        regions.get(41).addToAdjacentRegions("g43");

        regions.get(44).addToAdjacentRegions("g44");
        regions.get(44).addToAdjacentRegions("g46");
        regions.get(44).addToAdjacentRegions("g60");
        regions.get(44).addToAdjacentRegions("g61");
        regions.get(44).addToAdjacentRegions("g43");

        regions.get(45).addToAdjacentRegions("g48");
        regions.get(45).addToAdjacentRegions("g49");
        regions.get(45).addToAdjacentRegions("g54");
        regions.get(45).addToAdjacentRegions("g59");
        regions.get(45).addToAdjacentRegions("g60");
        regions.get(45).addToAdjacentRegions("g45");
        regions.get(45).addToAdjacentRegions("g47");

        regions.get(46).addToAdjacentRegions("g42");
        regions.get(46).addToAdjacentRegions("g46");

        regions.get(47).addToAdjacentRegions("g46");
        regions.get(47).addToAdjacentRegions("g49");

        regions.get(48).addToAdjacentRegions("g46");
        regions.get(48).addToAdjacentRegions("g48");
        regions.get(48).addToAdjacentRegions("g50");
        regions.get(48).addToAdjacentRegions("g54");

        regions.get(49).addToAdjacentRegions("g49");
        regions.get(49).addToAdjacentRegions("g51");
        regions.get(49).addToAdjacentRegions("g54");

        regions.get(50).addToAdjacentRegions("g50");
        regions.get(50).addToAdjacentRegions("g52");
        regions.get(50).addToAdjacentRegions("g54");

        regions.get(51).addToAdjacentRegions("g51");
        regions.get(51).addToAdjacentRegions("g53");
        regions.get(51).addToAdjacentRegions("g68");

        regions.get(52).addToAdjacentRegions("g52");

        regions.get(53).addToAdjacentRegions("g46");
        regions.get(53).addToAdjacentRegions("g49");
        regions.get(53).addToAdjacentRegions("g50");
        regions.get(53).addToAdjacentRegions("g51");
        regions.get(53).addToAdjacentRegions("g57");
        regions.get(53).addToAdjacentRegions("g59");

        regions.get(54).addToAdjacentRegions("g56");

        regions.get(55).addToAdjacentRegions("g55");

        regions.get(56).addToAdjacentRegions("g54");
        regions.get(56).addToAdjacentRegions("g58");
        regions.get(56).addToAdjacentRegions("g59");
        regions.get(56).addToAdjacentRegions("g61");

        regions.get(57).addToAdjacentRegions("g57");

        regions.get(58).addToAdjacentRegions("g46");
        regions.get(58).addToAdjacentRegions("g54");
        regions.get(58).addToAdjacentRegions("g57");
        regions.get(58).addToAdjacentRegions("g60");
        regions.get(58).addToAdjacentRegions("g61");

        regions.get(59).addToAdjacentRegions("g45");
        regions.get(59).addToAdjacentRegions("g46");
        regions.get(59).addToAdjacentRegions("g59");
        regions.get(59).addToAdjacentRegions("g61");

        regions.get(60).addToAdjacentRegions("g44");
        regions.get(60).addToAdjacentRegions("g45");
        regions.get(60).addToAdjacentRegions("g57");
        regions.get(60).addToAdjacentRegions("g59");
        regions.get(60).addToAdjacentRegions("g60");
        regions.get(60).addToAdjacentRegions("g61");
        regions.get(60).addToAdjacentRegions("g62");
        regions.get(60).addToAdjacentRegions("g63");
        regions.get(60).addToAdjacentRegions("g65");

        regions.get(61).addToAdjacentRegions("g44");
        regions.get(61).addToAdjacentRegions("g61");
        regions.get(61).addToAdjacentRegions("g63");
        regions.get(61).addToAdjacentRegions("g64");

        regions.get(62).addToAdjacentRegions("g61");
        regions.get(62).addToAdjacentRegions("g62");
        regions.get(62).addToAdjacentRegions("g64");
        regions.get(62).addToAdjacentRegions("g65");

        regions.get(63).addToAdjacentRegions("g62");
        regions.get(63).addToAdjacentRegions("g63");
        regions.get(63).addToAdjacentRegions("g65");

        regions.get(64).addToAdjacentRegions("g61");
        regions.get(64).addToAdjacentRegions("g63");
        regions.get(64).addToAdjacentRegions("g64");
        regions.get(64).addToAdjacentRegions("g66");
        regions.get(64).addToAdjacentRegions("g74");
        regions.get(64).addToAdjacentRegions("g113");
        regions.get(64).addToAdjacentRegions("g114");
        regions.get(64).addToAdjacentRegions("g115");

        regions.get(65).addToAdjacentRegions("g65");

        regions.get(67).addToAdjacentRegions("g52");
        regions.get(67).addToAdjacentRegions("g69");
        regions.get(67).addToAdjacentRegions("g71");

        regions.get(68).addToAdjacentRegions("g68");
        regions.get(68).addToAdjacentRegions("g70");
        regions.get(68).addToAdjacentRegions("g71");

        regions.get(69).addToAdjacentRegions("g69");
        regions.get(69).addToAdjacentRegions("g71");
        regions.get(69).addToAdjacentRegions("g73");
        regions.get(69).addToAdjacentRegions("g74");
        regions.get(69).addToAdjacentRegions("g76");
        regions.get(69).addToAdjacentRegions("g84");
        regions.get(69).addToAdjacentRegions("g83");
        regions.get(69).addToAdjacentRegions("g82");
        regions.get(69).addToAdjacentRegions("g81");
        regions.get(69).addToAdjacentRegions("g80");

        regions.get(70).addToAdjacentRegions("g68");
        regions.get(70).addToAdjacentRegions("g69");
        regions.get(70).addToAdjacentRegions("g70");
        regions.get(70).addToAdjacentRegions("g72");
        regions.get(70).addToAdjacentRegions("g73");

        regions.get(71).addToAdjacentRegions("g71");
        regions.get(71).addToAdjacentRegions("g73");

        regions.get(72).addToAdjacentRegions("g70");
        regions.get(72).addToAdjacentRegions("g71");
        regions.get(72).addToAdjacentRegions("g72");
        regions.get(72).addToAdjacentRegions("g74");

        regions.get(73).addToAdjacentRegions("g70");
        regions.get(73).addToAdjacentRegions("g73");
        regions.get(73).addToAdjacentRegions("g75");
        regions.get(73).addToAdjacentRegions("g76");
        regions.get(73).addToAdjacentRegions("g65");

        regions.get(74).addToAdjacentRegions("g74");
        regions.get(74).addToAdjacentRegions("g76");
        regions.get(74).addToAdjacentRegions("g77");
        regions.get(74).addToAdjacentRegions("g78");
        regions.get(74).addToAdjacentRegions("g87");
        regions.get(74).addToAdjacentRegions("g89");

        regions.get(75).addToAdjacentRegions("g70");
        regions.get(75).addToAdjacentRegions("g74");
        regions.get(75).addToAdjacentRegions("g75");
        regions.get(75).addToAdjacentRegions("g84");
        regions.get(75).addToAdjacentRegions("g85");
        regions.get(75).addToAdjacentRegions("g89");

        regions.get(76).addToAdjacentRegions("g75");
        regions.get(76).addToAdjacentRegions("g78");
        regions.get(76).addToAdjacentRegions("g79");
        regions.get(76).addToAdjacentRegions("g114");

        regions.get(77).addToAdjacentRegions("g75");
        regions.get(77).addToAdjacentRegions("g77");
        regions.get(77).addToAdjacentRegions("g79");
        regions.get(77).addToAdjacentRegions("g87");

        regions.get(78).addToAdjacentRegions("g77");
        regions.get(78).addToAdjacentRegions("g78");
        regions.get(78).addToAdjacentRegions("g87");

        regions.get(79).addToAdjacentRegions("g70");
        regions.get(79).addToAdjacentRegions("g81");

        regions.get(80).addToAdjacentRegions("g70");
        regions.get(80).addToAdjacentRegions("g81");

        regions.get(81).addToAdjacentRegions("g70");
        regions.get(81).addToAdjacentRegions("g83");

        regions.get(82).addToAdjacentRegions("g70");
        regions.get(82).addToAdjacentRegions("g82");

        regions.get(83).addToAdjacentRegions("g70");
        regions.get(83).addToAdjacentRegions("g76");
        regions.get(83).addToAdjacentRegions("g85");

        regions.get(84).addToAdjacentRegions("g70");
        regions.get(84).addToAdjacentRegions("g76");
        regions.get(84).addToAdjacentRegions("g84");
        regions.get(84).addToAdjacentRegions("g86");
        regions.get(84).addToAdjacentRegions("g89");

        regions.get(85).addToAdjacentRegions("g85");
        regions.get(85).addToAdjacentRegions("g89");

        regions.get(86).addToAdjacentRegions("g68");
        regions.get(86).addToAdjacentRegions("g78");
        regions.get(86).addToAdjacentRegions("g79");
        regions.get(86).addToAdjacentRegions("g88");
        regions.get(86).addToAdjacentRegions("g89");

        regions.get(87).addToAdjacentRegions("g87");
        regions.get(87).addToAdjacentRegions("g89");
        regions.get(87).addToAdjacentRegions("g91");
        regions.get(87).addToAdjacentRegions("g92");

        regions.get(88).addToAdjacentRegions("g75");
        regions.get(88).addToAdjacentRegions("g76");
        regions.get(88).addToAdjacentRegions("g85");
        regions.get(88).addToAdjacentRegions("g86");
        regions.get(88).addToAdjacentRegions("g87");
        regions.get(88).addToAdjacentRegions("g88");
        regions.get(88).addToAdjacentRegions("g90");
        regions.get(88).addToAdjacentRegions("g91");

        regions.get(89).addToAdjacentRegions("g89");
        regions.get(89).addToAdjacentRegions("g91");
        regions.get(89).addToAdjacentRegions("g97");

        regions.get(90).addToAdjacentRegions("g88");
        regions.get(90).addToAdjacentRegions("g89");
        regions.get(90).addToAdjacentRegions("g90");
        regions.get(90).addToAdjacentRegions("g92");
        regions.get(90).addToAdjacentRegions("g95");
        regions.get(90).addToAdjacentRegions("g96");
        regions.get(90).addToAdjacentRegions("g97");

        regions.get(91).addToAdjacentRegions("g88");
        regions.get(91).addToAdjacentRegions("g91");
        regions.get(91).addToAdjacentRegions("g95");
        regions.get(91).addToAdjacentRegions("g98");

        regions.get(94).addToAdjacentRegions("g91");
        regions.get(94).addToAdjacentRegions("g92");
        regions.get(94).addToAdjacentRegions("g96");
        regions.get(94).addToAdjacentRegions("g97");
        regions.get(94).addToAdjacentRegions("g98");

        regions.get(95).addToAdjacentRegions("g91");
        regions.get(95).addToAdjacentRegions("g95");
        regions.get(95).addToAdjacentRegions("g97");
        regions.get(95).addToAdjacentRegions("g98");

        regions.get(96).addToAdjacentRegions("g90");
        regions.get(96).addToAdjacentRegions("g91");
        regions.get(96).addToAdjacentRegions("g95");
        regions.get(96).addToAdjacentRegions("g96");
        regions.get(96).addToAdjacentRegions("g98");

        regions.get(97).addToAdjacentRegions("g92");
        regions.get(97).addToAdjacentRegions("g95");
        regions.get(97).addToAdjacentRegions("g96");
        regions.get(97).addToAdjacentRegions("g97");

        regions.get(98).addToAdjacentRegions("g43");
        regions.get(98).addToAdjacentRegions("g44");
        regions.get(98).addToAdjacentRegions("g100");
        regions.get(98).addToAdjacentRegions("g110");
        regions.get(98).addToAdjacentRegions("g112");

        regions.get(99).addToAdjacentRegions("g99");
        regions.get(99).addToAdjacentRegions("g101");
        regions.get(99).addToAdjacentRegions("g107");
        regions.get(99).addToAdjacentRegions("g109");
        regions.get(99).addToAdjacentRegions("g110");

        regions.get(100).addToAdjacentRegions("g100");
        regions.get(100).addToAdjacentRegions("g107");

        regions.get(101).addToAdjacentRegions("g107");

        regions.get(102).addToAdjacentRegions("g104");

        regions.get(103).addToAdjacentRegions("g103");
        regions.get(103).addToAdjacentRegions("g105");
        regions.get(103).addToAdjacentRegions("g106");

        regions.get(104).addToAdjacentRegions("g104");
        regions.get(104).addToAdjacentRegions("g106");

        regions.get(105).addToAdjacentRegions("g104");
        regions.get(105).addToAdjacentRegions("g105");

        regions.get(106).addToAdjacentRegions("g100");
        regions.get(106).addToAdjacentRegions("g101");
        regions.get(106).addToAdjacentRegions("g108");
        regions.get(106).addToAdjacentRegions("g109");
        regions.get(106).addToAdjacentRegions("g135");
        regions.get(106).addToAdjacentRegions("g102");

        regions.get(107).addToAdjacentRegions("g107");
        regions.get(107).addToAdjacentRegions("g109");
        regions.get(107).addToAdjacentRegions("g111");
        regions.get(107).addToAdjacentRegions("g132");
        regions.get(107).addToAdjacentRegions("g133");
        regions.get(107).addToAdjacentRegions("g134");
        regions.get(107).addToAdjacentRegions("g135");

        regions.get(108).addToAdjacentRegions("g100");
        regions.get(108).addToAdjacentRegions("g107");
        regions.get(108).addToAdjacentRegions("g108");
        regions.get(108).addToAdjacentRegions("g110");
        regions.get(108).addToAdjacentRegions("g111");

        regions.get(109).addToAdjacentRegions("g99");
        regions.get(109).addToAdjacentRegions("g100");
        regions.get(109).addToAdjacentRegions("g109");
        regions.get(109).addToAdjacentRegions("g111");
        regions.get(109).addToAdjacentRegions("g112");
        regions.get(109).addToAdjacentRegions("g118");
        regions.get(109).addToAdjacentRegions("g119");

        regions.get(110).addToAdjacentRegions("g108");
        regions.get(110).addToAdjacentRegions("g109");
        regions.get(110).addToAdjacentRegions("g110");
        regions.get(110).addToAdjacentRegions("g119");

        regions.get(111).addToAdjacentRegions("g44");
        regions.get(111).addToAdjacentRegions("g99");
        regions.get(111).addToAdjacentRegions("g110");
        regions.get(111).addToAdjacentRegions("g115");
        regions.get(111).addToAdjacentRegions("g116");
        regions.get(111).addToAdjacentRegions("g118");

        regions.get(112).addToAdjacentRegions("g44");
        regions.get(112).addToAdjacentRegions("g65");
        regions.get(112).addToAdjacentRegions("g115");

        regions.get(113).addToAdjacentRegions("g65");
        regions.get(113).addToAdjacentRegions("g77");

        regions.get(114).addToAdjacentRegions("g65");
        regions.get(114).addToAdjacentRegions("g112");
        regions.get(114).addToAdjacentRegions("g113");
        regions.get(114).addToAdjacentRegions("g114");
        regions.get(114).addToAdjacentRegions("g116");
        regions.get(114).addToAdjacentRegions("g117");

        regions.get(115).addToAdjacentRegions("g112");
        regions.get(115).addToAdjacentRegions("g115");
        regions.get(115).addToAdjacentRegions("g117");
        regions.get(115).addToAdjacentRegions("g118");

        regions.get(116).addToAdjacentRegions("g115");
        regions.get(116).addToAdjacentRegions("g116");
        regions.get(116).addToAdjacentRegions("g118");
        regions.get(116).addToAdjacentRegions("g120");

        regions.get(117).addToAdjacentRegions("g110");
        regions.get(117).addToAdjacentRegions("g112");
        regions.get(117).addToAdjacentRegions("g116");
        regions.get(117).addToAdjacentRegions("g117");
        regions.get(117).addToAdjacentRegions("g119");
        regions.get(117).addToAdjacentRegions("g120");
        regions.get(117).addToAdjacentRegions("g121");
        regions.get(117).addToAdjacentRegions("g122");

        regions.get(118).addToAdjacentRegions("g110");
        regions.get(118).addToAdjacentRegions("g111");
        regions.get(118).addToAdjacentRegions("g118");
        regions.get(118).addToAdjacentRegions("g122");
        regions.get(118).addToAdjacentRegions("g128");
        regions.get(118).addToAdjacentRegions("g129");
        regions.get(118).addToAdjacentRegions("g130");
        regions.get(118).addToAdjacentRegions("g132");

        regions.get(119).addToAdjacentRegions("g117");
        regions.get(119).addToAdjacentRegions("g118");
        regions.get(119).addToAdjacentRegions("g121");
        regions.get(119).addToAdjacentRegions("g123");

        regions.get(120).addToAdjacentRegions("g118");
        regions.get(120).addToAdjacentRegions("g120");
        regions.get(120).addToAdjacentRegions("g122");
        regions.get(120).addToAdjacentRegions("g123");
        regions.get(120).addToAdjacentRegions("g126");
        regions.get(120).addToAdjacentRegions("g127");

        regions.get(121).addToAdjacentRegions("g118");
        regions.get(121).addToAdjacentRegions("g119");
        regions.get(121).addToAdjacentRegions("g121");
        regions.get(121).addToAdjacentRegions("g127");
        regions.get(121).addToAdjacentRegions("g128");

        regions.get(122).addToAdjacentRegions("g120");
        regions.get(122).addToAdjacentRegions("g121");
        regions.get(122).addToAdjacentRegions("g124");
        regions.get(122).addToAdjacentRegions("g126");

        regions.get(123).addToAdjacentRegions("g123");
        regions.get(123).addToAdjacentRegions("g126");

        regions.get(125).addToAdjacentRegions("g121");
        regions.get(125).addToAdjacentRegions("g123");
        regions.get(125).addToAdjacentRegions("g124");
        regions.get(125).addToAdjacentRegions("g127");
        regions.get(125).addToAdjacentRegions("g130");

        regions.get(126).addToAdjacentRegions("g121");
        regions.get(126).addToAdjacentRegions("g122");
        regions.get(126).addToAdjacentRegions("g126");
        regions.get(126).addToAdjacentRegions("g128");
        regions.get(126).addToAdjacentRegions("g130");

        regions.get(127).addToAdjacentRegions("g119");
        regions.get(127).addToAdjacentRegions("g122");
        regions.get(127).addToAdjacentRegions("g127");
        regions.get(127).addToAdjacentRegions("g129");
        regions.get(127).addToAdjacentRegions("g130");

        regions.get(128).addToAdjacentRegions("g119");
        regions.get(128).addToAdjacentRegions("g128");
        regions.get(128).addToAdjacentRegions("g130");

        regions.get(129).addToAdjacentRegions("g119");
        regions.get(129).addToAdjacentRegions("g126");
        regions.get(129).addToAdjacentRegions("g127");
        regions.get(129).addToAdjacentRegions("g128");
        regions.get(129).addToAdjacentRegions("g129");
        regions.get(129).addToAdjacentRegions("g131");
        regions.get(129).addToAdjacentRegions("g132");
        regions.get(129).addToAdjacentRegions("g146");

        regions.get(130).addToAdjacentRegions("g130");
        regions.get(130).addToAdjacentRegions("g132");
        regions.get(130).addToAdjacentRegions("g146");

        regions.get(131).addToAdjacentRegions("g108");
        regions.get(131).addToAdjacentRegions("g111");
        regions.get(131).addToAdjacentRegions("g119");
        regions.get(131).addToAdjacentRegions("g130");
        regions.get(131).addToAdjacentRegions("g131");
        regions.get(131).addToAdjacentRegions("g133");
        regions.get(131).addToAdjacentRegions("g141");
        regions.get(131).addToAdjacentRegions("g143");
        regions.get(131).addToAdjacentRegions("g145");
        regions.get(131).addToAdjacentRegions("g146");

        regions.get(132).addToAdjacentRegions("g108");
        regions.get(132).addToAdjacentRegions("g132");
        regions.get(132).addToAdjacentRegions("g134");
        regions.get(132).addToAdjacentRegions("g137");
        regions.get(132).addToAdjacentRegions("g141");

        regions.get(133).addToAdjacentRegions("g108");
        regions.get(133).addToAdjacentRegions("g133");
        regions.get(133).addToAdjacentRegions("g135");
        regions.get(133).addToAdjacentRegions("g136");
        regions.get(133).addToAdjacentRegions("g137");

        regions.get(134).addToAdjacentRegions("g107");
        regions.get(134).addToAdjacentRegions("g108");
        regions.get(134).addToAdjacentRegions("g134");

        regions.get(135).addToAdjacentRegions("g134");
        regions.get(135).addToAdjacentRegions("g137");
        regions.get(135).addToAdjacentRegions("g138");

        regions.get(136).addToAdjacentRegions("g133");
        regions.get(136).addToAdjacentRegions("g134");
        regions.get(136).addToAdjacentRegions("g136");
        regions.get(136).addToAdjacentRegions("g138");
        regions.get(136).addToAdjacentRegions("g139");
        regions.get(136).addToAdjacentRegions("g141");

        regions.get(137).addToAdjacentRegions("g136");
        regions.get(137).addToAdjacentRegions("g137");
        regions.get(137).addToAdjacentRegions("g139");
        regions.get(137).addToAdjacentRegions("g140");

        regions.get(138).addToAdjacentRegions("g137");
        regions.get(138).addToAdjacentRegions("g138");
        regions.get(138).addToAdjacentRegions("g140");
        regions.get(138).addToAdjacentRegions("g141");

        regions.get(139).addToAdjacentRegions("g138");
        regions.get(139).addToAdjacentRegions("g139");
        regions.get(139).addToAdjacentRegions("g141");

        regions.get(140).addToAdjacentRegions("g132");
        regions.get(140).addToAdjacentRegions("g133");
        regions.get(140).addToAdjacentRegions("g137");
        regions.get(140).addToAdjacentRegions("g139");
        regions.get(140).addToAdjacentRegions("g140");
        regions.get(140).addToAdjacentRegions("g143");

        regions.get(142).addToAdjacentRegions("g132");
        regions.get(142).addToAdjacentRegions("g141");
        regions.get(142).addToAdjacentRegions("g144");
        regions.get(142).addToAdjacentRegions("g145");

        regions.get(143).addToAdjacentRegions("g143");

        regions.get(144).addToAdjacentRegions("g132");
        regions.get(144).addToAdjacentRegions("g143");
        regions.get(144).addToAdjacentRegions("g146");

        regions.get(145).addToAdjacentRegions("g130");
        regions.get(145).addToAdjacentRegions("g131");
        regions.get(145).addToAdjacentRegions("g145");
        regions.get(145).addToAdjacentRegions("g147");

        regions.get(146).addToAdjacentRegions("g146");

        regions.get(155).addToAdjacentRegions("g157");
        regions.get(155).addToAdjacentRegions("g158");

        regions.get(156).addToAdjacentRegions("g156");
        regions.get(156).addToAdjacentRegions("g158");
        regions.get(156).addToAdjacentRegions("g159");

        regions.get(157).addToAdjacentRegions("g156");
        regions.get(157).addToAdjacentRegions("g157");
        regions.get(157).addToAdjacentRegions("g159");
        regions.get(157).addToAdjacentRegions("g160");
        regions.get(157).addToAdjacentRegions("g161");

        regions.get(158).addToAdjacentRegions("g157");
        regions.get(158).addToAdjacentRegions("g158");
        regions.get(158).addToAdjacentRegions("g160");

        regions.get(159).addToAdjacentRegions("g158");
        regions.get(159).addToAdjacentRegions("g159");
        regions.get(159).addToAdjacentRegions("g161");

        regions.get(160).addToAdjacentRegions("g158");
        regions.get(160).addToAdjacentRegions("g160");

        regions.get(162).addToAdjacentRegions("g163");

        regions.get(162).addToAdjacentRegions("g163");
    }

    public int returnRandomIntRange(int max, int min){
        int i = (int)(Math.random()*(max-min)+min);
        return i;
    }

    public List<Region> getRegions(){
        return regions;
    }
}
