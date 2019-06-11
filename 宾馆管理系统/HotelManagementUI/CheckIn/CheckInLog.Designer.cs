namespace HotelManagementUI.CheckIn
{
    partial class CheckInLog
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.ROOM_NAME = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.NAME = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ID_CARD = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.STATE = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.IN_TIME = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.OUT_TIME = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.ROOM_NAME,
            this.NAME,
            this.ID_CARD,
            this.STATE,
            this.IN_TIME,
            this.OUT_TIME});
            this.dataGridView1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridView1.Location = new System.Drawing.Point(0, 0);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(674, 281);
            this.dataGridView1.TabIndex = 0;
            // 
            // ROOM_NAME
            // 
            this.ROOM_NAME.DataPropertyName = "ROOM_NAME";
            this.ROOM_NAME.HeaderText = "房间名";
            this.ROOM_NAME.Name = "ROOM_NAME";
            this.ROOM_NAME.Width = 50;
            // 
            // NAME
            // 
            this.NAME.DataPropertyName = "NAME";
            this.NAME.HeaderText = "用户姓名";
            this.NAME.Name = "NAME";
            this.NAME.Width = 50;
            // 
            // ID_CARD
            // 
            this.ID_CARD.DataPropertyName = "ID_CARD";
            this.ID_CARD.HeaderText = "用户身份证号";
            this.ID_CARD.Name = "ID_CARD";
            this.ID_CARD.Width = 150;
            // 
            // STATE
            // 
            this.STATE.DataPropertyName = "STATE";
            this.STATE.HeaderText = "当前状态";
            this.STATE.Name = "STATE";
            this.STATE.Width = 80;
            // 
            // IN_TIME
            // 
            this.IN_TIME.DataPropertyName = "IN_TIME";
            this.IN_TIME.HeaderText = "入住时间";
            this.IN_TIME.Name = "IN_TIME";
            this.IN_TIME.Width = 150;
            // 
            // OUT_TIME
            // 
            this.OUT_TIME.DataPropertyName = "OUT_TIME";
            this.OUT_TIME.HeaderText = "退房时间";
            this.OUT_TIME.Name = "OUT_TIME";
            this.OUT_TIME.Width = 150;
            // 
            // CheckInLog
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(674, 281);
            this.Controls.Add(this.dataGridView1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "CheckInLog";
            this.Text = "住房记录";
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.DataGridViewTextBoxColumn ROOM_NAME;
        private System.Windows.Forms.DataGridViewTextBoxColumn NAME;
        private System.Windows.Forms.DataGridViewTextBoxColumn ID_CARD;
        private System.Windows.Forms.DataGridViewTextBoxColumn STATE;
        private System.Windows.Forms.DataGridViewTextBoxColumn IN_TIME;
        private System.Windows.Forms.DataGridViewTextBoxColumn OUT_TIME;
    }
}