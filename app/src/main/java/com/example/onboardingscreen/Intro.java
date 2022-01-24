package com.example.onboardingscreen;

import android.Manifest;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import io.github.dreierf.materialintroscreen.MaterialIntroActivity;
import io.github.dreierf.materialintroscreen.MessageButtonBehaviour;
import io.github.dreierf.materialintroscreen.SlideFragmentBuilder;

public class Intro extends MaterialIntroActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.purple_200)
                        .buttonsColor(R.color.purple_200)
                        .image(io.github.dreierf.materialintroscreen.R.drawable.ic_next)
                        .title("title 1")
                        .description("Description 3")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("We provide solutions to make you love your work");
                    }
                }, "Work with love"));
        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.purple_200)
                        .buttonsColor(R.color.purple_200)
                        .image(io.github.dreierf.materialintroscreen.R.drawable.ic_next)
                        .title("title 2")
                        .description("Description 3")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("We provide solutions to make you love your work");
                    }
                }, "Work with love"));
        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.purple_200)
                        .buttonsColor(R.color.purple_200)
                        .image(io.github.dreierf.materialintroscreen.R.drawable.ic_next)
                        .title("title 3")
                        .description("Description 3")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        showMessage("We provide solutions to make you love your work");
                    }
                }, "Work with love"));
    }
}
