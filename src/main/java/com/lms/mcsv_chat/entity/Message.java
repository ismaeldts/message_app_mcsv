package com.lms.mcsv_chat.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MESSAGES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Message {

  @Id
  private String id;
  private UUID senderId;
  private UUID receiverId;
  private String status; // WAITING, SEEN, UPDATED, SEND, DELETED,
  private String content;
  private Boolean isSeen; // 0 | 1
  private LocalDateTime sendDate; // PUBLICATION DATE
  private LocalDateTime updatedDate;
  private LocalDateTime deleteDate;

}
