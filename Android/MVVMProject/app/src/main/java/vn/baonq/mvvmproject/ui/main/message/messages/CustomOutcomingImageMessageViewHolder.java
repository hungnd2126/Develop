package vn.baonq.mvvmproject.ui.main.message.messages;

import android.view.View;

import com.stfalcon.chatkit.messages.MessageHolders;

import vn.baonq.mvvmproject.ui.main.message.model.Message;

/*
 * Created by troy379 on 05.04.17.
 */
public class CustomOutcomingImageMessageViewHolder
        extends MessageHolders.OutcomingImageMessageViewHolder<Message> {

    public CustomOutcomingImageMessageViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onBind(Message message) {
        super.onBind(message);

        time.setText(message.getStatus() + " " + time.getText());
    }
}