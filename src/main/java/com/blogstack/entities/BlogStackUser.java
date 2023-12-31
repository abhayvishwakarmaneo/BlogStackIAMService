package com.blogstack.entities;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blogstack_user", schema = "iam_management")
public class BlogStackUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bsu_seq_id")
    private Long bsuSeqId;

    @Column(name = "bsu_user_id")
    private String bsuUserId;

    @Column(name = "bsu_password")
    private String bsuPassword;

    @Column(name = "bsu_email_id")
    private String bsuEmailId;

    @Column(name = "bsu_last_name")
    private String bsuLastName;

    @Column(name = "bsu_middle_name")
    private String bsuMiddleName;

    @Column(name = "bsu_first_name")
    private String bsuFirstName;

    @Column(name = "bsu_gender")
    private String bsuGender;

    @Column(name = "bsu_phone_number")
    private String bsuPhoneNumber;


    @Column(name = "bsu_status")
    private String bsuStatus;

    @Column(name = "bsu_date_of_birth")
    private LocalDate bsuDateOfBirth;

    @Column(name = "bsu_address")
    private String bsuAddress;

    @Column(name = "bsu_profile_photo")
    private String bsuProfilePhoto;

    @CreatedBy
    @Column(name = "bsu_created_by")
    private String bsuCreatedBy;

    @CreatedDate
    @Column(name = "bsu_created_date")
    private LocalDateTime bsuCreatedDate;

    @LastModifiedBy
    @Column(name = "bsu_modified_by")
    private String bsuModifiedBy;

    @LastModifiedDate
    @Column(name = "bsu_modified_date")
    private LocalDateTime bsuModifiedDate;
}
