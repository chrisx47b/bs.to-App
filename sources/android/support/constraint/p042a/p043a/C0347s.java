package android.support.constraint.p042a.p043a;

import android.support.constraint.p042a.p043a.C0330f.C0332b;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.s */
/* compiled from: Snapshot */
public class C0347s {

    /* renamed from: a */
    private int f1043a;

    /* renamed from: b */
    private int f1044b;

    /* renamed from: c */
    private int f1045c;

    /* renamed from: d */
    private int f1046d;

    /* renamed from: e */
    private ArrayList<C0348a> f1047e = new ArrayList<>();

    /* renamed from: android.support.constraint.a.a.s$a */
    /* compiled from: Snapshot */
    static class C0348a {

        /* renamed from: a */
        private C0330f f1048a;

        /* renamed from: b */
        private C0330f f1049b;

        /* renamed from: c */
        private int f1050c;

        /* renamed from: d */
        private C0332b f1051d;

        /* renamed from: e */
        private int f1052e;

        public C0348a(C0330f fVar) {
            this.f1048a = fVar;
            this.f1049b = fVar.mo1124g();
            this.f1050c = fVar.mo1119b();
            this.f1051d = fVar.mo1123f();
            this.f1052e = fVar.mo1114a();
        }

        /* renamed from: a */
        public void mo1256a(C0335h hVar) {
            hVar.mo1136a(this.f1048a.mo1125h()).mo1118a(this.f1049b, this.f1050c, this.f1051d, this.f1052e);
        }

        /* renamed from: b */
        public void mo1257b(C0335h hVar) {
            this.f1048a = hVar.mo1136a(this.f1048a.mo1125h());
            C0330f fVar = this.f1048a;
            if (fVar != null) {
                this.f1049b = fVar.mo1124g();
                this.f1050c = this.f1048a.mo1119b();
                this.f1051d = this.f1048a.mo1123f();
                this.f1052e = this.f1048a.mo1114a();
                return;
            }
            this.f1049b = null;
            this.f1050c = 0;
            this.f1051d = C0332b.STRONG;
            this.f1052e = 0;
        }
    }

    public C0347s(C0335h hVar) {
        this.f1043a = hVar.mo1203v();
        this.f1044b = hVar.mo1204w();
        this.f1045c = hVar.mo1198s();
        this.f1046d = hVar.mo1178i();
        ArrayList b = hVar.mo1152b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f1047e.add(new C0348a((C0330f) b.get(i)));
        }
    }

    /* renamed from: a */
    public void mo1254a(C0335h hVar) {
        hVar.mo1197r(this.f1043a);
        hVar.mo1199s(this.f1044b);
        hVar.mo1191o(this.f1045c);
        hVar.mo1175g(this.f1046d);
        int size = this.f1047e.size();
        for (int i = 0; i < size; i++) {
            ((C0348a) this.f1047e.get(i)).mo1256a(hVar);
        }
    }

    /* renamed from: b */
    public void mo1255b(C0335h hVar) {
        this.f1043a = hVar.mo1203v();
        this.f1044b = hVar.mo1204w();
        this.f1045c = hVar.mo1198s();
        this.f1046d = hVar.mo1178i();
        int size = this.f1047e.size();
        for (int i = 0; i < size; i++) {
            ((C0348a) this.f1047e.get(i)).mo1257b(hVar);
        }
    }
}
