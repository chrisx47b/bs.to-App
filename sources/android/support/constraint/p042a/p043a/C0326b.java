package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.C0353e;
import android.support.constraint.p042a.C0355f;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.b */
/* compiled from: Barrier */
public class C0326b extends C0341m {

    /* renamed from: xa */
    private int f853xa = 0;

    /* renamed from: ya */
    private ArrayList<C0344p> f854ya = new ArrayList<>(4);

    /* renamed from: za */
    private boolean f855za = true;

    /* renamed from: F */
    public void mo1106F() {
        super.mo1106F();
        this.f854ya.clear();
    }

    /* renamed from: G */
    public void mo1107G() {
        C0344p pVar;
        float f;
        C0344p pVar2;
        int i = this.f853xa;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                pVar = this.f973x.mo1121d();
            } else if (i == 2) {
                pVar = this.f972w.mo1121d();
            } else if (i == 3) {
                pVar = this.f974y.mo1121d();
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            pVar = this.f971v.mo1121d();
        }
        int size = this.f854ya.size();
        C0344p pVar3 = null;
        int i2 = 0;
        while (i2 < size) {
            C0344p pVar4 = (C0344p) this.f854ya.get(i2);
            if (pVar4.f1042b == 1) {
                int i3 = this.f853xa;
                if (i3 == 0 || i3 == 2) {
                    f = pVar4.f1032h;
                    if (f < f2) {
                        pVar2 = pVar4.f1031g;
                    } else {
                        i2++;
                    }
                } else {
                    f = pVar4.f1032h;
                    if (f > f2) {
                        pVar2 = pVar4.f1031g;
                    } else {
                        i2++;
                    }
                }
                pVar3 = pVar2;
                f2 = f;
                i2++;
            } else {
                return;
            }
        }
        if (C0353e.m1284e() != null) {
            C0355f e = C0353e.m1284e();
            e.f1105y++;
        }
        pVar.f1031g = pVar3;
        pVar.f1032h = f2;
        pVar.mo1250a();
        int i4 = this.f853xa;
        if (i4 == 0) {
            this.f973x.mo1121d().mo1236a(pVar3, f2);
        } else if (i4 == 1) {
            this.f971v.mo1121d().mo1236a(pVar3, f2);
        } else if (i4 == 2) {
            this.f974y.mo1121d().mo1236a(pVar3, f2);
        } else if (i4 == 3) {
            this.f972w.mo1121d().mo1236a(pVar3, f2);
        }
    }

    /* renamed from: a */
    public void mo1108a(int i) {
        C0344p pVar;
        C0346r rVar;
        C0335h hVar = this.f910G;
        if (hVar != null && ((C0337i) hVar).mo1112t(2)) {
            int i2 = this.f853xa;
            if (i2 == 0) {
                pVar = this.f971v.mo1121d();
            } else if (i2 == 1) {
                pVar = this.f973x.mo1121d();
            } else if (i2 == 2) {
                pVar = this.f972w.mo1121d();
            } else if (i2 == 3) {
                pVar = this.f974y.mo1121d();
            } else {
                return;
            }
            pVar.mo1240b(5);
            int i3 = this.f853xa;
            if (i3 == 0 || i3 == 1) {
                this.f972w.mo1121d().mo1236a((C0344p) null, 0.0f);
                this.f974y.mo1121d().mo1236a((C0344p) null, 0.0f);
            } else {
                this.f971v.mo1121d().mo1236a((C0344p) null, 0.0f);
                this.f973x.mo1121d().mo1236a((C0344p) null, 0.0f);
            }
            this.f854ya.clear();
            for (int i4 = 0; i4 < this.f1025wa; i4++) {
                C0335h hVar2 = this.f1024va[i4];
                if (this.f855za || hVar2.mo1110a()) {
                    int i5 = this.f853xa;
                    if (i5 == 0) {
                        rVar = hVar2.f971v.mo1121d();
                    } else if (i5 == 1) {
                        rVar = hVar2.f973x.mo1121d();
                    } else if (i5 == 2) {
                        rVar = hVar2.f972w.mo1121d();
                    } else if (i5 != 3) {
                        rVar = null;
                    } else {
                        rVar = hVar2.f974y.mo1121d();
                    }
                    if (rVar != null) {
                        this.f854ya.add(rVar);
                        rVar.mo1251a(pVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo1110a() {
        return true;
    }

    /* renamed from: c */
    public void mo1111c(boolean z) {
        this.f855za = z;
    }

    /* renamed from: t */
    public void mo1112t(int i) {
        this.f853xa = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1109a(android.support.constraint.p042a.C0353e r11) {
        /*
            r10 = this;
            android.support.constraint.a.a.f[] r0 = r10.f907D
            android.support.constraint.a.a.f r1 = r10.f971v
            r2 = 0
            r0[r2] = r1
            android.support.constraint.a.a.f r1 = r10.f972w
            r3 = 2
            r0[r3] = r1
            android.support.constraint.a.a.f r1 = r10.f973x
            r4 = 1
            r0[r4] = r1
            android.support.constraint.a.a.f r1 = r10.f974y
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L_0x0017:
            android.support.constraint.a.a.f[] r1 = r10.f907D
            int r6 = r1.length
            if (r0 >= r6) goto L_0x0029
            r6 = r1[r0]
            r1 = r1[r0]
            android.support.constraint.a.i r1 = r11.mo1291a(r1)
            r6.f883j = r1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0029:
            int r0 = r10.f853xa
            if (r0 < 0) goto L_0x013a
            r6 = 4
            if (r0 >= r6) goto L_0x013a
            r0 = r1[r0]
            r1 = 0
        L_0x0033:
            int r6 = r10.f1025wa
            if (r1 >= r6) goto L_0x0068
            android.support.constraint.a.a.h[] r6 = r10.f1024va
            r6 = r6[r1]
            boolean r7 = r10.f855za
            if (r7 != 0) goto L_0x0046
            boolean r7 = r6.mo1110a()
            if (r7 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r7 = r10.f853xa
            if (r7 == 0) goto L_0x004c
            if (r7 != r4) goto L_0x0056
        L_0x004c:
            android.support.constraint.a.a.h$a r7 = r6.mo1180j()
            android.support.constraint.a.a.h$a r8 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0069
        L_0x0056:
            int r7 = r10.f853xa
            if (r7 == r3) goto L_0x005c
            if (r7 != r5) goto L_0x0065
        L_0x005c:
            android.support.constraint.a.a.h$a r6 = r6.mo1194q()
            android.support.constraint.a.a.h$a r7 = android.support.constraint.p042a.p043a.C0335h.C0336a.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0065
            goto L_0x0054
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r6 = r10.f853xa
            if (r6 == 0) goto L_0x007d
            if (r6 != r4) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            android.support.constraint.a.a.h r6 = r10.mo1182k()
            android.support.constraint.a.a.h$a r6 = r6.mo1194q()
            android.support.constraint.a.a.h$a r7 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
            goto L_0x0089
        L_0x007d:
            android.support.constraint.a.a.h r6 = r10.mo1182k()
            android.support.constraint.a.a.h$a r6 = r6.mo1180j()
            android.support.constraint.a.a.h$a r7 = android.support.constraint.p042a.p043a.C0335h.C0336a.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            r6 = 0
        L_0x008b:
            int r7 = r10.f1025wa
            if (r6 >= r7) goto L_0x00c3
            android.support.constraint.a.a.h[] r7 = r10.f1024va
            r7 = r7[r6]
            boolean r8 = r10.f855za
            if (r8 != 0) goto L_0x009e
            boolean r8 = r7.mo1110a()
            if (r8 != 0) goto L_0x009e
            goto L_0x00c0
        L_0x009e:
            android.support.constraint.a.a.f[] r8 = r7.f907D
            int r9 = r10.f853xa
            r8 = r8[r9]
            android.support.constraint.a.i r8 = r11.mo1291a(r8)
            android.support.constraint.a.a.f[] r7 = r7.f907D
            int r9 = r10.f853xa
            r7 = r7[r9]
            r7.f883j = r8
            if (r9 == 0) goto L_0x00bb
            if (r9 != r3) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            android.support.constraint.a.i r7 = r0.f883j
            r11.mo1299a(r7, r8, r1)
            goto L_0x00c0
        L_0x00bb:
            android.support.constraint.a.i r7 = r0.f883j
            r11.mo1303b(r7, r8, r1)
        L_0x00c0:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00c3:
            int r0 = r10.f853xa
            r6 = 5
            r7 = 6
            if (r0 != 0) goto L_0x00e4
            android.support.constraint.a.a.f r0 = r10.f973x
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.f r3 = r10.f971v
            android.support.constraint.a.i r3 = r3.f883j
            r11.mo1288a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            android.support.constraint.a.a.f r0 = r10.f971v
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.h r1 = r10.f910G
            android.support.constraint.a.a.f r1 = r1.f973x
            android.support.constraint.a.i r1 = r1.f883j
            r11.mo1288a(r0, r1, r2, r6)
            goto L_0x013a
        L_0x00e4:
            if (r0 != r4) goto L_0x0101
            android.support.constraint.a.a.f r0 = r10.f971v
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.f r3 = r10.f973x
            android.support.constraint.a.i r3 = r3.f883j
            r11.mo1288a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            android.support.constraint.a.a.f r0 = r10.f971v
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.h r1 = r10.f910G
            android.support.constraint.a.a.f r1 = r1.f971v
            android.support.constraint.a.i r1 = r1.f883j
            r11.mo1288a(r0, r1, r2, r6)
            goto L_0x013a
        L_0x0101:
            if (r0 != r3) goto L_0x011e
            android.support.constraint.a.a.f r0 = r10.f974y
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.f r3 = r10.f972w
            android.support.constraint.a.i r3 = r3.f883j
            r11.mo1288a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            android.support.constraint.a.a.f r0 = r10.f972w
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.h r1 = r10.f910G
            android.support.constraint.a.a.f r1 = r1.f974y
            android.support.constraint.a.i r1 = r1.f883j
            r11.mo1288a(r0, r1, r2, r6)
            goto L_0x013a
        L_0x011e:
            if (r0 != r5) goto L_0x013a
            android.support.constraint.a.a.f r0 = r10.f972w
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.f r3 = r10.f974y
            android.support.constraint.a.i r3 = r3.f883j
            r11.mo1288a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013a
            android.support.constraint.a.a.f r0 = r10.f972w
            android.support.constraint.a.i r0 = r0.f883j
            android.support.constraint.a.a.h r1 = r10.f910G
            android.support.constraint.a.a.f r1 = r1.f972w
            android.support.constraint.a.i r1 = r1.f883j
            r11.mo1288a(r0, r1, r2, r6)
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p042a.p043a.C0326b.mo1109a(android.support.constraint.a.e):void");
    }
}
