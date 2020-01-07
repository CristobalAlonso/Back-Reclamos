package com.resilencia.service;

import com.resilencia.model.Login;

public interface ILoginService {
	Login saveLogin(Login login);
	Login findById(long id);
}
