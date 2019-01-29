import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-confirmation-modal',
  templateUrl: './confirmation-modal.component.html',
  styleUrls: ['./confirmation-modal.component.scss']
})
export class ConfirmationModalComponent implements OnInit {
  @Input() item;
  @Output() emitCloseModal = new EventEmitter<any>();
  @Output() deleteProject = new EventEmitter<any>();

  constructor() { }

  ngOnInit() {
  }

}
