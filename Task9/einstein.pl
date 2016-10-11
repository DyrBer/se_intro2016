
house(A):- A=(r1;r3;r4;r5) .
house(A):- A=(g1;g3;g4;g5) .
house(A):- A=(y1;y3;y4;y5) .
house(A):- A=b2 .
house(A):- A=(w1;w3;w4;w5) .

nation(B):- B=(english; spanish; ukrain; norwegian; japanese) .
animale(C):- C=(dog; snail; fox; horse; zebra) .
drink(D):- D=(cofe; tea; milk; orangejuice; water) .
cigarettes(E):- E=(oldgold; kool; luckystrike; parliament; chesterfield) .


u1(A,B,C,D,E):- A=(r1;r3;r4;r5), B=english, C=_, D=_, E=_.
u2(A,B,C,D,E):- A=_, B=spanish, C=dog, D=_, E=_.
u3(A,B,C,D,E):- A=(g1;g3;g4;g5), B=_, C=_, D=cofe, E=_.
u4(A,B,C,D,E):- A=_, B=ukrain, C=_, D=tea, E=_.
u5(A,B,C,D,E):- A=(g3;g4;g5), B=_, C=_, D=_, E=_.
u6(A,B,C,D,E):- A=_, B=_, C=snail, D=_, E=oldgold.
u7(A,B,C,D,E):- A=yelow, B=_, C=_, D=_, E=kool.
u8(A,B,C,D,E):-	A=(r3;g3;y3;b3;w3), B=_, C=_, D=milk, E=_.
u9(A,B,C,D,E):- A=(r1;g1;y1;b1;w1), B=norwegian, C=_, D=_, E=_.
 u10(A,B,C,D,E):- A=_, B=_, C=fox, D=_, not(E=chesterfield).
 u11(A,B,C,D,E):- A=_, B=_, D=_, E=kool, not(C=hourse).
u12(A,B,C,D,E):- A=_, B=_, C=_, ((E=luckystrike) -> (D=orangejuice)).
u13(A,B,C,D,E):- A=_, B=japanese, C=_, D=_, E=parliament .

result(A,B,C,D,E):- house(A), nation(B), animale(C), drink(D), cigarettes(E), u1(A,B,C,D,E), u2(A,B,C,D,E), u3(A,B,C,D,E), u4(A,B,C,D,E), u5(A,B,C,D,E), u6(A,B,C,D,E), u7(A,B,C,D,E), u8(A,B,C,D,E), u9(A,B,C,D,E), u10(A,B,C,D,E), u11(A,B,C,D,E), u12(A,B,C,D,E), u13(A,B,C,D,E) .















