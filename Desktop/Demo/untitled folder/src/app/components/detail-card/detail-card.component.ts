import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-detail-card',
  templateUrl: './detail-card.component.html',
  styleUrls: ['./detail-card.component.scss']
})
export class DetailCardComponent implements OnInit {
  @Input() item;
  @Output() emitShowDetails = new EventEmitter<any>();
  @Output() emitDeleteItem = new EventEmitter<any>();

  constructor() { }

  ngOnInit() {
  }

}
