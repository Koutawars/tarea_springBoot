package com.example.tarea.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ClientService {
	private ArrayList<Client> clients = new ArrayList<>();

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void addClient(Client client) {
		this.clients.add(client);
	}
	
}
