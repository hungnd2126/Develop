package vn.baonq.mvvmproject.ui.main.message.messages;

import android.view.View;

import com.stfalcon.chatkit.messages.MessageHolders;

import vn.baonq.mvvmproject.ui.main.message.model.Message;

public class CustomOutcomingTextMessageViewHolder
        extends MessageHolders.OutcomingTextMessageViewHolder<Message> {

    public CustomOutcomingTextMessageViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void onBind(Message message) {
        super.onBind(message);

        time.setText(message.getStatus() + " " + time.getText());
    }
}
