package com.abhishekwagh.mavenir1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CreateEntryFragment extends Fragment {

    Button buttonAddUser;
    EditText textViewName, textViewPhone, textViewBirthDay;
    ImageView imageView;

    public CreateEntryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_create_entry, container, false);


    textViewName = view.findViewById(R.id.et_name);
    textViewPhone = view.findViewById(R.id.et_phone);
    textViewBirthDay = view.findViewById(R.id.et_Birthday);
//         imageView = view.findViewById(R.id.iv_image_row)

    buttonAddUser = view.findViewById(R.id.btn_save);
        buttonAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = textViewName.getText().toString();
                String phone = textViewPhone.getText().toString();
//                Date dob = (Date) textViewBirthDay.getText();
                String dob = textViewBirthDay.getText().toString();

                Contacts contacts = new Contacts();
                contacts.setName(name);
                contacts.setBirthday(dob);
                contacts.setPhone_Number(phone);

                //                Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
//                ByteArrayOutputStream stream = new ByteArrayOutputStream();
//                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
//                byte[] byteArray = stream.toByteArray();
//                byte[] bitMapData = stream.toByteArray();
//                contacts.setImage(byteArray);

                MainActivity.contactsDatabase.contactsDAO().insertUser(contacts);
                Toast.makeText(getActivity(), "Contact is added successfully", Toast.LENGTH_SHORT).show();

                textViewName.setText("");
                textViewPhone.setText("");
                textViewBirthDay.setText("");
            }
        });

             return view;
    }
}
