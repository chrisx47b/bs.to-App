package android.arch.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.arch.lifecycle.C0299d.C0300a;
import android.os.Bundle;

/* renamed from: android.arch.lifecycle.p */
/* compiled from: ReportFragment */
public class C0314p extends Fragment {

    /* renamed from: a */
    private C0315a f749a;

    /* renamed from: android.arch.lifecycle.p$a */
    /* compiled from: ReportFragment */
    interface C0315a {
        /* renamed from: a */
        void mo1044a();

        /* renamed from: b */
        void mo1045b();

        void onCreate();
    }

    /* renamed from: a */
    public static void m1001a(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "android.arch.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new C0314p(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: b */
    private void m1004b(C0315a aVar) {
        if (aVar != null) {
            aVar.mo1044a();
        }
    }

    /* renamed from: c */
    private void m1005c(C0315a aVar) {
        if (aVar != null) {
            aVar.mo1045b();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1003a(this.f749a);
        m1002a(C0300a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m1002a(C0300a.ON_DESTROY);
        this.f749a = null;
    }

    public void onPause() {
        super.onPause();
        m1002a(C0300a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m1004b(this.f749a);
        m1002a(C0300a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m1005c(this.f749a);
        m1002a(C0300a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m1002a(C0300a.ON_STOP);
    }

    /* renamed from: a */
    private void m1003a(C0315a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    /* renamed from: a */
    private void m1002a(C0300a aVar) {
        Activity activity = getActivity();
        if (activity instanceof C0307i) {
            ((C0307i) activity).mo1031a().mo1033b(aVar);
            return;
        }
        if (activity instanceof C0303f) {
            C0299d a = ((C0303f) activity).mo1031a();
            if (a instanceof C0305h) {
                ((C0305h) a).mo1033b(aVar);
            }
        }
    }
}
