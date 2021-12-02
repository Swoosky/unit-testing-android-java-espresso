package com.example.UGD12_E_0193.UnitTesting0193;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RandomPresenterTest0193 {
    @Mock
    private RandomView view;
    @Mock
    private RandomService service;
    private RandomPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new RandomPresenter(view, service);
    }

    @Test
    public void shouldShowErrorMessageWhenEmailIsEmpty() throws Exception {
        System.out.println("\n\nTest Case Email empty\n");
        when(view.getEmail()).thenReturn("");
        System.out.println("Email : "+ view.getEmail());

        presenter.onProfilClicked();
        verify(view).showEmailError("Atribut email tidak boleh kosong.");
    }

    @Test
    public void shouldShowErrorMessageWhenEmailIsNotRegexEmail() throws Exception {
        System.out.println("\n\nTest Case Email Salah Format\n");
        when(view.getEmail()).thenReturn("190710193@students");
        System.out.println("Email : "+ view.getEmail());

        presenter.onProfilClicked();
        verify(view).showEmailError("Format email tidak sesuai aturan.");
    }

    @Test
    public void shouldShowErrorMessageWhenPasswordIsEmpty() throws Exception {
        System.out.println("\n\nTest Case Password empty\n");
        when(view.getEmail()).thenReturn("190710193@students.com");
        System.out.println("Email : "+ view.getEmail());

        when(view.getPassword()).thenReturn("");
        System.out.println("Password : "+view.getPassword());

        presenter.onProfilClicked();
        verify(view).showPasswordError("Atribut password tidak boleh kosong.");
    }

    @Test
    public void shouldShowErrorMessageWhenPasswordIsNotRegexAlphaNum() throws Exception {
        System.out.println("\n\nTest Case Password Salah Format\n");
        when(view.getEmail()).thenReturn("190710193@students.com");
        System.out.println("Email : "+ view.getEmail());

        when(view.getPassword()).thenReturn("s*#($");
        System.out.println("Password : "+view.getPassword());

        presenter.onProfilClicked();
        verify(view).showPasswordError("Format password tidak sesuai aturan.");
    }

    @Test
    public void shouldShowErrorMessageWhenPasswordIsLess6() throws Exception {
        System.out.println("\n\nTest Case Password length < 6\n");
        when(view.getEmail()).thenReturn("190710193@students.com");
        System.out.println("Email : "+ view.getEmail());

        when(view.getPassword()).thenReturn("swo");
        System.out.println("Password : "+view.getPassword());

        presenter.onProfilClicked();
        verify(view).showPasswordError("The password must be at least 6 characters.");
    }

    @Test
    public void shouldShowErrorMessageWhenKotaAsalIsEmpty() throws Exception {
        System.out.println("\n\nTest Case Kota Asal empty\n");
        when(view.getEmail()).thenReturn("190710193@students.com");
        System.out.println("Email : "+ view.getEmail());

        when(view.getPassword()).thenReturn("swoosh");
        System.out.println("Password : "+view.getPassword());

        when(view.getKotaAsal()).thenReturn("");
        System.out.println("Kota Asal : "+view.getKotaAsal());

        presenter.onProfilClicked();
        verify(view).showKotaAsalError("Atribut kota Asal tidak boleh kosong.");

    }

    @Test
    public void shouldShowErrorMessageWhenKotaAsalIsNot2Words() throws Exception {
        System.out.println("\n\nTest Case Kota Asal tidak 2 kata (regexAlpha2Words)\n");
        when(view.getEmail()).thenReturn("190710193@students.com");
        System.out.println("Email : "+ view.getEmail());

        when(view.getPassword()).thenReturn("swoosh");
        System.out.println("Password : "+view.getPassword());

        when(view.getKotaAsal()).thenReturn("Denpasar");
        System.out.println("Kota Asal : "+view.getKotaAsal());

        presenter.onProfilClicked();
        verify(view).showKotaAsalError("Format kota asal tidak sesuai aturan");
    }


}