package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0353e;
import android.support.constraint.p042a.p043a.C0335h.C0336a;

/* renamed from: android.support.constraint.a.a.n */
/* compiled from: Optimizer */
public class C0342n {

    /* renamed from: a */
    static boolean[] f1026a = new boolean[3];

    /* renamed from: a */
    static void m1214a(C0337i iVar, C0353e eVar, C0335h hVar) {
        if (iVar.f909F[0] != C0336a.WRAP_CONTENT && hVar.f909F[0] == C0336a.MATCH_PARENT) {
            int i = hVar.f971v.f878e;
            int s = iVar.mo1198s() - hVar.f973x.f878e;
            C0330f fVar = hVar.f971v;
            fVar.f883j = eVar.mo1291a((Object) fVar);
            C0330f fVar2 = hVar.f973x;
            fVar2.f883j = eVar.mo1291a((Object) fVar2);
            eVar.mo1296a(hVar.f971v.f883j, i);
            eVar.mo1296a(hVar.f973x.f883j, s);
            hVar.f931b = 2;
            hVar.mo1138a(i, s);
        }
        if (iVar.f909F[1] != C0336a.WRAP_CONTENT && hVar.f909F[1] == C0336a.MATCH_PARENT) {
            int i2 = hVar.f972w.f878e;
            int i3 = iVar.mo1178i() - hVar.f974y.f878e;
            C0330f fVar3 = hVar.f972w;
            fVar3.f883j = eVar.mo1291a((Object) fVar3);
            C0330f fVar4 = hVar.f974y;
            fVar4.f883j = eVar.mo1291a((Object) fVar4);
            eVar.mo1296a(hVar.f972w.f883j, i2);
            eVar.mo1296a(hVar.f974y.f883j, i3);
            if (hVar.f925V > 0 || hVar.mo1196r() == 8) {
                C0330f fVar5 = hVar.f975z;
                fVar5.f883j = eVar.mo1291a((Object) fVar5);
                eVar.mo1296a(hVar.f975z.f883j, hVar.f925V + i2);
            }
            hVar.f933c = 2;
            hVar.mo1171e(i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m1215a(android.support.constraint.p042a.p043a.C0335h r5, int r6) {
        /*
            android.support.constraint.a.a.h$a[] r0 = r5.f909F
            r1 = r0[r6]
            android.support.constraint.a.a.h$a r2 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.f913J
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001d
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            android.support.constraint.a.a.h$a r6 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x001c
        L_0x001c:
            return r3
        L_0x001d:
            if (r6 != 0) goto L_0x002d
            int r6 = r5.f939f
            if (r6 == 0) goto L_0x0024
            return r3
        L_0x0024:
            int r6 = r5.f945i
            if (r6 != 0) goto L_0x002c
            int r5 = r5.f947j
            if (r5 == 0) goto L_0x003b
        L_0x002c:
            return r3
        L_0x002d:
            int r6 = r5.f941g
            if (r6 == 0) goto L_0x0032
            return r3
        L_0x0032:
            int r6 = r5.f951l
            if (r6 != 0) goto L_0x003c
            int r5 = r5.f953m
            if (r5 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0342n.m1215a(android.support.constraint.a.a.h, int):boolean");
    }

    /* renamed from: a */
    static void m1212a(int i, C0335h hVar) {
        C0335h hVar2 = hVar;
        hVar.mo1135I();
        C0344p d = hVar2.f971v.mo1121d();
        C0344p d2 = hVar2.f972w.mo1121d();
        C0344p d3 = hVar2.f973x.mo1121d();
        C0344p d4 = hVar2.f974y.mo1121d();
        boolean z = (i & 8) == 8;
        boolean z2 = hVar2.f909F[0] == C0336a.MATCH_CONSTRAINT && m1215a(hVar2, 0);
        if (!(d.f1033i == 4 || d3.f1033i == 4)) {
            if (hVar2.f909F[0] == C0336a.FIXED || (z2 && hVar.mo1196r() == 8)) {
                if (hVar2.f971v.f877d == null && hVar2.f973x.f877d == null) {
                    d.mo1240b(1);
                    d3.mo1240b(1);
                    if (z) {
                        d3.mo1238a(d, 1, hVar.mo1186m());
                    } else {
                        d3.mo1237a(d, hVar.mo1198s());
                    }
                } else if (hVar2.f971v.f877d != null && hVar2.f973x.f877d == null) {
                    d.mo1240b(1);
                    d3.mo1240b(1);
                    if (z) {
                        d3.mo1238a(d, 1, hVar.mo1186m());
                    } else {
                        d3.mo1237a(d, hVar.mo1198s());
                    }
                } else if (hVar2.f971v.f877d == null && hVar2.f973x.f877d != null) {
                    d.mo1240b(1);
                    d3.mo1240b(1);
                    d.mo1237a(d3, -hVar.mo1198s());
                    if (z) {
                        d.mo1238a(d3, -1, hVar.mo1186m());
                    } else {
                        d.mo1237a(d3, -hVar.mo1198s());
                    }
                } else if (!(hVar2.f971v.f877d == null || hVar2.f973x.f877d == null)) {
                    d.mo1240b(2);
                    d3.mo1240b(2);
                    if (z) {
                        hVar.mo1186m().mo1251a(d);
                        hVar.mo1186m().mo1251a(d3);
                        d.mo1242b(d3, -1, hVar.mo1186m());
                        d3.mo1242b(d, 1, hVar.mo1186m());
                    } else {
                        d.mo1241b(d3, (float) (-hVar.mo1198s()));
                        d3.mo1241b(d, (float) hVar.mo1198s());
                    }
                }
            } else if (z2) {
                int s = hVar.mo1198s();
                d.mo1240b(1);
                d3.mo1240b(1);
                if (hVar2.f971v.f877d == null && hVar2.f973x.f877d == null) {
                    if (z) {
                        d3.mo1238a(d, 1, hVar.mo1186m());
                    } else {
                        d3.mo1237a(d, s);
                    }
                } else if (hVar2.f971v.f877d == null || hVar2.f973x.f877d != null) {
                    if (hVar2.f971v.f877d != null || hVar2.f973x.f877d == null) {
                        if (!(hVar2.f971v.f877d == null || hVar2.f973x.f877d == null)) {
                            if (z) {
                                hVar.mo1186m().mo1251a(d);
                                hVar.mo1186m().mo1251a(d3);
                            }
                            if (hVar2.f913J == 0.0f) {
                                d.mo1240b(3);
                                d3.mo1240b(3);
                                d.mo1241b(d3, 0.0f);
                                d3.mo1241b(d, 0.0f);
                            } else {
                                d.mo1240b(2);
                                d3.mo1240b(2);
                                d.mo1241b(d3, (float) (-s));
                                d3.mo1241b(d, (float) s);
                                hVar2.mo1191o(s);
                            }
                        }
                    } else if (z) {
                        d.mo1238a(d3, -1, hVar.mo1186m());
                    } else {
                        d.mo1237a(d3, -s);
                    }
                } else if (z) {
                    d3.mo1238a(d, 1, hVar.mo1186m());
                } else {
                    d3.mo1237a(d, s);
                }
            }
        }
        boolean z3 = hVar2.f909F[1] == C0336a.MATCH_CONSTRAINT && m1215a(hVar2, 1);
        if (d2.f1033i != 4 && d4.f1033i != 4) {
            if (hVar2.f909F[1] == C0336a.FIXED || (z3 && hVar.mo1196r() == 8)) {
                if (hVar2.f972w.f877d == null && hVar2.f974y.f877d == null) {
                    d2.mo1240b(1);
                    d4.mo1240b(1);
                    if (z) {
                        d4.mo1238a(d2, 1, hVar.mo1184l());
                    } else {
                        d4.mo1237a(d2, hVar.mo1178i());
                    }
                    C0330f fVar = hVar2.f975z;
                    if (fVar.f877d != null) {
                        fVar.mo1121d().mo1240b(1);
                        d2.mo1235a(1, hVar2.f975z.mo1121d(), -hVar2.f925V);
                    }
                } else if (hVar2.f972w.f877d != null && hVar2.f974y.f877d == null) {
                    d2.mo1240b(1);
                    d4.mo1240b(1);
                    if (z) {
                        d4.mo1238a(d2, 1, hVar.mo1184l());
                    } else {
                        d4.mo1237a(d2, hVar.mo1178i());
                    }
                    if (hVar2.f925V > 0) {
                        hVar2.f975z.mo1121d().mo1235a(1, d2, hVar2.f925V);
                    }
                } else if (hVar2.f972w.f877d == null && hVar2.f974y.f877d != null) {
                    d2.mo1240b(1);
                    d4.mo1240b(1);
                    if (z) {
                        d2.mo1238a(d4, -1, hVar.mo1184l());
                    } else {
                        d2.mo1237a(d4, -hVar.mo1178i());
                    }
                    if (hVar2.f925V > 0) {
                        hVar2.f975z.mo1121d().mo1235a(1, d2, hVar2.f925V);
                    }
                } else if (hVar2.f972w.f877d != null && hVar2.f974y.f877d != null) {
                    d2.mo1240b(2);
                    d4.mo1240b(2);
                    if (z) {
                        d2.mo1242b(d4, -1, hVar.mo1184l());
                        d4.mo1242b(d2, 1, hVar.mo1184l());
                        hVar.mo1184l().mo1251a(d2);
                        hVar.mo1186m().mo1251a(d4);
                    } else {
                        d2.mo1241b(d4, (float) (-hVar.mo1178i()));
                        d4.mo1241b(d2, (float) hVar.mo1178i());
                    }
                    if (hVar2.f925V > 0) {
                        hVar2.f975z.mo1121d().mo1235a(1, d2, hVar2.f925V);
                    }
                }
            } else if (z3) {
                int i2 = hVar.mo1178i();
                d2.mo1240b(1);
                d4.mo1240b(1);
                if (hVar2.f972w.f877d == null && hVar2.f974y.f877d == null) {
                    if (z) {
                        d4.mo1238a(d2, 1, hVar.mo1184l());
                    } else {
                        d4.mo1237a(d2, i2);
                    }
                } else if (hVar2.f972w.f877d == null || hVar2.f974y.f877d != null) {
                    if (hVar2.f972w.f877d != null || hVar2.f974y.f877d == null) {
                        if (hVar2.f972w.f877d != null && hVar2.f974y.f877d != null) {
                            if (z) {
                                hVar.mo1184l().mo1251a(d2);
                                hVar.mo1186m().mo1251a(d4);
                            }
                            if (hVar2.f913J == 0.0f) {
                                d2.mo1240b(3);
                                d4.mo1240b(3);
                                d2.mo1241b(d4, 0.0f);
                                d4.mo1241b(d2, 0.0f);
                                return;
                            }
                            d2.mo1240b(2);
                            d4.mo1240b(2);
                            d2.mo1241b(d4, (float) (-i2));
                            d4.mo1241b(d2, (float) i2);
                            hVar2.mo1175g(i2);
                            if (hVar2.f925V > 0) {
                                hVar2.f975z.mo1121d().mo1235a(1, d2, hVar2.f925V);
                            }
                        }
                    } else if (z) {
                        d2.mo1238a(d4, -1, hVar.mo1184l());
                    } else {
                        d2.mo1237a(d4, -i2);
                    }
                } else if (z) {
                    d4.mo1238a(d2, 1, hVar.mo1184l());
                } else {
                    d4.mo1237a(d2, i2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.f954ma == 2) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7.f956na == 2) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0109  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m1216a(android.support.constraint.p042a.p043a.C0337i r24, android.support.constraint.p042a.C0353e r25, int r26, int r27, android.support.constraint.p042a.p043a.C0328d r28) {
        /*
            r0 = r25
            r1 = r26
            r2 = r28
            android.support.constraint.a.a.h r3 = r2.f856a
            android.support.constraint.a.a.h r4 = r2.f858c
            android.support.constraint.a.a.h r5 = r2.f857b
            android.support.constraint.a.a.h r6 = r2.f859d
            android.support.constraint.a.a.h r7 = r2.f860e
            float r8 = r2.f866k
            android.support.constraint.a.a.h r9 = r2.f861f
            android.support.constraint.a.a.h r2 = r2.f862g
            r9 = r24
            android.support.constraint.a.a.h$a[] r2 = r9.f909F
            r2 = r2[r1]
            android.support.constraint.a.a.h$a r9 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            r2 = 2
            r10 = 1
            if (r1 != 0) goto L_0x0038
            int r11 = r7.f954ma
            if (r11 != 0) goto L_0x0028
            r11 = 1
            goto L_0x0029
        L_0x0028:
            r11 = 0
        L_0x0029:
            int r12 = r7.f954ma
            if (r12 != r10) goto L_0x002f
            r12 = 1
            goto L_0x0030
        L_0x002f:
            r12 = 0
        L_0x0030:
            int r7 = r7.f954ma
            if (r7 != r2) goto L_0x0036
        L_0x0034:
            r2 = 1
            goto L_0x004b
        L_0x0036:
            r2 = 0
            goto L_0x004b
        L_0x0038:
            int r11 = r7.f956na
            if (r11 != 0) goto L_0x003e
            r11 = 1
            goto L_0x003f
        L_0x003e:
            r11 = 0
        L_0x003f:
            int r12 = r7.f956na
            if (r12 != r10) goto L_0x0045
            r12 = 1
            goto L_0x0046
        L_0x0045:
            r12 = 0
        L_0x0046:
            int r7 = r7.f956na
            if (r7 != r2) goto L_0x0036
            goto L_0x0034
        L_0x004b:
            r14 = r3
            r10 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0053:
            r7 = 8
            if (r13 != 0) goto L_0x010c
            int r9 = r14.mo1196r()
            if (r9 == r7) goto L_0x00a1
            int r15 = r15 + 1
            if (r1 != 0) goto L_0x0066
            int r9 = r14.mo1198s()
            goto L_0x006a
        L_0x0066:
            int r9 = r14.mo1178i()
        L_0x006a:
            float r9 = (float) r9
            float r16 = r16 + r9
            if (r14 == r5) goto L_0x007a
            android.support.constraint.a.a.f[] r9 = r14.f907D
            r9 = r9[r27]
            int r9 = r9.mo1119b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x007a:
            if (r14 == r6) goto L_0x0089
            android.support.constraint.a.a.f[] r9 = r14.f907D
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.mo1119b()
            float r9 = (float) r9
            float r16 = r16 + r9
        L_0x0089:
            android.support.constraint.a.a.f[] r9 = r14.f907D
            r9 = r9[r27]
            int r9 = r9.mo1119b()
            float r9 = (float) r9
            float r17 = r17 + r9
            android.support.constraint.a.a.f[] r9 = r14.f907D
            int r19 = r27 + 1
            r9 = r9[r19]
            int r9 = r9.mo1119b()
            float r9 = (float) r9
            float r17 = r17 + r9
        L_0x00a1:
            android.support.constraint.a.a.f[] r9 = r14.f907D
            r9 = r9[r27]
            int r9 = r14.mo1196r()
            if (r9 == r7) goto L_0x00df
            android.support.constraint.a.a.h$a[] r7 = r14.f909F
            r7 = r7[r1]
            android.support.constraint.a.a.h$a r9 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r7 != r9) goto L_0x00df
            int r10 = r10 + 1
            if (r1 != 0) goto L_0x00c7
            int r7 = r14.f939f
            if (r7 == 0) goto L_0x00bd
            r7 = 0
            return r7
        L_0x00bd:
            r7 = 0
            int r9 = r14.f945i
            if (r9 != 0) goto L_0x00c6
            int r9 = r14.f947j
            if (r9 == 0) goto L_0x00d6
        L_0x00c6:
            return r7
        L_0x00c7:
            r7 = 0
            int r9 = r14.f941g
            if (r9 == 0) goto L_0x00cd
            return r7
        L_0x00cd:
            int r9 = r14.f951l
            if (r9 != 0) goto L_0x00de
            int r9 = r14.f953m
            if (r9 == 0) goto L_0x00d6
            goto L_0x00de
        L_0x00d6:
            float r9 = r14.f913J
            r18 = 0
            int r9 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r9 == 0) goto L_0x00df
        L_0x00de:
            return r7
        L_0x00df:
            android.support.constraint.a.a.f[] r7 = r14.f907D
            int r9 = r27 + 1
            r7 = r7[r9]
            android.support.constraint.a.a.f r7 = r7.f877d
            if (r7 == 0) goto L_0x0101
            android.support.constraint.a.a.h r7 = r7.f875b
            android.support.constraint.a.a.f[] r9 = r7.f907D
            r20 = r7
            r7 = r9[r27]
            android.support.constraint.a.a.f r7 = r7.f877d
            if (r7 == 0) goto L_0x0101
            r7 = r9[r27]
            android.support.constraint.a.a.f r7 = r7.f877d
            android.support.constraint.a.a.h r7 = r7.f875b
            if (r7 == r14) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r19 = r20
            goto L_0x0103
        L_0x0101:
            r19 = 0
        L_0x0103:
            if (r19 == 0) goto L_0x0109
            r14 = r19
            goto L_0x0053
        L_0x0109:
            r13 = 1
            goto L_0x0053
        L_0x010c:
            android.support.constraint.a.a.f[] r9 = r3.f907D
            r9 = r9[r27]
            android.support.constraint.a.a.p r9 = r9.mo1121d()
            android.support.constraint.a.a.f[] r13 = r4.f907D
            int r19 = r27 + 1
            r13 = r13[r19]
            android.support.constraint.a.a.p r13 = r13.mo1121d()
            android.support.constraint.a.a.p r7 = r9.f1029e
            if (r7 == 0) goto L_0x0382
            r21 = r3
            android.support.constraint.a.a.p r3 = r13.f1029e
            if (r3 != 0) goto L_0x012a
            goto L_0x0382
        L_0x012a:
            int r7 = r7.f1042b
            r0 = 1
            if (r7 != r0) goto L_0x0380
            int r3 = r3.f1042b
            if (r3 == r0) goto L_0x0135
            goto L_0x0380
        L_0x0135:
            if (r10 <= 0) goto L_0x013b
            if (r10 == r15) goto L_0x013b
            r0 = 0
            return r0
        L_0x013b:
            if (r2 != 0) goto L_0x0144
            if (r11 != 0) goto L_0x0144
            if (r12 == 0) goto L_0x0142
            goto L_0x0144
        L_0x0142:
            r7 = 0
            goto L_0x015d
        L_0x0144:
            if (r5 == 0) goto L_0x0150
            android.support.constraint.a.a.f[] r0 = r5.f907D
            r0 = r0[r27]
            int r0 = r0.mo1119b()
            float r7 = (float) r0
            goto L_0x0151
        L_0x0150:
            r7 = 0
        L_0x0151:
            if (r6 == 0) goto L_0x015d
            android.support.constraint.a.a.f[] r0 = r6.f907D
            r0 = r0[r19]
            int r0 = r0.mo1119b()
            float r0 = (float) r0
            float r7 = r7 + r0
        L_0x015d:
            android.support.constraint.a.a.p r0 = r9.f1029e
            float r0 = r0.f1032h
            android.support.constraint.a.a.p r3 = r13.f1029e
            float r3 = r3.f1032h
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 >= 0) goto L_0x016b
            float r3 = r3 - r0
            goto L_0x016d
        L_0x016b:
            float r3 = r0 - r3
        L_0x016d:
            float r3 = r3 - r16
            r22 = 1
            if (r10 <= 0) goto L_0x0223
            if (r10 != r15) goto L_0x0223
            android.support.constraint.a.a.h r2 = r14.mo1182k()
            if (r2 == 0) goto L_0x0189
            android.support.constraint.a.a.h r2 = r14.mo1182k()
            android.support.constraint.a.a.h$a[] r2 = r2.f909F
            r2 = r2[r1]
            android.support.constraint.a.a.h$a r5 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r2 != r5) goto L_0x0189
            r2 = 0
            return r2
        L_0x0189:
            float r3 = r3 + r16
            float r3 = r3 - r17
            r2 = r0
            r0 = r21
        L_0x0190:
            if (r0 == 0) goto L_0x0221
            android.support.constraint.a.f r5 = android.support.constraint.p042a.C0353e.f1063b
            if (r5 == 0) goto L_0x01a8
            long r6 = r5.f1106z
            long r6 = r6 - r22
            r5.f1106z = r6
            long r6 = r5.f1098r
            long r6 = r6 + r22
            r5.f1098r = r6
            long r6 = r5.f1104x
            long r6 = r6 + r22
            r5.f1104x = r6
        L_0x01a8:
            android.support.constraint.a.a.h[] r5 = r0.f966sa
            r5 = r5[r1]
            if (r5 != 0) goto L_0x01b4
            if (r0 != r4) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r13 = r25
            goto L_0x021e
        L_0x01b4:
            float r6 = (float) r10
            float r6 = r3 / r6
            r7 = 0
            int r11 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x01cd
            float[] r6 = r0.f962qa
            r7 = r6[r1]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x01c8
            r7 = 0
            goto L_0x01ce
        L_0x01c8:
            r6 = r6[r1]
            float r6 = r6 * r3
            float r6 = r6 / r8
        L_0x01cd:
            r7 = r6
        L_0x01ce:
            int r6 = r0.mo1196r()
            r11 = 8
            if (r6 != r11) goto L_0x01d7
            r7 = 0
        L_0x01d7:
            android.support.constraint.a.a.f[] r6 = r0.f907D
            r6 = r6[r27]
            int r6 = r6.mo1119b()
            float r6 = (float) r6
            float r2 = r2 + r6
            android.support.constraint.a.a.f[] r6 = r0.f907D
            r6 = r6[r27]
            android.support.constraint.a.a.p r6 = r6.mo1121d()
            android.support.constraint.a.a.p r11 = r9.f1031g
            r6.mo1236a(r11, r2)
            android.support.constraint.a.a.f[] r6 = r0.f907D
            r6 = r6[r19]
            android.support.constraint.a.a.p r6 = r6.mo1121d()
            android.support.constraint.a.a.p r11 = r9.f1031g
            float r2 = r2 + r7
            r6.mo1236a(r11, r2)
            android.support.constraint.a.a.f[] r6 = r0.f907D
            r6 = r6[r27]
            android.support.constraint.a.a.p r6 = r6.mo1121d()
            r13 = r25
            r6.mo1239a(r13)
            android.support.constraint.a.a.f[] r6 = r0.f907D
            r6 = r6[r19]
            android.support.constraint.a.a.p r6 = r6.mo1121d()
            r6.mo1239a(r13)
            android.support.constraint.a.a.f[] r0 = r0.f907D
            r0 = r0[r19]
            int r0 = r0.mo1119b()
            float r0 = (float) r0
            float r2 = r2 + r0
        L_0x021e:
            r0 = r5
            goto L_0x0190
        L_0x0221:
            r0 = 1
            return r0
        L_0x0223:
            r13 = r25
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x022d
            r2 = 1
            r11 = 0
            r12 = 0
        L_0x022d:
            if (r2 == 0) goto L_0x02ac
            float r3 = r3 - r7
            r2 = r21
            float r5 = r2.mo1151b(r1)
            float r3 = r3 * r5
            float r0 = r0 + r3
        L_0x0239:
            if (r2 == 0) goto L_0x02b3
            android.support.constraint.a.f r3 = android.support.constraint.p042a.C0353e.f1063b
            if (r3 == 0) goto L_0x0251
            long r5 = r3.f1106z
            long r5 = r5 - r22
            r3.f1106z = r5
            long r5 = r3.f1098r
            long r5 = r5 + r22
            r3.f1098r = r5
            long r5 = r3.f1104x
            long r5 = r5 + r22
            r3.f1104x = r5
        L_0x0251:
            android.support.constraint.a.a.h[] r3 = r2.f966sa
            r3 = r3[r1]
            if (r3 != 0) goto L_0x0259
            if (r2 != r4) goto L_0x02aa
        L_0x0259:
            if (r1 != 0) goto L_0x0260
            int r5 = r2.mo1198s()
            goto L_0x0264
        L_0x0260:
            int r5 = r2.mo1178i()
        L_0x0264:
            float r5 = (float) r5
            android.support.constraint.a.a.f[] r6 = r2.f907D
            r6 = r6[r27]
            int r6 = r6.mo1119b()
            float r6 = (float) r6
            float r0 = r0 + r6
            android.support.constraint.a.a.f[] r6 = r2.f907D
            r6 = r6[r27]
            android.support.constraint.a.a.p r6 = r6.mo1121d()
            android.support.constraint.a.a.p r7 = r9.f1031g
            r6.mo1236a(r7, r0)
            android.support.constraint.a.a.f[] r6 = r2.f907D
            r6 = r6[r19]
            android.support.constraint.a.a.p r6 = r6.mo1121d()
            android.support.constraint.a.a.p r7 = r9.f1031g
            float r0 = r0 + r5
            r6.mo1236a(r7, r0)
            android.support.constraint.a.a.f[] r5 = r2.f907D
            r5 = r5[r27]
            android.support.constraint.a.a.p r5 = r5.mo1121d()
            r5.mo1239a(r13)
            android.support.constraint.a.a.f[] r5 = r2.f907D
            r5 = r5[r19]
            android.support.constraint.a.a.p r5 = r5.mo1121d()
            r5.mo1239a(r13)
            android.support.constraint.a.a.f[] r2 = r2.f907D
            r2 = r2[r19]
            int r2 = r2.mo1119b()
            float r2 = (float) r2
            float r0 = r0 + r2
        L_0x02aa:
            r2 = r3
            goto L_0x0239
        L_0x02ac:
            r2 = r21
            if (r11 != 0) goto L_0x02b6
            if (r12 == 0) goto L_0x02b3
            goto L_0x02b6
        L_0x02b3:
            r0 = 1
            goto L_0x037f
        L_0x02b6:
            if (r11 == 0) goto L_0x02ba
        L_0x02b8:
            float r3 = r3 - r7
            goto L_0x02bd
        L_0x02ba:
            if (r12 == 0) goto L_0x02bd
            goto L_0x02b8
        L_0x02bd:
            int r6 = r15 + 1
            float r6 = (float) r6
            float r6 = r3 / r6
            if (r12 == 0) goto L_0x02cf
            r7 = 1
            if (r15 <= r7) goto L_0x02cb
            int r6 = r15 + -1
            float r6 = (float) r6
            goto L_0x02cd
        L_0x02cb:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x02cd:
            float r6 = r3 / r6
        L_0x02cf:
            int r3 = r2.mo1196r()
            r7 = 8
            if (r3 == r7) goto L_0x02da
            float r3 = r0 + r6
            goto L_0x02db
        L_0x02da:
            r3 = r0
        L_0x02db:
            if (r12 == 0) goto L_0x02ea
            r7 = 1
            if (r15 <= r7) goto L_0x02ea
            android.support.constraint.a.a.f[] r3 = r5.f907D
            r3 = r3[r27]
            int r3 = r3.mo1119b()
            float r3 = (float) r3
            float r3 = r3 + r0
        L_0x02ea:
            if (r11 == 0) goto L_0x02f8
            if (r5 == 0) goto L_0x02f8
            android.support.constraint.a.a.f[] r0 = r5.f907D
            r0 = r0[r27]
            int r0 = r0.mo1119b()
            float r0 = (float) r0
            float r3 = r3 + r0
        L_0x02f8:
            if (r2 == 0) goto L_0x02b3
            android.support.constraint.a.f r0 = android.support.constraint.p042a.C0353e.f1063b
            if (r0 == 0) goto L_0x0310
            long r7 = r0.f1106z
            long r7 = r7 - r22
            r0.f1106z = r7
            long r7 = r0.f1098r
            long r7 = r7 + r22
            r0.f1098r = r7
            long r7 = r0.f1104x
            long r7 = r7 + r22
            r0.f1104x = r7
        L_0x0310:
            android.support.constraint.a.a.h[] r0 = r2.f966sa
            r0 = r0[r1]
            if (r0 != 0) goto L_0x031c
            if (r2 != r4) goto L_0x0319
            goto L_0x031c
        L_0x0319:
            r7 = 8
            goto L_0x037c
        L_0x031c:
            if (r1 != 0) goto L_0x0323
            int r7 = r2.mo1198s()
            goto L_0x0327
        L_0x0323:
            int r7 = r2.mo1178i()
        L_0x0327:
            float r7 = (float) r7
            if (r2 == r5) goto L_0x0334
            android.support.constraint.a.a.f[] r8 = r2.f907D
            r8 = r8[r27]
            int r8 = r8.mo1119b()
            float r8 = (float) r8
            float r3 = r3 + r8
        L_0x0334:
            android.support.constraint.a.a.f[] r8 = r2.f907D
            r8 = r8[r27]
            android.support.constraint.a.a.p r8 = r8.mo1121d()
            android.support.constraint.a.a.p r10 = r9.f1031g
            r8.mo1236a(r10, r3)
            android.support.constraint.a.a.f[] r8 = r2.f907D
            r8 = r8[r19]
            android.support.constraint.a.a.p r8 = r8.mo1121d()
            android.support.constraint.a.a.p r10 = r9.f1031g
            float r11 = r3 + r7
            r8.mo1236a(r10, r11)
            android.support.constraint.a.a.f[] r8 = r2.f907D
            r8 = r8[r27]
            android.support.constraint.a.a.p r8 = r8.mo1121d()
            r8.mo1239a(r13)
            android.support.constraint.a.a.f[] r8 = r2.f907D
            r8 = r8[r19]
            android.support.constraint.a.a.p r8 = r8.mo1121d()
            r8.mo1239a(r13)
            android.support.constraint.a.a.f[] r2 = r2.f907D
            r2 = r2[r19]
            int r2 = r2.mo1119b()
            float r2 = (float) r2
            float r7 = r7 + r2
            float r3 = r3 + r7
            if (r0 == 0) goto L_0x0319
            int r2 = r0.mo1196r()
            r7 = 8
            if (r2 == r7) goto L_0x037c
            float r3 = r3 + r6
        L_0x037c:
            r2 = r0
            goto L_0x02f8
        L_0x037f:
            return r0
        L_0x0380:
            r0 = 0
            return r0
        L_0x0382:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0342n.m1216a(android.support.constraint.a.a.i, android.support.constraint.a.e, int, int, android.support.constraint.a.a.d):boolean");
    }

    /* renamed from: a */
    static void m1213a(C0335h hVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        hVar.f907D[i3].mo1121d().f1031g = hVar.mo1182k().f971v.mo1121d();
        hVar.f907D[i3].mo1121d().f1032h = (float) i2;
        hVar.f907D[i3].mo1121d().f1042b = 1;
        hVar.f907D[i4].mo1121d().f1031g = hVar.f907D[i3].mo1121d();
        hVar.f907D[i4].mo1121d().f1032h = (float) hVar.mo1166d(i);
        hVar.f907D[i4].mo1121d().f1042b = 1;
    }
}
