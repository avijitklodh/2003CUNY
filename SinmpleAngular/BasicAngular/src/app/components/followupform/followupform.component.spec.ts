import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FollowupformComponent } from './followupform.component';

describe('FollowupformComponent', () => {
  let component: FollowupformComponent;
  let fixture: ComponentFixture<FollowupformComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FollowupformComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FollowupformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
