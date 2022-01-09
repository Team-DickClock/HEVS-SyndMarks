package hes.wallis.mark.ui.mechanic;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MechanicViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MechanicViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Mechanic fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}