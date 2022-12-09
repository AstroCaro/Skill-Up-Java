package com.alkemy.wallet.util;

import com.alkemy.wallet.dto.RequestUserDto;
import com.alkemy.wallet.listing.RoleName;
import com.alkemy.wallet.model.Role;
import com.alkemy.wallet.repository.IUserRepository;
import com.alkemy.wallet.service.CustomUserDetailsService;
import com.alkemy.wallet.service.interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private IRoleService roleService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomUserDetailsService userService;

    @Autowired
    private IUserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        Role role;
        role = Role.builder()
                .name(RoleName.ROLE_ADMIN).build();
        roleService.createRole(role);

        role = Role.builder()
                .name(RoleName.ROLE_USER).build();
        roleService.createRole(role);

        /* ROLE_USER */

        RequestUserDto user;

        user = RequestUserDto.builder()
                .firstName("Gonzalo")
                .lastName("Montiel")
                .email("cachete@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Nahuel")
                .lastName("Molina")
                .email("negro@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Nicolás ")
                .lastName("Otamendi")
                .email("elgeneral@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Rodrigo")
                .lastName("De Paul")
                .email("pollo@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Emiliano")
                .lastName("Martinez")
                .email("dibu@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Cristian")
                .lastName("Romero")
                .email("cuti@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Lisandro")
                .lastName("Martinez")
                .email("lisandro@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Marcos")
                .lastName("Acuña")
                .email("huevo@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Alexis")
                .lastName("Mac Allister ")
                .email("macallister@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        user = RequestUserDto.builder()
                .firstName("Enzo")
                .lastName("Fernandez")
                .email("enzo@gmail.com")
                .password("password")
                .build();
        userService.save(user);

        /* ROLE_ADMIN */
    }
}
